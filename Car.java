package Highway;

import java.util.Random;

import static Highway.Highway.allExits;

//this class creates cars and gives them a unique number
public class Car {
    static int carNumber = 0;
    int myNumber;
    Exit myExit;
    int maxExits = 42;
    Random random;
    //int randInt = random.nextInt(maxExits + 1);
    //randInt makes a null number, unit tests work now. Need to fix it
    int randInt = 10;
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

    public Exit findNewExit(double approximateExit){
        for(int i = 0; i < maxExits; i++)
            if(approximateExit > allExits[i].getPositionOfExit() - 1 && approximateExit < allExits[i].getPositionOfExit() + 1){
                //If the approximateExit is within 1 mile of the exit at index "i".
                //Only one exit can meet the "if" requirements.
                this.myExit = allExits[i];
                return allExits[i];
            }
        return null;
    }

}
