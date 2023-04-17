// is part of the homework. Also changed strings in main.java are noted with "hw"

public class fruits extends product {
    private final String freshness;

    public fruits(String name, Integer cost, String freshness) {
        super(name, cost);

        this.freshness = freshness;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s, %s", super.toString(), freshness);
    }
}
