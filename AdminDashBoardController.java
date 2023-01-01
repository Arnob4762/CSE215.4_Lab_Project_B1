/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author Arpo Roy
 */
public class AdminDashBoardController implements Initializable {

    @FXML
    private Button showbtn;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
  @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    String name,pass,email;
   
 @FXML
    private void showbtn(ActionEvent event) {
       
   
        try{
            //file path change according to your pc 
            File file = new File("C:\\Users\\Arnob\\Documents\\NetBeansProjects\\FOOD/User.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
                name = scan.next();
                pass = scan.next();
                email = scan.next();
                
                System.out.println("Name : "+name + " Password : " +pass+ " Email : " + email);
                
                label.setText("Name : "+name + " Password : " +pass+ " Email : " + email);
            }
           
          
        }catch(FileNotFoundException e){
                    System.out.println("File not found");
                    }
    }

   
   
    
}
