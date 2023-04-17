public class cigarets extends product{
    private final String smell;
    public cigarets(String name, Integer cost, String smell){
        super(name, cost);

        this.smell = smell;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" "+smell;
    }
}
