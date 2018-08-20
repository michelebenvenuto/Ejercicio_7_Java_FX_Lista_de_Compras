package product;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
    SimpleStringProperty name;
    SimpleIntegerProperty cuantity;
    SimpleDoubleProperty price;
    SimpleBooleanProperty bought=new SimpleBooleanProperty(false);

    public String getName() {
        return this.name.get();
    }

    public int getCuantity() {
        return this.cuantity.get();
    }

    public double getPrice() {
        return this.price.get();
    }

    public boolean getBought() {
        return this.bought.get();
    }
    public void buyItem(){
        this.bought.set(true);
    }

    public Product(String name, int cuantity, float price) {
        this.name = new SimpleStringProperty();
        this.cuantity = new SimpleIntegerProperty();
        this.price = new SimpleDoubleProperty();

        this.name.set(name);
        this.cuantity.set(cuantity);
        this.price.set(price);
    }
}
