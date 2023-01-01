
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

public class RegistrationController implements Initializable {

    @FXML
    private TextField txtuser;
    @FXML
    private PasswordField txtpass;
    @FXML
    private TextField txtemail;
    @FXML
    private Button SigninButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button BackButton;
    @FXML
    private Label status;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void SignIn(ActionEvent event) throws IOException {
        String user = txtuser.getText(), pass = txtuser.getText();
        if (user.equals("") || pass.equals("")) {
            status.setText("Enter Username and password");
        } else {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
            primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }

    @FXML
    private void Save(ActionEvent event) throws IOException {
        String user = txtuser.getText(), pass = txtpass.getText(), email = txtemail.getText();
        Scanner in = new Scanner(System.in);

        try {
            //Witing user information in this file 
            FileWriter file = new FileWriter("User.txt", true);
            file.write(user + "\n" + pass + "\n" + email + "\n");
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

    @FXML
    private void Back(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
