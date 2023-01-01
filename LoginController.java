
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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

public class LoginController implements Initializable {

    @FXML
    private Label labelstatus;
    @FXML
    private Button loginbutton;
    @FXML
    private TextField txtusername;
    @FXML
    private PasswordField txtpassword;
    @FXML
    private Button buttonsignup;
    @FXML
    private Button BackButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleloginbuttonAction(ActionEvent event) throws IOException {
        String username = txtusername.getText(), password = txtpassword.getText();
        String user, pass, email;
        try {
            //Please change the path according to your pc where the User.txt file got created
            File file = new File("C:\\Users\\Documents\\NetBeansProjects\\FOOD\\User.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                user = scan.next();
                pass = scan.next();
                email = scan.next();
                if (user.equals(username) && pass.equals(password)) {
                    //labelstatus.setText("Log in successful");
                    Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
                    primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                } else {
                    labelstatus.setText("Log in failed ");
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("");
        }
    }

    @FXML
    private void handlesignupbuttonAction(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void Back(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
