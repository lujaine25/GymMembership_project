package BackEnd;
@SuppressWarnings("unused")
public class Class {
    private final String classID;
    private final String className;
    private final String trainerID;
    private final int duration;
    private int availableSeats;

    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats (){
        return availableSeats;
    }
    public void setAvailableSeats (int availableSeats){
        this.availableSeats = availableSeats;
    }
    public String lineRepresentation ()
    {return classID + "," + className + "," + trainerID + "," + duration + "," + availableSeats;}
    public String  getSearchKey (){
        return classID;
    }

}
