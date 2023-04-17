/**
 * main
 */
public class main {

    public static void main(String[] args) {
        vendingMachine vendingMachine = new vendingMachine();
        vendingMachine.addProduct(new product("cheese", 300))
            .addProduct(new product("water", 10)) // returns the object, we can return as much as we need
            .addProduct(new product("wine", 330));
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
    }
}