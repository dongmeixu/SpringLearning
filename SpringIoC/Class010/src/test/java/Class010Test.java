import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 下午2:15
 */
public class Class010Test {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("context已经被创建");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean = " + bean);

    }
}
