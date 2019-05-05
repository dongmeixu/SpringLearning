/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 下午1:14
 */
public class Bean1 {
    private Bean2 bean2;

    public Bean2 getBean2() {
        return bean2;
    }

    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "bean2=" + bean2 +
                '}';
    }
}
