import com.huanfion.bean.Person;
import com.huanfion.config.MyConfig;
import com.huanfion.config.MyConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 11:12
 */
public class IOCTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test02(){
        System.out.println("容器创建完成前...");
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig2.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("容器创建完成后...");
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println("bean和bean2是否相同:"+(bean==bean2));
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig2.class);
        Environment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        String[] beanDefinitionNames = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test04(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig2.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        System.out.println("colorFactoryBean的类型是："+colorFactoryBean.getClass());
        Object colorFactoryBean1 = applicationContext.getBean("&colorFactoryBean");
        System.out.println("colorFactoryBean的本身类型是："+colorFactoryBean1.getClass());

    }


}
