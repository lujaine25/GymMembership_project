package BackEnd;
import java.io.File;

@SuppressWarnings("unused")
public class isValid {



    public static boolean isFilename(String filename) {
        File file = new File(filename);
        return file.exists() && file.isFile();
    }

    public static boolean isMemberId(String memberId) {
        return memberId != null && memberId.matches("M\\d+");
    }

    public static boolean isTrainerId(String trainerId) {
        return trainerId != null && trainerId.matches("T\\d+");
    }

    public static boolean isClassId(String classId) {
        return classId != null && classId.matches("C\\d+");
    }

    public static boolean isEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{11}");
    }

    public static boolean isName(String name) {
        return name != null && name.matches("[A-Za-z ]+");
    }

    public static boolean isDuration(int duration) {
        return duration > 0;
    }

    public static boolean isAvailableSeats(int availableSeats) {
        return availableSeats > 0;
    }

    public static boolean isMembershipType(String str){
        return str.equalsIgnoreCase("monthly") || str.equalsIgnoreCase("yearly") || str.equalsIgnoreCase("premium");
    }
    public static boolean isStatus(String str){
        return str.equalsIgnoreCase("active") || str.equalsIgnoreCase("inactive") || str.equalsIgnoreCase("canceled");
    }    
    
}
