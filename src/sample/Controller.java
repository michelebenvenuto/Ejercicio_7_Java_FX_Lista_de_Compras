package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import product.*;
import lists.List;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class Controller {
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

    public void initialize(){
        ObservableList<List> listas =FXCollections.observableArrayList(
                new List("Super", "17/08/2018")
        );

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<List,String>("name")
        );
        dateColumn.setCellValueFactory(
                new PropertyValueFactory<List,String>("date")
        );
        listsTable.setItems(listas);
    }
}
