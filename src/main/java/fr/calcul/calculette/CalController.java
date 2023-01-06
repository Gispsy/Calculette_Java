package fr.calcul.calculette;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class CalController {

    public javafx.scene.control.TextField TextField;
    public Button Button9;
    public Button Button8;
    public Button Button7;
    public Button Button6;
    public Button Button5;
    public Button Button4;
    public Button Button3;
    public Button Button2;
    public Button Button1;
    public Button Button0;
    public Button ButtonReset;
    public Button ButtonPoint;
    public Button ButtonEgal;
    public Button ButtonAddition;
    public Button ButtonSoustraction;
    public Button ButtonMultiplication;
    public Button ButtonDivision;

//Fonction pour l'affichage dans la calculatrice
    public void ButtonClick0(ActionEvent actionEvent) {     //Button 0
        TextField.appendText("0");
        int B0 = 0;

    }

    public void ButtonClick9(ActionEvent actionEvent) {     //Button 9
        TextField.appendText("9");
        int B9 = 9;

    }

    public void ButtonClick8(ActionEvent actionEvent) {     //Button 8
        TextField.appendText("8");
        int B8 = 8;

    }

    public void ButtonClick7(ActionEvent actionEvent) {     //Button 7
        TextField.appendText("7");
        int B7 = 7;

    }

    public void ButtonClick6(ActionEvent actionEvent) {     //Button 6
        TextField.appendText("6");
        int B6 = 6;

    }

    public void ButtonClick5(ActionEvent actionEvent) {     //Button 5
        TextField.appendText("5");
        int B5 = 5;

    }

    public void ButtonClick4(ActionEvent actionEvent) {     //Button 4
        TextField.appendText("4");
        int B4 = 4;

    }

    public void ButtonClick3(ActionEvent actionEvent) {     //Button 3
        TextField.appendText("3");
        int B3 = 3;

    }

    public void ButtonClick2(ActionEvent actionEvent) {     //Button 2
        TextField.appendText("2");
        int B2 = 2;

    }

    public void ButtonClick1(ActionEvent actionEvent) {     //Button 1
        TextField.appendText("1");
        int B1 = 1;

    }

    public void ButtonClickAdd(ActionEvent actionEvent) {       //Addition
        TextField.appendText("+");

    }

    public void ButtonClickSous(ActionEvent actionEvent) {      //Soustraction
        TextField.appendText("-");

    }

    public void ButtonClickMulti(ActionEvent actionEvent) {     //Multiplication
        TextField.appendText("*");

    }

    public void ButtonClickDivi(ActionEvent actionEvent) {      //Division
        TextField.appendText("/");

    }

    public void ButtonClickReset(ActionEvent actionEvent) {     //Supprimer le tout
        TextField.clear();

    }

    public void ButtonClickPoint(ActionEvent actionEvent) {     //La virgule
        TextField.appendText(".");

    }

    public void ButtonClickEgale(ActionEvent actionEvent) {     //Fait le calcule
        for (int i = 0; i < TextField.Length(); i++){
            
        }

    }
}