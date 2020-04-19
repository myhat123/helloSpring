
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Store {

    @Autowired
    @Qualifier("item1")
    private Item item;

    @Override
    public String toString() {
        return "Dependency Injection 初始化 item, " + this.item.toString();
    }
}