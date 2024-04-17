package Highway;

//this class creates cars and gives them a unique number
public class Car {
    static int carNumber = 0;
    int myNumber;
    double arrivalTime = Double.MAX_VALUE;
    //this method adds 1 to the previously given car number to give each car a unique number
    public Car (){
        myNumber = carNumber++;
    }
//this toString allows you to print the cars for testing
    @Override
    public String toString() {
        return "Car" + " " + myNumber;
    }
}
