package BackEnd;
@SuppressWarnings("unused")
public class Member {
    private final String memberID;
    private final String name;
    private final String membershipType;
    private final String email;
    private final String phoneNumber;
    private final String status;

    public Member (String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String lineRepresentation () {return memberID + "," + name + "," + membershipType + "," + email + "," + phoneNumber + "," + status;}
    public String getSearchKey (){
        return memberID;
    }
}
