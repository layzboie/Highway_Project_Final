package Highway;

import static Highway.Highway.allExits;

public class Road {
    Road lastRoad;
    Road nextRoad;
    private double startOfRoad;
    private double endOfRoad;
    private Exit segmentExit;
    int totalCarCount;
    boolean doesRoadHaveMyExit;
    Car carBeingTracked = new Car(allExits);
    NormalDistribution serviceTime = new NormalDistribution();
    // work on arrival process - if it generates x - add x many cars to lane
    // make simulation an array of roads
    if(roadContainsExit){
        shiftToRightLane()
        for each(laneShifted){
            addTickToTIme;
        }
    }

    public Road(Exit segmentExit){
        this.segmentExit = segmentExit;
        //Roads/segments could be linked through "next" and "last" pointers.
        startOfRoad = lastRoad.endOfRoad;
        endOfRoad = segmentExit.getPositionOfExit();
        //Road ends at the positionOfExit.

    }

}
