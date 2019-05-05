import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 下午2:15
 */
public class Class009Test {
    @Test
    public void test() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        for (int i = 0; i < 10; i++) {
            Bean bean = context.getBean("bean", Bean.class);
            System.out.println(bean);
        }
        System.out.println("********");
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Bean bean = context.getBean("bean", Bean.class);
                    System.out.println(bean);
                }
            }).start();
        }
    }
}
