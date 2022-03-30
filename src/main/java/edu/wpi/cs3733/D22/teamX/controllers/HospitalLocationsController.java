package edu.wpi.cs3733.D22.teamX.controllers;

import edu.wpi.cs3733.D22.teamX.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HospitalLocationsController implements Initializable {

  @FXML private Button ToMainMenu;

  @FXML private TableView<SimpleLoc> table;

  @FXML private TableColumn<SimpleLoc, String> id;

  @FXML private TableColumn<SimpleLoc, Integer> x;

  @FXML private TableColumn<SimpleLoc, Integer> y;

  @FXML private TableColumn<SimpleLoc, String> floor;

  @FXML private TableColumn<SimpleLoc, String> building;

  @FXML private TableColumn<SimpleLoc, String> type;

  @FXML private TableColumn<SimpleLoc, String> longName;

  @FXML private TableColumn<SimpleLoc, String> shortName;

  @FXML
  private void ToMainMenu() throws IOException {
    App.switchScene(
        FXMLLoader.load(getClass().getResource("/edu/wpi/cs3733/D22/teamX/views/app.fxml")));
  }

  private ObservableList<SimpleLoc> locationListFill() {
    ObservableList<SimpleLoc> tableList = FXCollections.observableArrayList();
    LocationDAO allLocations = new LocationDAOImpl();
    List<Location> locationList = allLocations.getAllLocations();
    for (Location loc : locationList) {
      SimpleLoc simp = new SimpleLoc(loc);
      tableList.add(simp);
    }
    return tableList;
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    locationListFill();
    id.setCellValueFactory(new PropertyValueFactory<SimpleLoc, String>("id"));
    x.setCellValueFactory(new PropertyValueFactory<SimpleLoc, Integer>("x"));
    y.setCellValueFactory(new PropertyValueFactory<SimpleLoc, Integer>("y"));
    floor.setCellValueFactory(new PropertyValueFactory<SimpleLoc, String>("floor"));
    building.setCellValueFactory(new PropertyValueFactory<SimpleLoc, String>("building"));
    type.setCellValueFactory(new PropertyValueFactory<SimpleLoc, String>("type"));
    longName.setCellValueFactory(new PropertyValueFactory<SimpleLoc, String>("longName"));
    shortName.setCellValueFactory(new PropertyValueFactory<SimpleLoc, String>("shortName"));
    table.setItems(locationListFill());
  }
}
