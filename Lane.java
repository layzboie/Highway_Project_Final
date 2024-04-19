package Highway;

import java.util.List;
import java.util.Queue;

public class Lane extends Highway.Queue {

    int laneNumber;

    enum congestionLevel{
        notCongested,
        moderateCongestion,
        highlyCongested;
    }

    public Lane(int laneNumber){
        this.laneNumber = laneNumber;

    }
}
