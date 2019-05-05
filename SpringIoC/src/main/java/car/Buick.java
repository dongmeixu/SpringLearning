package car;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午9:58
 */
public class Buick implements Car{

    public void start() {
        System.out.println("Buick.start");
    }

    public void turnLeft() {
        System.out.println("Buick.turnLeft");
    }

    public void turnRight() {
        System.out.println("Buick.turnRight");
    }

    public void stop() {
        System.out.println("Buick.stop");
    }
}

