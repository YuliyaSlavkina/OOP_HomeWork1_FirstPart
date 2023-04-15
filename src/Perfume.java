public class Perfume extends Product {

    private final String brand;

    public Perfume(String name, Integer coast, String brand) {
        super(name, coast);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), brand ) ;
    }
}
