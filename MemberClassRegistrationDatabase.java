package BackEnd;
import java.io.IOException;
import java.time.LocalDate;

public class MemberClassRegistrationDatabase extends Database<MemberClassRegistration> {

    public MemberClassRegistrationDatabase(String registrationFilename) throws IOException {
        super(registrationFilename);
    }

    protected MemberClassRegistration createRecordFrom(String line) {
        String[] data = line.split(",");
        return new MemberClassRegistration(data[0], data[1], LocalDate.parse(data[2]), data[3]);
    }

    protected String getSearchKey(MemberClassRegistration record) {
        return record.getSearchKey();
    }

    protected String lineRepresentation(MemberClassRegistration record) {
        return record.lineRepresentation();
    }
}
