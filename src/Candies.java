public class  Candies extends Product {
    private String flavor;

    public Candies(String name, Integer coast, String flavor) {
        super(name, coast);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), flavor) ;
    }
}
