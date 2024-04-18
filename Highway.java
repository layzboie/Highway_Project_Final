package Highway;
import java.util.ArrayList;

public class Highway {
    public static int maxExits = 43;
    public static int maxLanes = 3;
    private Lane[] lanes = new Lane[maxLanes - 1];//Need one less slot because 0 is an array slot.
    public static Exit[] allExits = new Exit[maxExits - 1];//Need one less slot because 0 is an array slot.
    final private double highwayLength = 91.85;

    // In many cases, a single ramp or interchange can serve both functions, allowing vehicles to both exit and enter the highway at the same location.

    // Interstate 70 (I-70) in Maryland varies in the number of lanes along different sections of the highway. Generally, I-70 in Maryland has two to three lanes in each direction, but this can vary in urban areas and near major interchanges.

    // There are 40 exits, distance between each exit approx 2.296 miles; 91.85 (length of maryland i70) / # of exits 40 = 2.296 distance per exit

    public Highway(){
        allExits[0] = new Exit("Exit 1A",2.296, 0);
        allExits[1] = new Exit("Exit 3",4.592, 1);
        allExits[2] = new Exit("Exit 5",6.888, 2);
        allExits[3] = new Exit("Exit 1A",9.184, 3);
        allExits[4] = new Exit("Exit 9",11.480, 4);
        allExits[5] = new Exit("Exit 12",13.776, 5);
        allExits[6] = new Exit("Exit 18",16.072, 6);
        allExits[7] = new Exit("Exit 24",18.368, 7);
        allExits[8] = new Exit("Exit 4",20.664, 8);
        allExits[9] = new Exit("Exit 18",16.072, 9);
        allExits[10] = new Exit("Exit 24",18.368, 10);
        allExits[11] = new Exit("Exit 4",20.664, 11);
        allExits[12] = new Exit("Exit 1A",22.960, 12);
        allExits[13] = new Exit("Exit 28",25.256, 13);
        allExits[14] = new Exit("Exit 1A",27.552, 14);
        allExits[15] = new Exit("Exit 29A",29.848, 15);
        allExits[16] = new Exit("Exit 29B",32.144, 16);
        allExits[17] = new Exit("Exit 1A",34.440, 17);
        allExits[18] = new Exit("Exit 32A",36.736, 18);
        allExits[19] = new Exit("Exit 32B",39.032, 19);
        allExits[20] = new Exit("Exit 35",41.328, 20);
        allExits[21] = new Exit("South Mountain Welcome Center",43.624, 21);
        allExits[22] = new Exit("Exit 42",45.920, 22);
        allExits[23] = new Exit("Exit 48",48.216, 23);
        allExits[24] = new Exit("Exit 52A",50.512, 24);
        allExits[25] = new Exit("Exit 52B",52.808, 25);
        allExits[26] = new Exit("Exit 53",55.104, 26);
        allExits[27] = new Exit("Exit 54",57.400, 27);
        allExits[28] = new Exit("Exit 55",59.696, 28);
        allExits[29] = new Exit("Exit 56",61.992, 29);
        allExits[30] = new Exit("Exit 62",64.288, 30);
        allExits[31] = new Exit("Weigh Station",66.584, 31);
        allExits[32] = new Exit("Parking Station",68.880, 32);
        allExits[33] = new Exit("Exit 68",71.176, 33);
        allExits[34] = new Exit("Exit 73",73.472, 34);
        allExits[35] = new Exit("Exit 76",75.768, 35);
        allExits[36] = new Exit("Exit 80",78.064, 36);
        allExits[37] = new Exit("Exit 82",80.360, 37);
        allExits[38] = new Exit("Exit 87A",82.656, 38);
        allExits[39] = new Exit("Exit 87B",84.952, 39);
        allExits[40] = new Exit("Exit 68",87.248, 40);
        allExits[41] = new Exit("Exit 91B-A",89.544, 41);
        allExits[42] = new Exit("Exit 94",91.85, 42);
        lanes[0] = new Lane(1);
        lanes[1] = new Lane(2);
        lanes[2] = new Lane(3);

    }


}
