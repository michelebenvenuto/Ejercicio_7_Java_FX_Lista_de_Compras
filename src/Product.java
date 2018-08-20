public class Product {
    private String name;
    private int cuantity;
    private float price;
    private boolean bought= false;

    public String getName() {
        return name;
    }

    public int getCuantity() {
        return cuantity;
    }

    public float getPrice() {
        return price;
    }

    public boolean isBought() {
        return bought;
    }
    public void buyItem(){
        this.bought=true;
    }

    public Product(String name, int cuantity, float price) {
        this.name = name;
        this.cuantity = cuantity;
        this.price = price;
    }
}
