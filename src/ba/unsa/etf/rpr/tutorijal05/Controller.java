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
        public Button button1;
        public Button button2;
        public Button button3;
        public Button button4;
        public Button button5;
        public Button button6;
        public Button button7;
        public Button button8;
        public Button button9;
        public Button button0;
        public Button zarez;
        public Button jednako;
        public Button plus;
        public int rez = 0;
        public SimpleStringProperty disValue;
        public Label display;
        public boolean sabiranje=false, oduzimanje=false, mnozenje=false, Cdijeljenje=false, dijeljenjeSaS = false, datRez=false, prviUnesen = false;
        public boolean  unosPrvogZavrsen = false, zarezzz = false, prvit = false, nula = true;
        public void ocistiDisplay(){
            if(sabiranje || oduzimanje || mnozenje || Cdijeljenje || dijeljenjeSaS){
                if(datRez) display.setText("");
            }
        }
     public Label getDisplay() {
         return display;
     }
     public int setDisplay(int a) {
         rez += a;
         return rez;
     }
     public String getText(){
            return display.getText();
     }
     public void kliknut(javafx.event.ActionEvent actionEvent) {
            if(prvit == false){
                display.setText("");
                prvit = true;
            }
        if(actionEvent.getSource().toString().equals(String.valueOf(button0))){
            ocistiDisplay();
            datRez = false;

           // if( unosPrvogZavrsen)display.setText("");
            if(nula){
                display.setText("0");
            }
            else{
                display.setText(display.getText()+"0");
            }
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button1))){
            ocistiDisplay();
            datRez = false;

           // // if(unosPrvogZavrsen)display.setText("");
            if(nula){
                display.setText("1");
            }
            else{
                display.setText(display.getText()+"1");
            }
             nula = false;
         }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button2))){
            ocistiDisplay();
            datRez = false;
            // if(unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("2");
            }
            else{
                display.setText(display.getText()+"2");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button3))){
            ocistiDisplay();
            datRez = false;
            //if(unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("3");
            }
            else{
                display.setText(display.getText()+"3");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button4))){
            ocistiDisplay();
            datRez = false;
            //if( unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("4");
            }
            else{
                display.setText(display.getText()+"4");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button5))){
            ocistiDisplay();
            datRez = false;
            //if( unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("5");
            }
            else{
                display.setText(display.getText()+"5");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button6))){
            ocistiDisplay();
            datRez = false;
           // if( unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("6");
            }
            else{
                display.setText(display.getText()+"6");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button7))){
            ocistiDisplay();
            datRez = false;
           // if( unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("7");
            }
            else{
                display.setText(display.getText()+"7");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button8))){
            ocistiDisplay();
            datRez = false;
           // if( unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("8");
            }
            else{
                display.setText(display.getText()+"8");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(button9))){
            ocistiDisplay();
            datRez = false;
           // if( unosPrvogZavrsen) display.setText("");

            if(nula){
                display.setText("9");
            }
            else{
                display.setText(display.getText()+"9");
            }
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(plus))){

            prvi += Float.parseFloat(display.getText());
            display.setText("");
            sabiranje = true;
            unosPrvogZavrsen = true;

            zarezzz = false;
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(minus))){
            prvi -= Float.parseFloat(display.getText());
            display.setText("");
            oduzimanje = true;

            zarezzz = false;
            unosPrvogZavrsen = true;
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(puta))){
            prvi *= Float.parseFloat(display.getText());
            display.setText("");

            unosPrvogZavrsen = true;
            mnozenje = true;
            zarezzz = false;
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(cijelobrojnoDijeljenje))){
            prvi /= Float.parseFloat(display.getText());
            display.setText("");
            Cdijeljenje = true;

            zarezzz = false;
            unosPrvogZavrsen = true;
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(dijeljenjeSaOstatkom))){
            prvi %= Float.parseFloat(display.getText());
            display.setText("");
            dijeljenjeSaS = true;

            zarezzz = false;
            unosPrvogZavrsen = true;
            nula = false;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(zarez))){
                if(!zarezzz )display.setText(display.getText() + ".");
                unosPrvogZavrsen = false;
                zarezzz = true;
        }
        else if(actionEvent.getSource().toString().equals(String.valueOf(jednako))){
            Float drugi = Float.parseFloat(display.getText());

            zarezzz = false;
            datRez = true;
            prviUnesen = false;
            if(sabiranje){
                r += drugi + prvi;
                display.setText(""+r);
            }
            else if(oduzimanje){
                r -= drugi - prvi;
                display.setText(""+r);
            }
            else if(mnozenje){
                r *= drugi * prvi;
                display.setText(""+r);
            }
            else if(Cdijeljenje){
                r /= drugi / prvi;
                display.setText(""+r);
            }
            else if(dijeljenjeSaS){
                r %= drugi % prvi;
                display.setText(""+r);
            }
            r = Float.parseFloat("0");
            unosPrvogZavrsen = false;
            nula = false;
        }
    }

}
