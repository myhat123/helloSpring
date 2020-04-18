
public class Store {
    private Item item;
  
    public Store() {
        item = new ItemImpl1();    
    }

    public String toString() {
        return "在构造函数 Store() 中使用 new ItemImpl1() 初始化 item";
    }
}