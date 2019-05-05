import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author xudongmei
 * @data 2019/5/5
 * @time 下午1:00
 */
public class Bean implements InitializingBean, DisposableBean {
    public void onInit() {
        System.out.println("Bean.onInit");
    }

    public void onDestory() {
        System.out.println("Bean.onDestory");
    }

    public void destroy() throws Exception {

        System.out.println("Bean.destroy");
    }

    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean.afterPropertiesSet");

    }
}
