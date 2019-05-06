import com.imooc.spring.ioc.class13.Bean1;
import com.imooc.spring.ioc.class13.Bean2;
import com.imooc.spring.ioc.class13.MyConfiguration;
import com.imooc.spring.ioc.class13.MyConfiguration1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xudongmei
 * @data 2019/5/6
 * @time 下午7:56
 */
public class Class013Test {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Bean1 bean1 = context.getBean("bean1" , Bean1.class);
        System.out.println("bean1 = " + bean1);
    }

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration1.class);
        Bean2 bean2 = context.getBean("BBBB" , Bean2.class);
        System.out.println("bean2 = " + bean2);
    }
}
