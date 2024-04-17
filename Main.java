package Highway;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Please work"); //Tylers test

        //unit test variables
        int[]fails = new int[6];
        int failCount = 0;
        //creating some jobs
        Car car0 = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        //this creates the queue
        Queue queue = new Queue();
        //adds jobs to queue
        queue.enqueue(car0);
        queue.enqueue(car1);
        //tests to see if there are 2 nodes in the queue
        if (queue.nodeCount != 2){
            fails[failCount] =1;//this would indicate that this test (test 1) failed
            failCount++;
        }
        //makes sure there is only one node left
        queue.dequeue();
        if (queue.nodeCount != 1){
            fails[failCount] = 2;
            failCount++;
        }
        //tests to see if job0 was removed
        if (queue.getHead().car.equals(car1) && queue.getTail().car.equals(car1)){

        }
        else {
            fails[failCount] = 2;
            failCount++;
        }
        //emptys the queue
        queue.dequeue();
        //the queue should be empty
        if (queue.nodeCount != 0){
            fails[failCount] = 3;
            failCount++;
        }

        queue.enqueue(car2);
        //make sure you can still add to the queue
        if (queue.nodeCount != 1){
            fails[failCount] = 4;
            failCount++;
        }

        //makes sure the node is the job2 node
        if (queue.getHead().car.equals(car2) && queue.getTail().car.equals(car2)){

        }
        else {
            fails[failCount] = 5;
            failCount++;
        }

        //test for normal distribution
        NormalDistribution test =new NormalDistribution();
        test.setMean(10.0);
        test.setStandardDeviation(5.0);
        if (test.sample() < 5 || test.sample() > 15){
            fails[failCount] = 6;
            failCount++;
        }

//prints the number of tests failed, and which tests failed
        System.out.println(failCount + " tests failed");
        for (int i = 0; i < failCount; i++) {
            System.out.println("test " + fails[i] + " failed");
        }




    }
}
