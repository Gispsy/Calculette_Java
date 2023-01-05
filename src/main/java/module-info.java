module fr.calcul.calculette {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.calcul.calculette to javafx.fxml;
    exports fr.calcul.calculette;
}