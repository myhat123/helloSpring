import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mine.hello.QryDtlDao;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        QryDtlDao qry = context.getBean(QryDtlDao.class);
        System.out.println(qry.getCountOfQry());
    }
}