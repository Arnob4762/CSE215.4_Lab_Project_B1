/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package delivery;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Arpo Roy
 */
public class FXMLDocumentController  {

    @FXML
    private Label label;
    @FXML
    private TextField km;
    public int n;
     public int total=0;
     public String s;
     /**
     * Initializes the controller class.
     */
  

    @FXML
    private void handleButtonAction(ActionEvent event) {
          n= Integer.parseInt(km.getText());
       if(n>0 && n<=10 )
       {
           total=n*10;
             
            label.setText("Your Delivery Info: \n"+" Name: Karim \n"+"Mobile: 01782685934 \n" +"Price: "+total);
       }
     else if(n>10 && n<=30)
         {
               total=0;
               total=n*8;
                  label.setText("Your Delivery Info: \n"+" Name: Emran \n"+"Mobile: 01982785463 \n" +"Price: "+total);
         }
       else
     {
         total=0;
         total=n*7;
           label.setText("Your Delivery Info: \n"+" Name: kuddus \n"+"Mobile: 01834256928 \n" +"Price: "+total);
     }
       
        System.out.println(total);
      
    }
    
}
