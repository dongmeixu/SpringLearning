package human;

import car.Car;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午9:59
 */
public abstract class HumanWithCar implements Human{
    protected Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }

    /**
     * 每个人回家的方式都是不一样的，
     * 所以这块不需要实现
     */
    public abstract void goHome();
}
