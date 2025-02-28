package BackEnd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Database<T> {
    protected ArrayList<T> records;
    protected final String filename;


    public Database(String filename) throws IOException {
        this.filename = filename;
        this.records = new ArrayList<>();
        readFromFile(); 
    }

    
    public void readFromFile() throws IOException {
        records.clear();
        try {
            File file = new File(filename);
            if(!file.exists())
                file.createNewFile();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (!data.isEmpty()) {
                    T record = createRecordFrom(data);
                    if (record != null) records.add(record);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
        }
    }

    
    protected abstract T createRecordFrom(String line);


    public ArrayList<T> returnAllRecords() {
        return records;
    }

    
    public boolean contains(String key) {
        for (T record : records) {
            if (getSearchKey(record).equals(key)) {
                return true;
            }
        }
        return false;
    }

    
    protected abstract String getSearchKey(T record);

    
    public T getRecord(String key) {
        for (T record : records) {
            if (getSearchKey(record).equals(key)) {
                return record;
            }
        }
        return null;
    }


    public void insertRecord(T record) {
        if (!contains(getSearchKey(record))) {
            records.add(record);
            saveToFile();
        } else {
            System.out.println("member already registered for class");
        }
    }

    
    public void deleteRecord(String key) {
        for (T record : records) {
            if (getSearchKey(record).equals(key)) {
                records.remove(record);
                return;
            }
        }
        System.out.println("record not found");
    }

    
    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filename, false)) {
            for (T record : records) {
                writer.write(lineRepresentation(record) + "\n");
            }
        } catch (IOException e) {
            System.out.println("error saving file");
        }
    }

    
    protected abstract String lineRepresentation(T record);
}

