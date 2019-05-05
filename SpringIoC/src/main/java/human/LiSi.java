package human;

import car.Car;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午10:02
 */
public class LiSi extends HumanWithCar {
    public LiSi(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.stop();
    }
}
