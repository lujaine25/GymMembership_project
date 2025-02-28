package BackEnd;
import java.time.LocalDate;

@SuppressWarnings("unused")
public class MemberClassRegistration {
    private final String memberID;
    private final String classID;
    private String status;
    private final LocalDate registrationDate;

    void setStatus(String status) {
        this.status = status;
    }
    LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public MemberClassRegistration (String memberID, String classID,LocalDate registrationDate,String status) {
        this.memberID = memberID;
        this.classID = classID;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public String getMemberID (){
        return memberID;
    }
    public String  getClassID () {
        return classID;
    }
    public  String  getSearchKey (){
        return memberID + classID;
    }
    public  String  lineRepresentation (){
        return memberID + "," + classID + "," + registrationDate + "," + status;
    }
}
