import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午11:16
 */
public class Class006Test {
    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean.getStringList(): " + bean.getStringList());
        System.out.println("bean.getAnotherBeanList(): " + bean.getAnotherBeanList());
        System.out.println("bean.getStringSet(): " + bean.getStringSet());
        System.out.println("bean.getAnotherBeanSet(): " + bean.getAnotherBeanSet());
        System.out.println("bean.getStringMap(): " + bean.getStringMap());
        System.out.println("bean.getAnotherBeanMap(): " + bean.getAnotherBeanMap());
        System.out.println("bean.getProperties(): " + bean.getProperties());
        System.out.println("bean.getAnotherBean2(): " + bean.getAnotherBean2());

    }
}
