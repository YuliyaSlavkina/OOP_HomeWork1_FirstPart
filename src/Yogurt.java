public class Yogurt extends Product {  //наследование

    private final String flavor; //инкапсуляция final поле менять нельзя кроме как в конструкторе

    public Yogurt(String name, Integer coast, String flavor) {
        super(name, coast);
        this.flavor = flavor;
    }

    @Override
    public String toString() { //полиморфизм
        return super.toString() + ", " + flavor;
    }
}
