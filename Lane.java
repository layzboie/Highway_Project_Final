package Highway;

import static Highway.Highway.allExits;

public class Lane {
    Queue lane = new Queue();

    int laneNumber;

    enum congestionLevel{
        notCongested,
        moderateCongestion,
        highlyCongested;
    }

    public Lane(int laneNumber){
        this.laneNumber = laneNumber;
    }

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
        //this should work, but i could not figure out how to test it
        while (i < carNumber){
            Car car = new Car(allExits); //creates a car
            lane.enqueue(car); //adds cars to the lane
            i++; //used to make sure loop eventually ends
        }

    }

}
