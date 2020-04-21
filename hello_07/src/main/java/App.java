import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mine.hello.FooService;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        FooService fooService = context.getBean(FooService.class);
        System.out.println(fooService.doStuff());
    }
}