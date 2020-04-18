import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Item i = new ItemImpl1();
        // 依赖注入点
        // Store s = new Store(i);
        
        // Item i = context.getBean("item1", ItemImpl1.class);
        
        Store s = context.getBean("store", Store.class);

        System.out.println("依赖注入:");
        System.out.println(s);
    }
}