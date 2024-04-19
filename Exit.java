package Highway;

import java.sql.Time;

import static Highway.Highway.allExits;
import static Highway.Highway.maxExits;

public class Exit {
    private String nameOfExit;

    private Time timeOfExit;

    private final int ID;

    private double positionOfExit;

    public Exit(String name, double positionOfExit, int ID) {
        this.nameOfExit = name;
        this.positionOfExit = positionOfExit;
        this.ID = ID;
    }

    public String getNameOfExit() {
        return nameOfExit;
    }

    public void setNameOfExit(String nameOfExit) {
        this.nameOfExit = nameOfExit;
    }

    public void setTimeOfExit(Time timeOfExit){
        this.timeOfExit = timeOfExit;
    }

    public Time getTimeOfExit(){
        return timeOfExit;
    }
    public double getPositionOfExit(){ return positionOfExit; }



}
