public class product {
    public Integer getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
    private String name;

    private Integer cost;

    public product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s, %d", name, cost);
    }
}
