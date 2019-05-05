import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xudongmei
 * @data 2019/5/5
 * @time 下午12:59
 */
public class Class011Test {
    @Test
    public void test() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean = " + bean);
        context.close();

    }
}
