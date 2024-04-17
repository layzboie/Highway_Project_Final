package Highway;

public class Clock {
    int time;
    int tick = 6;//Time increase in seconds.

    //tick() methods can be used in loops to moderate time.
    public void tick(){
        time += tick;
    }

    public void tickMore(int amountOfTicks){//ticks a set amount.
        for(int i = 0; i < amountOfTicks; i++){
            tick();
        }
    }
    public int getTime(){
        return time;
    }
    Clock(){
        time = 0;
    }

}
