package BackEnd;

import java.io.IOException;

public class ClassDatabase extends Database<Class> {

    public ClassDatabase(String filename) throws IOException {
        super(filename);
    }

    protected Class createRecordFrom(String line) {
        String[] data = line.split(",");
        return new Class(data[0], data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]));
    }

    protected String getSearchKey(Class record) {
        return record.getSearchKey();
    }

    protected String lineRepresentation(Class record) {return record.lineRepresentation();}


}

