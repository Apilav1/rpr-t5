package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;

import java.awt.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

 public class Controller {

     Float prvi = 0f, r = 0f;
     public Button dijeljenjeSaOstatkom;
     public Button cijelobrojnoDijeljenje;
     public Button puta;
     public Button minus;
     public Button btn1;
     public Button btn2;
     public Button btn3;
     public Button btn4;
     public Button btn5;
     public Button btn6;
     public Button btn7;
     public Button btn8;
     public Button btn9;
     public Button btn0;
     public Button dotBtn;
     public Button equalsBtn;
     public Button plusBtn;
     public int rez = 0;
     public SimpleStringProperty disValue;
     public Label display;
     public boolean sabiranje = false, oduzimanje = false, mnozenje = false, Cdijeljenje = false, dijeljenjeSaS = false, datRez = false, prviUnesen = false;
     public boolean unosPrvogZavrsen = false, zarezzz = false, prvit = false, nula = true, zaz = false, greska = false, plusKliknut = false, putaKliknut = false, minusKliknut = false, cdkliknu = false, dsokliknut = false;
     public boolean unos = false;
     public void ocistiDisplay() {
         if (sabiranje || oduzimanje || mnozenje || Cdijeljenje || dijeljenjeSaS) {
             if (datRez) display.setText("");
         }
     }

     public Label getDisplay() {
         return display;
     }

     public int setDisplay(int a) {
         rez += a;
         return rez;
     }

     public String getText() {
         return display.getText();
     }

     public void kliknut(javafx.event.ActionEvent actionEvent) {
         if (prvit == false) {
             display.setText("");
             prvit = true;
         }
         if (actionEvent.getSource().toString().equals(String.valueOf(btn0))) {
             ocistiDisplay();
             datRez = false;

             // if( unosPrvogZavrsen)display.setText("");
             if (nula) {
                 display.setText("0");
             } else {
                 display.setText(display.getText() + "0");
             }
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn1))) {
             ocistiDisplay();
             datRez = false;

             // // if(unosPrvogZavrsen)display.setText("");
             if (nula) {
                 display.setText("1");
             } else {
                 display.setText(display.getText() + "1");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn2))) {
             ocistiDisplay();
             datRez = false;
             // if(unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("2");
             } else {
                 display.setText(display.getText() + "2");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn3))) {
             ocistiDisplay();
             datRez = false;
             //if(unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("3");
             } else {
                 display.setText(display.getText() + "3");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn4))) {
             ocistiDisplay();
             datRez = false;
             //if( unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("4");
             } else {
                 display.setText(display.getText() + "4");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn5))) {
             ocistiDisplay();
             datRez = false;
             //if( unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("5");
             } else {
                 display.setText(display.getText() + "5");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn6))) {
             ocistiDisplay();
             datRez = false;
             // if( unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("6");
             } else {
                 display.setText(display.getText() + "6");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn7))) {
             ocistiDisplay();
             datRez = false;
             // if( unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("7");
             } else {
                 display.setText(display.getText() + "7");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn8))) {
             ocistiDisplay();
             datRez = false;
             // if( unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("8");
             } else {
                 display.setText(display.getText() + "8");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(btn9))) {
             ocistiDisplay();
             datRez = false;
             // if( unosPrvogZavrsen) display.setText("");

             if (nula) {
                 display.setText("9");
             } else {
                 display.setText(display.getText() + "9");
             }
             nula = false;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(plusBtn))) {
            if(!plusKliknut) {
                prvi += Float.parseFloat(display.getText());
                display.setText("");
                sabiranje = true;
                unosPrvogZavrsen = true;

                zarezzz = false;
                nula = false;
            }
            plusKliknut = true;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(minus))) {
             if(!minusKliknut) {
                 prvi -= Float.parseFloat(display.getText());
                 display.setText("");
                 oduzimanje = true;

                 zarezzz = false;
                 unosPrvogZavrsen = true;
                 nula = false;
             }
             minusKliknut = true;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(puta))) {

             if(!putaKliknut) {
                 if (prvi != 0) {
                     prvi *= Float.parseFloat(display.getText());
                 } else {
                     prvi = 0f;
                     prvi = Float.parseFloat(display.getText());
                     //System.out.println("---------"+display.getText()+" ");
                     //System.out.println("---------"+prvi+" ");
                 }
                 display.setText("");
                 unosPrvogZavrsen = true;
                 mnozenje = true;
                 zarezzz = false;
                 nula = false;
             }
             putaKliknut = true;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(cijelobrojnoDijeljenje))) {
             //System.out.println("------------------");
             if(!cdkliknu) {
                 if (Float.parseFloat(display.getText()) == 0f) {
                     System.out.println("-----------");
                     greska = true;
                 }
                 if (prvi != 0) {
                     //System.out.println("*********"+prvi);
                     prvi /= Float.parseFloat(display.getText());
                 } else {
                     prvi = 0f;
                     prvi = Float.parseFloat(display.getText());
                     //System.out.println("*********"+prvi);
                     //System.out.println("---------"+display.getText()+" ");
                 }
                 display.setText("");
                 Cdijeljenje = true;

                 zarezzz = false;
                 unosPrvogZavrsen = true;
                 nula = false;
             }
             cdkliknu = true;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(dijeljenjeSaOstatkom))) {
             if(!dsokliknut) {
                 if (Float.parseFloat(display.getText()) == 0) {

                     greska = true;
                 }
                 if (prvi != 0) {
                     prvi %= Float.parseFloat(display.getText());
                 } else {

                     prvi = 0f;
                     prvi = Float.parseFloat(display.getText());
                     //System.out.println("---------"+display.getText()+" ");
                 }
                 display.setText("");
                 dijeljenjeSaS = true;

                 zarezzz = false;
                 unosPrvogZavrsen = true;
                 nula = false;
             }
             dsokliknut = true;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(dotBtn))) {
             if (display.getText() == "") display.setText("0");
             if (!zarezzz && !zaz) display.setText(display.getText() + ".");
             unosPrvogZavrsen = false;
             zarezzz = true;
             zaz = true;
         } else if (actionEvent.getSource().toString().equals(String.valueOf(equalsBtn))) {
             if(display.getText().equals("")){
                    //display.setText("0");
             }
             else if(!display.getText().equals("")){
                 Float drugi = Float.parseFloat(display.getText());
                 if (drugi == 0f) {

                     greska = true;
                 }
                 if (!greska) {
                     zarezzz = false;
                     datRez = true;
                     prviUnesen = false;
                     if (sabiranje) {
                         r += drugi + prvi;
                         display.setText("" + r);
                     } else if (oduzimanje) {
                         r -= drugi - prvi;
                         display.setText("" + r);
                     } else if (mnozenje) {
                         System.out.println(prvi + " " + drugi);
                         if (r != 0) {
                             r *= drugi * prvi;
                         } else {
                             r = drugi * prvi;
                         }
                         display.setText("" + r);
                     } else if (Cdijeljenje) {

                         if (r != 0) {
                             r /= drugi / prvi;
                         } else {
                             r = drugi / prvi;
                         }
                         display.setText("" + r);
                     } else if (dijeljenjeSaS) {
                         if (r != 0) {
                             r %= drugi % prvi;
                         } else {
                             r = drugi % prvi;
                         }
                         display.setText("" + r);
                     }
                     //prvi = r;
                     r = Float.parseFloat("0");
                     unosPrvogZavrsen = false;
                     nula = false;
                     plusKliknut = false;
                     putaKliknut = false;
                     minusKliknut = false;
                     dsokliknut = false;
                     cdkliknu = false;

                 } else {
                     display.setText("greska!");
                 }
             }
         }
     }
 }
