import com.huanfion.config.MyConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 10:46
 */

public class IOCTest_LiftCycle {
    @Test
    public void test01(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext annotationApplication = new AnnotationConfigApplicationContext(MyConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
        Object car = annotationApplication.getBean("car");
        annotationApplication.close();
        System.out.println("容器销毁完成...");
    }
    @Test
    public void test02(){
        AnnotationConfigApplicationContext annotationApplication = new AnnotationConfigApplicationContext(MyConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
        annotationApplication.close();
        System.out.println("容器销毁完成...");
    }
}
