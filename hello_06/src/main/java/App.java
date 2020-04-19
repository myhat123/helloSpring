import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Store s = context.getBean("store", Store.class);

        System.out.println("autowired依赖注入:");
        System.out.println(s);

        Store s0 = context.getBean("store0", Store.class);

        System.out.println("autowired依赖注入:");
        System.out.println(s0);
    }
}