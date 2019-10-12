import com.huanfion.bean.Person;
import com.huanfion.config.MyConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 17:14
 */
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfigOfPropertyValue.class);

    @Test
    public void test01() {
        printBeans(annotationConfigApplicationContext);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
        annotationConfigApplicationContext.close();

    }

    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
