package lists;
import java.util.ArrayList;
import product.*;
public class List {
    private String name;
    private String date;
    private ArrayList<Product> products;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public List(String name, String date) {
        this.name = name;
        this.date = date;
        this.products= new ArrayList<Product>();
    }
    public boolean findProduct(String name){
        for (Product product : this.products){
            if(product.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public boolean addProduct(Product product){
        if(findProduct(product.getName())){
            return false;
        }
        else{
            this.products.add(product);
            return true;
        }
    }
}
