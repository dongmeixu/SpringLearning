/**
 * @author xudongmei
 * @data 2019/5/1
 * @time 上午10:06
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1. 实例化bean
 * 2. 保存bean
 * 3. 提供bean
 * 4. 每一个bean要产生一个唯一的id与之相对应
 */
public class IoCContainer {
    private Map<String, Object> beans = new ConcurrentHashMap<String, Object>();

    /**
     * 根据beanId获取一个Bean
     * @param beanId
     * @return
     */
    public Object getBeans(String beanId) {
        return beans.get(beanId);
    }

    /**
     * 委托 ioc 容器创建一个bean
     * @param clazz 要创建的bean的class
     * @param beanId beanId
     * @param paramBeanIds 要创建的bean的class的构造方法所需要的参数的beanIds
     */
    public void setBean(Class<?> clazz, String beanId, String... paramBeanIds) {
        // 1. 组装构造方法所需要的参数值
        Object[] paramValues = new Object[paramBeanIds.length];
        for (int i = 0; i < paramBeanIds.length; i++) {
            paramValues[i] = beans.get(paramBeanIds[i]);
        }
        // 2. 调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        if (bean == null) {
            throw new RuntimeException("找不到合适的构造方法去实例化bean");
        }
        // 3. 将实例化的bean放入beans
        beans.put(beanId, bean);
    }
}
