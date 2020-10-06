import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class CarController implements Initializable {

    @FXML
    private ComboBox<String> makeComboBox;

    @FXML
    private ComboBox<String> modelComboBox;

    @FXML
    private Spinner<Integer> yearOfModelSpinner;

    @FXML
    private TextField priceTextField;

    @FXML
    private TextField msgLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        makeComboBox.getItems().addAll("Honda","Toyota","Ford");
        modelComboBox.getItems().addAll("CRV","Fusion","Mustang","RAV4","Corolla","Camry","Civic","Pilot","Accord");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory. IntegerSpinnerValueFactory(2010,2020,2020);
        yearOfModelSpinner.setValueFactory(valueFactory);
    }

    public void selectButtonPushed()
    {
        try {
            Car newCar = new Car(makeComboBox.getValue(),
                    modelComboBox.getValue(),
                    yearOfModelSpinner.getValue(),
                    Double.parseDouble(priceTextField.getText()));

            msgLabel.setText(newCar.toString());
        } catch (Exception e)
        {
            msgLabel.setText(e.getMessage());
        }

        //System.out.printf("The Car Making Company is : '%s' %n", makeComboBox.getValue());
        //System.out.printf("The Car model is : '%s' %n", modelComboBox.getValue());
        //System.out.printf("The model year of car is: '%s' %n", yearOfModelSpinner.getValue());
        //System.out.printf("The Price of Car is: '%s' %n", priceTextField.getText());

    }

}