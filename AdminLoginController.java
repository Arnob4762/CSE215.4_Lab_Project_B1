
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminLoginController {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label status;
    @FXML
    private Button loginButton;

    @FXML
    private void LoginButton(ActionEvent event) throws IOException {
        if (username.getText().equals("admin") && password.getText().equals("admin1234")) {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("AdminDashBoard.fxml"));
            primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }

}
