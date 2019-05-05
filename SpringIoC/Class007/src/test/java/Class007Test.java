import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 下午1:17
 */
public class Class007Test {
    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean2 bean2_1 = context.getBean("bean2", Bean2.class);
        System.out.println(bean2_1);
        Bean2 bean2_2 = context.getBean("bean2", Bean2.class);
        System.out.println(bean2_2);

        Bean1 bean1_1 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1_1);
        Bean1 bean1_2 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1_2);

        /*ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
        Bean2 bean2_3 = context1.getBean("bean2", Bean2.class);
        System.out.println(bean2_3);
        Bean2 bean2_4 = context1.getBean("bean2", Bean2.class);
        System.out.println(bean2_4);
        Bean1 bean1_2 = context1.getBean("bean1", Bean1.class);
        System.out.println(bean1_2);*/

    }
}
