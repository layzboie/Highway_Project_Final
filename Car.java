package Highway;
import java.util.Random;
//this class creates cars and gives them a unique number
public class Car {
    static int carNumber = 0;
    int myNumber;
    Exit myExit;
    int maxExits = 42;
    Random random;
    int randInt = random.nextInt(maxExits + 1);
    double arrivalTime = Double.MAX_VALUE;
    //this method adds 1 to the previously given car number to give each car a unique number
    public Car (Exit[] allExits){
        myNumber = carNumber++;
        myExit = allExits[randInt];

    }
//this toString allows you to print the cars for testing
    @Override
    public String toString() {
        return "Car" + " " + myNumber;
    }
}
