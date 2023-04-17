import java.util.ArrayList;
import java.util.List;


public class vendingMachine {
    List<product> list = new ArrayList<>();
    public vendingMachine addProduct(product product) {
        list.add(product);
        return this;                // returns the object we are talking about
    }
    public List<product> getList(){
        return list;
    }
}
