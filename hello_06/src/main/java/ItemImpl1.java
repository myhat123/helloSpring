
public class ItemImpl1 implements Item {
    @Override
    public String toString() {
        return "Item接口实现类" + this.hashCode();
    }
}