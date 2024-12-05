package ClassAct15;

public class Drive {
    private int distance;
    private int speed;
    private int duration;
    private Cars carUsed;
    public Drive(int dist, int sp, int dur, Cars carUsed) {
        this.distance = dist;
        this.speed = sp;
        this.duration = dur;
        this.carUsed = carUsed;
    }
    public void print(){
        System.out.println("Distance: " + distance);
        System.out.println("Speed: " + speed);
        System.out.println("Duration: " + duration);
        System.out.println("Now printing the car used: \n\n");
        carUsed.print();
    }
}
