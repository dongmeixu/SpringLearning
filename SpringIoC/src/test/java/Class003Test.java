import car.Audi;
import car.Buick;
import com.sun.tools.corba.se.idl.constExpr.And;
import human.Human;
import human.LiSi;
import human.ZhangSan;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午10:20
 */
public class Class003Test {

    private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void before() {
        // 注册bean
        ioCContainer.setBean(Audi.class, "Audi");
        ioCContainer.setBean(Buick.class, "Buick");
        ioCContainer.setBean(ZhangSan.class, "ZhangSan", "Audi");
        ioCContainer.setBean(LiSi.class, "LiSi", "Buick");
    }
    @Test
    public void test() {
        Human zhangSan = (Human) ioCContainer.getBeans("ZhangSan");
        zhangSan.goHome();

        Human lisi = (Human) ioCContainer.getBeans("LiSi");
        lisi.goHome();
    }
}
