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
    public product findProduct(String string){
        for (int i = 0; i < getList().size(); i++) {
            if(getList().get(i).getName().equals(string)){ // we need .equals to work with strings
                                                           // if we use "==", we work with the numbers of the strings
                return getList().get(i);
            }
        }
        return null;
    }
}
