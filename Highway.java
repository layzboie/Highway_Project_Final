package Highway;
import java.util.ArrayList;

public class Highway {

    private ArrayList<Lane> lanes = new ArrayList<Lane>();
    private ArrayList<Exit> exits = new ArrayList<Exit>();
    final private double highwayLength = 91.85;

    // In many cases, a single ramp or interchange can serve both functions, allowing vehicles to both exit and enter the highway at the same location.

    // Interstate 70 (I-70) in Maryland varies in the number of lanes along different sections of the highway. Generally, I-70 in Maryland has two to three lanes in each direction, but this can vary in urban areas and near major interchanges.

    // There are 40 exits, distance between each exit approx 2.296 miles; 91.85 (length of maryland i70) / # of exits 40 = 2.296 distance per exit

    public Highway(){
        exits.add(new Exit("Exit 1A",2.296));
        exits.add(new Exit("Exit 3",4.592));
        exits.add(new Exit("Exit 5",6.888));
        exits.add(new Exit("Exit 1A",9.184));
        exits.add(new Exit("Exit 9",11.480));
        exits.add(new Exit("Exit 12",13.776));
        exits.add(new Exit("Exit 18",16.072));
        exits.add(new Exit("Exit 24",18.368));
        exits.add(new Exit("Exit 4",20.664));
        exits.add(new Exit("Exit 1A",22.960));
        exits.add(new Exit("Exit 28",25.256));
        exits.add(new Exit("Exit 1A",27.552));
        exits.add(new Exit("Exit 29A",29.848));
        exits.add(new Exit("Exit 29B",32.144));
        exits.add(new Exit("Exit 1A",34.440));
        exits.add(new Exit("Exit 32A",36.736));
        exits.add(new Exit("Exit 32B",39.032));
        exits.add(new Exit("Exit 35",41.328));
        exits.add(new Exit("South Mountain Welcome Center",43.624));
        exits.add(new Exit("Exit 42",45.920));
        exits.add(new Exit("Exit 48",48.216));
        exits.add(new Exit("Exit 52A",50.512));
        exits.add(new Exit("Exit 52B",52.808));
        exits.add(new Exit("Exit 53",55.104));
        exits.add(new Exit("Exit 54",57.400));
        exits.add(new Exit("Exit 55",59.696));
        exits.add(new Exit("Exit 56",61.992));
        exits.add(new Exit("Exit 62",64.288));
        exits.add(new Exit("Weigh Station",66.584));
        exits.add(new Exit("Parking Station",68.880));
        exits.add(new Exit("Exit 68",71.176));
        exits.add(new Exit("Exit 73",73.472));
        exits.add(new Exit("Exit 76",75.768));
        exits.add(new Exit("Exit 80",78.064));
        exits.add(new Exit("Exit 82",80.360));
        exits.add(new Exit("Exit 87A",82.656));
        exits.add(new Exit("Exit 87B",84.952));
        exits.add(new Exit("Exit 68",87.248));
        exits.add(new Exit("Exit 91B-A",89.544));
        exits.add(new Exit("Exit 94",91.85));
        lanes.add(new Lane(1));
        lanes.add(new Lane(2));
        lanes.add(new Lane(3));

    }


}
