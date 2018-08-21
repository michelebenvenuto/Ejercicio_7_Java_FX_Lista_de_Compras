package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lists.List;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.io.IOException;


public class Controller {
    @FXML
    Button addListButton;
    @FXML
    TableView<List> listsTable;

    @FXML
    TableColumn nameColumn;

    @FXML
    TableColumn dateColumn;

    @FXML
    TableColumn toDoColumn;

    @FXML
    TableColumn estimateColumn;

    ObservableList<List> listas =FXCollections.observableArrayList();

    public void initialize(){

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<List,String>("name")
        );
        dateColumn.setCellValueFactory(
                new PropertyValueFactory<List,String>("date")
        );
        listsTable.setItems(listas);
    }

    public void addList(ActionEvent event){
        Parent root;
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addList.fxml"));
            root=loader.load();
            Stage stage = new Stage();
            stage.setTitle("Agregar una nueva lista");
            stage.setScene(new Scene(root, 450,450));
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
