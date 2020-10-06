import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("carView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Car Selection Application");
        stage.show();
    }
}
/* Work of week-1 lab1
Was not able to submit on time as i was seek please review it if possible thank you!
 */
//Car car1 = new Car("Honda", "CRV",2018, 38000);
//Car car2 = new Car("Toyota","RAV4",2019,45000);
//Car car3 = new Car("Ford", "Fusion",2015,30000);

//System.out.printf("Car 1: %s%n",car1);
//System.out.printf("Car 2: %s%n",car2);
//System.out.printf("Car 3: %s%n",car3);