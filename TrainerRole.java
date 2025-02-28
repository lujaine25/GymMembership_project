package BackEnd;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class TrainerRole {
    private final Database<Member> memberDatabase;
    private final Database<Class> classDatabase;
    private final Database<MemberClassRegistration> registrationDatabase;


    public TrainerRole(String memberFilename, String classFilename, String registrationFilename) throws IOException {
    
        this.memberDatabase = new MemberDatabase(memberFilename);
        this.classDatabase = new ClassDatabase(classFilename);
        this.registrationDatabase = new MemberClassRegistrationDatabase(registrationFilename);

        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }


    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        Member member = new Member(memberID, name, membershipType, email, phoneNumber, status);
        if (!memberDatabase.contains(member.getSearchKey())) {
            memberDatabase.insertRecord(member);
            JOptionPane.showMessageDialog(null, "Member added successfully.", "Done", JOptionPane.PLAIN_MESSAGE);

        } else 
            JOptionPane.showMessageDialog(null, "member ID already exists", "Done", JOptionPane.PLAIN_MESSAGE);
        logout();
    }
    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) throws IOException {
        Class newClass = new Class(classID, className, trainerID, duration, maxParticipants);
        if (!classDatabase.contains(newClass.getSearchKey())) {
            classDatabase.insertRecord(newClass);
            JOptionPane.showMessageDialog(null, "Class Added Successfully!!", "Class Added", JOptionPane.PLAIN_MESSAGE);
        } else {
             JOptionPane.showMessageDialog(null, "class already exists!", "Duplicate Class", JOptionPane.PLAIN_MESSAGE);
        }
        logout();
        classDatabase.readFromFile();
    }


    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Class class1 = classDatabase.getRecord(classID);

        if (!memberDatabase.contains(memberID)) {
            JOptionPane.showMessageDialog(null, "Member ID doesnt exist", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        } else if (class1 == null) {
            JOptionPane.showMessageDialog(null, "Class doesnt exist", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        } else if (registrationDatabase.contains(memberID + classID)) {
            JOptionPane.showMessageDialog(null, "Member already registered for this class", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        }else if (class1.getAvailableSeats() == 0) {
            JOptionPane.showMessageDialog(null, "Class is full", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        }  else {
            class1.setAvailableSeats(class1.getAvailableSeats() - 1);
            MemberClassRegistration registration = new MemberClassRegistration(memberID, classID, LocalDate.now(), "Active");
            registrationDatabase.insertRecord(registration);
            JOptionPane.showMessageDialog(null, "Member registered successfully.", "Done", JOptionPane.PLAIN_MESSAGE);
            logout();
            return true;
        }
    }
    public boolean cancelRegistration(String memberID, String classID) {
        Class class2 = classDatabase.getRecord(classID);
        MemberClassRegistration registration = registrationDatabase.getRecord(memberID + classID);

        if (!memberDatabase.contains(memberID)) {
            JOptionPane.showMessageDialog(null, "Member ID doesnt exist", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        } else if (class2 == null) {
            JOptionPane.showMessageDialog(null, "Class doesnt exist", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        } else if (!registrationDatabase.contains(memberID + classID)) {
            JOptionPane.showMessageDialog(null, "Member not registered for this class", "Done", JOptionPane.PLAIN_MESSAGE);
            return false;
        } else {
            if (ChronoUnit.DAYS.between(registration.getRegistrationDate(),LocalDate.now()) > 3) {
            JOptionPane.showMessageDialog(null, "Cannot cancel registration for a class that has already started", "Done", JOptionPane.PLAIN_MESSAGE);
                return false;
            }
            class2.setAvailableSeats(class2.getAvailableSeats() + 1);
            registrationDatabase.deleteRecord(memberID + classID);
            JOptionPane.showMessageDialog(null, "Member registration canceled successfully", "Done", JOptionPane.PLAIN_MESSAGE);            
            logout();
            return true;
        }
    }


    public ArrayList<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }
    public ArrayList<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }
    public ArrayList<MemberClassRegistration> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }
}
