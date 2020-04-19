import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Item i = new ItemImpl1();
        // 依赖注入点
        // Store s = new Store(i);
        
        // Item i = context.getBean("item1", ItemImpl1.class);
        
        Store s = context.getBean("storeThroughConstructorInjection", Store.class);

        System.out.println("构造方法依赖注入:");
        System.out.println(s);

        Store s2 = context.getBean("storeThroughSetterInjection", Store.class);
        System.out.println("set方法依赖注入: ");
        System.out.println(s2);
    }
}