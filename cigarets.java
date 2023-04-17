public class cigarets extends product {
    private final String smell; // we need it for including a new parametr (here - smell)
                                // when we press ctrl+smell, we can see all the links to that word
                                // that line is private, so we can change it only through construct

    public cigarets(String name, Integer cost, String smell) {
        super(name, cost);

        this.smell = smell; // is one of the links (read above)
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s, %s", super.toString(), smell); // might be done on this way, or like in the yoghurt
    }
}
