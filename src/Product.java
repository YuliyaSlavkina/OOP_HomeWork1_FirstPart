public class Product {

    public String getName() {
        return name;
    }

    public Integer getCoast() {
        return coast;
    }

    private String name;

    public void setCoast(Integer coast) {
        this.coast = coast;
    }

    private Integer coast;

    public Product(String name, Integer coast) {
        this.name = name;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", name, coast );
    }
}
