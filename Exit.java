package Highway;

import java.sql.Time;

public class Exit {
    private String nameOfExit;

    private Time timeOfExit;

    private double positionOfExit;

    public Exit(String name, double positionOfExit) {
        this.nameOfExit = name;
        this.positionOfExit = positionOfExit;
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

}
