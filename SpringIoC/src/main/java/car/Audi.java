package car;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午9:56
 */
public class Audi implements Car {
    public void start() {
        System.out.println("audi.start");
    }

    public void turnLeft() {
        System.out.println("audi.turnLeft");
    }

    public void turnRight() {
        System.out.println("audi.turnRight");
    }

    public void stop() {
        System.out.println("audi.stop");
    }
}
