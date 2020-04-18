
public class App {
    public static void main(String[] args) {
        
        Item i = new ItemImpl1();
        //依赖注入点
        Store s = new Store(i);

        System.out.println("依赖注入:");
        System.out.println(s);
    }
}