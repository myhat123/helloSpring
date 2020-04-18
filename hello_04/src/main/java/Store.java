
public class Store {
    private Item item;
  
    public Store(Item item) {
        this.item = item;    
    }

    public String toString() {
        return "在构造函数 Store() 中使用 Dependency Injection 初始化 item, " + this.item.toString();
    }
}