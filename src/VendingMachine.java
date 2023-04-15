import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public VendingMachine addProduct(Product product) {
        list.add(product);
        return this;
    }

    public List<Product> getList() {
        return list;
    }

    public Product findProduct(String string){ //в параметрах строка, так как ищем по строке
        for (int i = 0; i < getList().size(); i++) {
            if(getList().get(i).getName().equals(string)){
                return getList().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product){
        try {
            Product prodFound = findProduct(product.getName());
            getList().remove(prodFound);
            amount += prodFound.getCoast();
            return prodFound;
        } catch (Exception e){
            throw new RuntimeException("Товар не найден");
        }

    }

}
