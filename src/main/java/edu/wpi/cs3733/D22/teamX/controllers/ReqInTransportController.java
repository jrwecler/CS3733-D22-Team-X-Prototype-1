package edu.wpi.cs3733.D22.teamX.controllers;

import edu.wpi.cs3733.D22.teamX.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ReqInTransportController implements Initializable {
  @FXML private Button AppButton;
  @FXML private ChoiceBox<String> transportLocation;
  @FXML private ChoiceBox<String> addAccommodations;
  @FXML private TextField patientName, roomNum;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    transportLocation.getItems().addAll(new String[] {"X-Ray Lab", "ICU", "Lobby", "Morgue"});
    addAccommodations.getItems().addAll(new String[] {"Wheelchair", "Bed", "Ventilation", "Nurse"});
  }

  @FXML
  void AppButton() throws IOException {
    App.switchScene(
        FXMLLoader.load(getClass().getResource("/edu/wpi/cs3733/D22/teamX/views/app.fxml")));
  }

  @FXML
  void resetFields() {
    patientName.setText("");
    roomNum.setText("");
    transportLocation.setValue("");
    addAccommodations.setValue("");
  }
}
