package BackEnd;

import java.io.IOException;

public class MemberDatabase extends Database<Member> {
    public MemberDatabase(String memberFilename) throws IOException {
        super(memberFilename);
    }

    protected Member createRecordFrom(String line) {
        String[] data = line.split(",");
        return new Member(data[0], data[1], data[2], (data[3]), (data[4]),data[5]);
    }

    protected String getSearchKey(Member record) {
        return record.getSearchKey();
    }

    protected String lineRepresentation(Member record) {
        return record.lineRepresentation();
    }
}
