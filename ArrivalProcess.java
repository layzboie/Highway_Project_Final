package Highway;

public class ArrivalProcess {
    NormalDistribution arrivalDistribution = new NormalDistribution();

    public int time = 0;//placeholder for the clock

    public double nextArrivalTime;
public Car nextCar(Exit[] allExits){
    //sets up how often cars will enter the road
    arrivalDistribution.setMean(5);
    arrivalDistribution.setStandardDeviation(2);

    nextArrivalTime = time + arrivalDistribution.sample();
    //creates a car everytime nextArrival time is called
    Car car = new Car(allExits);
    car.arrivalTime = nextArrivalTime;
    return car;
}

}
