package Highway;
import static Highway.Highway.allExits;

public class Road {
    Road lastRoad;
    Road nextRoad;
    private double startOfRoad;
    private double endOfRoad;
    private Exit roadExit;
    int totalCarCount;
    public static int roadCount = 0;
    int roadID;
    boolean doesRoadHaveMyExit;
    public static int maxLanes = 3;
    private Lane[] lanes = new Lane[maxLanes - 1];//Need one less slot because 0 is an array slot.


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

    public Road(Exit roodExit){
        roadExit = roodExit;
        roadID = roadCount;
        roadCount++;
        //Roads/segments could be linked through "next" and "last" pointers.
        startOfRoad = lastRoad.endOfRoad;
        endOfRoad = roadExit.getPositionOfExit();
        //Road ends at the positionOfExit.

        lanes[0] = new Lane(1);
        lanes[1] = new Lane(2);
        lanes[2] = new Lane(3);

    }

}
