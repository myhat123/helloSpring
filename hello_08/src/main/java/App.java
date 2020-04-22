import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mine.hello.QryDtlDao;
import com.mine.hello.QryDtl;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        QryDtlDao qry = context.getBean(QryDtlDao.class);
        System.out.println(qry.getCountOfQry());

        List<QryDtl> qryDtls = qry.getAllQryDtls();
        for (QryDtl x: qryDtls) {
            System.out.println(x);
        }
    }
}