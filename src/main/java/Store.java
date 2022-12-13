import java.util.HashMap;
import java.util.Map;

public class Store {          //  1
    HashMap<String, Integer> products = new HashMap<>();

    public Store(){
        products.put("Хлеб",56);
        products.put("Масло",153);
        products.put("Колбаса",211);
        products.put("Пирожок",45);
    }

    public void printStoreRange() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
