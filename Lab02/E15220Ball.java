import static java.lang.Math.*;

public class E15220Ball {

    public static void main(String[] args) {
        Ball b1=new Ball(0.0, 1.0, 10.0, 45.0);
        Ball.updateTime(5.0);
        Ball b2=new Ball(0.0, 1.0, 20.0, 45.0);
        Ball.updateTime(5.0);
        System.out.println("B1 and B2 "+b1.willCollide(b2));
        Ball b3=new Ball(-10.0, 5.0, 3.0, 30.0);
        Ball.updateTime(20.0);
        System.out.println("B2 and B3 "+b2.willCollide(b3));
    }
    
}

class Ball {

    private double x;
    private double y;
    private double speed;
    private double angleOfSpeedWithX;
    private static double globalTime = 0;
    private double initialTime;
    
    Ball(double x, double y, double speed, double angle){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.angleOfSpeedWithX = angle;
        this.initialTime=globalTime;     //Here store object created time
    }
    
    protected static void updateTime(double t){
        globalTime += t;
    }
    
    protected String willCollide(Ball b1){
        double xPositionOfb1 = b1.x + b1.speed*cos(b1.angleOfSpeedWithX)*(globalTime-b1.initialTime);
        double yPositionOfb1 = b1.y + b1.speed*sin(b1.angleOfSpeedWithX)*(globalTime-b1.initialTime);
        double xPositionOfb2 = this.x + this.speed*cos(this.angleOfSpeedWithX)*(globalTime-this.initialTime);
        double yPositionOfb2 = this.y + this.speed*sin(this.angleOfSpeedWithX)*(globalTime-this.initialTime);
        if(xPositionOfb1==xPositionOfb2 && yPositionOfb1==yPositionOfb2){
            return "will collide";
        }else{
            return "won't collide";
        }
    }
    
}
