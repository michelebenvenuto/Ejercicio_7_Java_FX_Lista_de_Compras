package lists;
import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import product.*;
public class List {
    SimpleStringProperty name;
    SimpleStringProperty description;
    SimpleStringProperty date;
    private ArrayList<Product> products;

    public String getName(){
        return this.name.get();
    }
    public String getDescription(){
        return this.description.get();
    }

    public String getDate(){
        return this.date.get();
    }

    public List(String name,String description, String date){
        this.name = new SimpleStringProperty();
        this.description= new SimpleStringProperty();
        this.date = new SimpleStringProperty();

        this.name.set(name);
        this.description.set(description);
        this.date.set(date);
        this.products= new ArrayList<>();
    }
    public void addProduct(Product productToAdd) {
        this.products.add(productToAdd);
    }
}
