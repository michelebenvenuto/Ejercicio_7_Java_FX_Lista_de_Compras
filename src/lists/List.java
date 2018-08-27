package lists;
import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import product.*;
public class List {
    SimpleStringProperty name;
    SimpleStringProperty date;
    private ArrayList<Product> products;

    public String getName(){
        return this.name.get();
    }

    public String getDate(){
        return this.date.get();
    }

    public List(String name, String date){
        this.name = new SimpleStringProperty();
        this.date = new SimpleStringProperty();

        this.name.set(name);
        this.date.set(date);
        this.products= new ArrayList<>();
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
