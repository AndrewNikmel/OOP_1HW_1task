/**
 * main
 */
public class main {

    public static void main(String[] args) {
        vendingMachine vendingMachine = new vendingMachine();
        vendingMachine.addProduct(new product("cheese", 300))
            .addProduct(new product("water", 10)) // returns the object, we can return as much as we need
            .addProduct(new product("wine", 330))
            .addProduct(new yoghurt("Danone", 300, "sweet"))
            .addProduct(new cigarets("Minsk", 62, "Bulba"));
        System.out.println("---We have:---");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        product found = vendingMachine.findProduct("Minsk");
        System.out.println("---We look for:---");
        System.out.println(found);
        product sold = vendingMachine.selProduct(found);
        System.out.println("---We buy:---");
        System.out.println(sold);
        System.out.println(vendingMachine.getAmount()); // to get "System.out.println()" we just have to type in "sout"
        System.out.println("---The rest of items is:---");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("---We buy again:---");
        product yoghurt = vendingMachine.selProduct(vendingMachine.findProduct("Danone"));
        System.out.println(yoghurt);
        System.out.println("---The new rest of items is:---");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("---We buy again:---");
        try {
            product stuff = vendingMachine.selProduct(vendingMachine.findProduct("JimBeam"));
            System.out.println(stuff);
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}