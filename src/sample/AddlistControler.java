package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lists.List;
import product.Product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

public class AddlistControler {
    @FXML
    Label nameLabel;

    @FXML
    javafx.scene.control.Button createBotton;

    @FXML
    javafx.scene.control.TextField nameInput;

    @FXML
    javafx.scene.control.TextArea descriptionInput;

    @FXML
    javafx.scene.control.TextField dateInput;




    static ObservableList<List> listas =FXCollections.observableArrayList();

    public static void setListas(ObservableList<List> lista){
        listas= lista;
    }
    public void create(javafx.event.ActionEvent event) {
            List listToAdd = new List(nameInput.getText(), descriptionInput.getText(), dateInput.getText());
            listas.add(listToAdd);
            Parent root;
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("TasksInList.fxml"));
                root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();

                TasksInListController tasksInListController =loader.getController();
                tasksInListController.setName(listToAdd.getName());
                tasksInListController.setDescription(listToAdd.getDescription());
                tasksInListController.nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String >("name"));
                tasksInListController.cuantityColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("cuantity"));
                tasksInListController.stateColumn.setCellValueFactory(new PropertyValueFactory<Product, Boolean>("bought"));
                tasksInListController.listWorkingOn= listToAdd;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
