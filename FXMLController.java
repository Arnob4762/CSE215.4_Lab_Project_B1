/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arpo Roy
 */
public class FXMLController implements Initializable {

    @FXML
    private Label Price;
    @FXML
    private TextField Quantity;
    @FXML
    private Label Total;
    @FXML
    private Button backbutton;
    @FXML
    private Label text1;
    @FXML
    private Label text2;
    @FXML
    private Label text3;
    @FXML
    private Label text4;
    @FXML
    private Label text5;
    @FXML
    private Label text6;
    @FXML
    private Label text7;
    @FXML
    private Label text8;
    @FXML
    private Label text9;
    
    int price;
    int quantity;
    int total = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBurger(ActionEvent event) {
        price = 80;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goPizza(ActionEvent event) {
          price = 400;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goFries(ActionEvent event) {
          price = 40;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goCoffee(ActionEvent event) {
          price = 150;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goPlainNun(ActionEvent event) {
          price = 20;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goSprite(ActionEvent event) {
          price = 35;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goCoke(ActionEvent event) {
          price = 35;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goFanta(ActionEvent event) {
          price = 35;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goChickenFry(ActionEvent event) {
          price = 105;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goSharma(ActionEvent event) {
          price = 160;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goOnionRings(ActionEvent event) {
          price = 75;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goChawmin(ActionEvent event) {
          price =90 ;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goGrillChicken(ActionEvent event) {
          price =120 ;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goFriedRice(ActionEvent event) {
          price = 130;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goMuttonLeg(ActionEvent event) {
          price = 300;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goParatha(ActionEvent event) {
          price = 30;
        Price.setText("Price : " + price);
    }

    @FXML
    private void goAdd(ActionEvent event) {
         try{
            quantity = Integer.parseInt(Quantity.getText());
        }
        catch(NumberFormatException e){
            System.out.println("Please Write Number Values");
        }
         
         String str1 = text1.getText();
         String str2 = text2.getText();
         String str3 = text3.getText();
         String str4 = text4.getText();
         String str5 = text5.getText();
         String str6 = text6.getText();
         String str7 = text7.getText();
         String str8 = text8.getText();
         String str9 = text9.getText();
         
        
      if (price==400)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Pizza\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
      }
      else if( price==150)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Coffee\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
      }
       else if( price==80)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Burger\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==40)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Fries\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==35)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Drinks\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==20)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Nun\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==105)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  ChickenFry\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==160)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Shawrma\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==75)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  OnionRings\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==90)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Chawmin\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==120)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  GrillChicken\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==130)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  FriedRice\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      } else if( price==300)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  MuttonLeg\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      }
       else if( price==30)
      {
          
          total+= (quantity *price);
          
          if(str1.length() == 0)
          {
              text1.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str2.length() == 0)
          {
              text2.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str3.length() == 0)
          {
              text3.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str4.length() == 0)
          {
              text4.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str5.length() == 0)
          {
              text5.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str6.length() == 0)
          {
              text6.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str7.length() == 0)
          {
              text7.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str8.length() == 0)
          {
              text8.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          else if(str9.length() == 0)
          {
              text9.setText("Name :  Paratha\t Quantity : "+ quantity + "\tTotal : "+(quantity * price));
          }
          
      }
      
       System.out.println(total);
        
        Total.setText("Total : " + total);
    }

    @FXML
    private void Back(ActionEvent event) throws IOException {
        
         Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
