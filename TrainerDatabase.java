package BackEnd;

import java.io.IOException;

public class TrainerDatabase extends Database<Trainer> {
    public TrainerDatabase(String filename) throws IOException {
        super(filename);
    }

    @Override
    protected Trainer createRecordFrom(String line) {
        String[] data = line.split(",");
        return new Trainer(data[0], data[1], data[2], (data[3]), (data[4]));
    }

    @Override
    protected String getSearchKey(Trainer record) {
        return record.getSearchKey();
    }

    @Override
    protected String lineRepresentation(Trainer record) {
        return record.lineRepresentation();
    }
}
