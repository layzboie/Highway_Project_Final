//addCars now resides in the lane class
//This class is no longer used

package Highway; //what is this? what does it do?
public class ArrivalProcess {
    NormalDistribution arrivalDistribution = new NormalDistribution();
//add cars will be used to add cars to the lanes
    //add cars will take in a mean and standard deviation
public void addCars(double mean, double standardDeviation){
    arrivalDistribution.setMean(mean);
    arrivalDistribution.setStandardDeviation(standardDeviation);

    //rounds the generated number so a full (non-decimal) number of cars is added
    double carNumber = Math.round(arrivalDistribution.sample());

    int i = 0;//loop variable
//loop to add a certain number of cars to a lane
    while (i < carNumber){
        Car car;
        //will need some way to enqueue cars to all lanes in a section
        //and for every section. May want to call add cars for every lane
        //For example: rightLane.addCars(mean, standardDeviation); (and so on)
        //Will want to do this for every section
        i++;
    }

}

}
