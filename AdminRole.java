package BackEnd;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminRole {

    private final Database<Trainer> database;

    public AdminRole(String filename) throws IOException {
        database = new TrainerDatabase(filename);
        database.readFromFile(); 
    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer trainer = new Trainer(trainerId, name, email, specialty, phoneNumber);
        if (!database.contains(trainer.getSearchKey())) {
            database.insertRecord(trainer);
            JOptionPane.showMessageDialog(null, "Trainer added successfully.", "Done", JOptionPane.PLAIN_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Trainer Id already exists", "Done", JOptionPane.PLAIN_MESSAGE);

        }
        logout();
    }

    public ArrayList<Trainer> getListOfTrainers() {
        return database.returnAllRecords();
    }

    public void removeTrainer(String key) {
        if (database.contains(key)) {
            database.deleteRecord(key);
            JOptionPane.showMessageDialog(null, "Trainer deleted successfully.", "Done", JOptionPane.PLAIN_MESSAGE);

        } else {
                JOptionPane.showMessageDialog(null, "trainer ID not found", "ID not found", JOptionPane.PLAIN_MESSAGE);

        }
        logout();
    }

    public void logout() {
        database.saveToFile(); 
    }
}
