public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("cheese", 300))
                .addProduct(new Product("water", 10))
                .addProduct(new Product("wine", 330))
                .addProduct(new Yogurt("Dannone", 25, "sweet"))
                .addProduct(new Perfume("Si", 6000, "Armani"));
        System.out.println("Наш список товаров: ");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println("Товар который мы нашли: ");
        Product found = vendingMachine.findProduct("water");
        System.out.println(found);
        System.out.println("Товар который мы продали: ");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println(sold);
        System.out.println("Количество денег, которое получили:  ");
        System.out.println(vendingMachine.getAmount());
        System.out.println("Список оставшихся товаров:  ");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        System.out.println();
        Product perfume = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
        System.out.println("Товар который мы продали: ");
        System.out.println(perfume);
        System.out.println("Количество денег в автомате:  ");
        System.out.println(vendingMachine.getAmount());
        System.out.println("Список оставшихся товаров:  ");
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }
        try {
            Product per = vendingMachine.sellProduct(vendingMachine.findProduct("Si"));
            System.out.println(per);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}