
// import org.springframework.beans.factory.annotation.Autowired;

public class Store {

    // @Autowired
    private Item item;
  
    public Store() {}

    public Store(Item item) {
        this.item = item;    
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Dependency Injection 初始化 item, " + this.item.toString();
    }
}