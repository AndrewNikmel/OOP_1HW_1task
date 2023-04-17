import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;


public class vendingMachine {

    List<product> list = new ArrayList<>();
    
    private int amount = 0;

    public vendingMachine addProduct(product product) {
        list.add(product);
        return this;                // returns the object we are talking about
    }
    public List<product> getList(){
        return list;
    }
    public int getAmount(){
        return amount;
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
    public product selProduct(product product){
        try{
            product prodFound = findProduct(product.getName());
            getList().remove(prodFound);
            amount += prodFound.getCost();
            return prodFound;

        } catch(Exception ex) {
            throw new RuntimeException("The item was not found");
        }
        
    }
}
