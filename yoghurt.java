public class yoghurt extends product{

    private final String flavour;

    public yoghurt(String name, Integer cost, String flavour) {
        super(name, cost);

        this.flavour = flavour;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" "+flavour;
    }
}
