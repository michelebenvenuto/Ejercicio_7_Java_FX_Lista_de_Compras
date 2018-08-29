package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import lists.List;
        import product.Product;

        import java.awt.*;

public class AddProductController {
    @FXML
    javafx.scene.control.TextField nameInput;

    @FXML
    javafx.scene.control.TextField cuantityInput;

    @FXML
    javafx.scene.control.TextField priceInput;

    @FXML
    javafx.scene.control.Button addButton;

    static List listWorkingOn;

    public void addItem(ActionEvent event){
        Product productToAdd= new Product(nameInput.getText(),Integer.valueOf(cuantityInput.getText()),Double.valueOf(priceInput.getText()));
        listWorkingOn.addProduct(productToAdd);
    }
}
