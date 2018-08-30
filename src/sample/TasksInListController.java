package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lists.List;
import product.Product;

import java.awt.*;
import java.io.IOException;

public class TasksInListController {
    //Lista de compras enviada desde Controller o de AddListController
    static List listWorkingOn;
    @FXML
    Label listNameLabel;

    @FXML
    Button addProductButton;

    @FXML
    TextArea descriptionArea;

    @FXML
    TableView<Product> productTable;

    @FXML
    TableColumn nameColumn;

    @FXML
    TableColumn cuantityColumn;

    @FXML
    TableColumn priceColumn;

    @FXML
    TableColumn totalColumn;

    @FXML
    TableColumn stateColumn;
    //Pone el nombre a label
    public void setName(String name){
        this.listNameLabel.setText(name);
    }
    //Pone el texto de la descripcion
    public void setDescription(String description){
        this.descriptionArea.setText(description);
    }
    //Envia a la pantalla de agregar productos
    public void addProduct(ActionEvent event){
        Parent root;
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddProduct.fxml"));
            root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
