public class Сhocolate extends Product{


    private final Integer weight;

    public Сhocolate(String name, Integer coast, Integer weight) {
        super(name, coast);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + weight;
    }
}
