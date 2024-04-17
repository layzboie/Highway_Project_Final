package Highway;

import java.util.Random;
//this class will contain both a normal and exponential distribution
abstract class Distribution {
    abstract double sample();
}


class NormalDistribution extends Distribution {
    private double mean; //the peak of the curve (graph form)
    //the mean is the expected value
    private double standardDeviation; //how the curve stretches
    //the standard deviation is how much the result can stray from the expected value
    //generates 30 random numbers while adding them together
    public double random (){
        int loopDuration = 30;
        double sum = 0.0;
        int i = 0;
        while (i < 30){
            sum += Math.random();
            i++;
        }
        return sum;
    }
//generates an approximate normal distribution (from course notes)
    public double sample(){
        return mean + standardDeviation * ((random() - (30/2))/Math.sqrt(12 * 30));
    }
//setters for the mean and standard deviation
    public void setMean(double mean) {
        this.mean = mean;
    }

    public void setStandardDeviation(double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }
}

//this class generates numbers from an exponential distribution
class ExponentialDistribution extends Distribution {
    private double lambda;
    private Random random;
    public double sample(){
        return (-(1.0/lambda)*Math.log(random.nextDouble()));
    }


    public ExponentialDistribution(double lam){
        lambda = lam;
        random = new Random();
    }
//allows lambda to be changed
    public void setLambda(double lambda) {
        this.lambda = lambda;
    }
}