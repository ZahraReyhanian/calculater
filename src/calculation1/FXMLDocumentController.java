/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation1;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author AVAJANG
 */
public class FXMLDocumentController extends BigInt implements Initializable {

    private BigInt n1 = new BigInt();
    private BigInt n2 = new BigInt();
    private boolean clicked = false;
    private String str = "";
    private String action = "";
    @FXML
    private TextArea result;
    @FXML
    private TextArea text;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btn000(ActionEvent event) {
        if (clicked == false) {
            n1.add(0);
            n1.add(0);
            n1.add(0);
        } else {
            n2.add(0);
            n2.add(0);
            n2.add(0);
        }
        str += "000";
        this.text.setText(str);
    }

    @FXML
    private void btn0(ActionEvent event) {
        if (clicked == false) {
            n1.add(0);
        } else {
            n2.add(0);
        }
        str += "0";
        this.text.setText(str);
    }

    @FXML
    private void btn1(ActionEvent event) {
        if (clicked == false) {
            n1.add(1);
        } else {
            n2.add(1);
        }
        str += "1";
        this.text.setText(str);
    }

    @FXML
    private void btn2(ActionEvent event) {
        if (clicked == false) {
            n1.add(2);
        } else {
            n2.add(2);
        }
        str += "2";
        this.text.setText(str);

    }

    @FXML
    private void btn3(ActionEvent event) {
        if (clicked == false) {
            n1.add(3);
        } else {
            n2.add(3);
        }
        str += "3";
        this.text.setText(str);
    }

    @FXML
    private void btn4(ActionEvent event) {
        if (clicked == false) {
            n1.add(4);
        } else {
            n2.add(4);
        }
        str += "4";
        this.text.setText(str);
    }

    @FXML
    private void btn5(ActionEvent event) {
        if (clicked == false) {
            n1.add(5);
        } else {
            n2.add(5);
        }
        str += "5";
        this.text.setText(str);
    }

    @FXML
    private void btn6(ActionEvent event) {
        if (clicked == false) {
            n1.add(6);
        } else {
            n2.add(6);
        }
        str += "6";
        this.text.setText(str);
    }

    @FXML
    private void btn7(ActionEvent event) {
        if (clicked == false) {
            n1.add(7);
        } else {
            n2.add(7);
        }
        str += "7";
        this.text.setText(str);
    }

    @FXML
    private void btn8(ActionEvent event) {
        if (clicked == false) {
            n1.add(8);
        } else {
            n2.add(8);
        }
        str += "8";
        this.text.setText(str);
    }

    @FXML
    private void btn9(ActionEvent event) {
        if (clicked == false) {
            n1.add(9);
        } else {
            n2.add(9);
        }
        str += "9";
        this.text.setText(str);
    }

    @FXML
    private void plusb(ActionEvent event) {
        clicked = true;
        str += "+";
        this.text.setText(str);
        this.action = "plus";

    }

    @FXML
    private void divb(ActionEvent event) {
        clicked = true;
        str += "/";
        this.text.setText(str);
        this.action = "division";
    }

    @FXML
    private void multyb(ActionEvent event) {
        clicked = true;
        str += "x";
        this.text.setText(str);
        this.action = "multy";
    }

    @FXML
    private void minsb(ActionEvent event) {
        clicked = true;
        str += "-";
        this.text.setText(str);
        this.action = "subtraction";
    }

    @FXML
    private void antb(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Antegral.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void equb(ActionEvent event) throws Exception {
        str += "=";
        this.text.setText(str);
        BigInt s3 = new BigInt();
        if (action.equals("subtraction")) {
            s3 = subtraction(n1, n2);
        } else if (action.equals("multy")) {
            s3 = multy(n1, n2);
        } else if (action.equals("plus")) {
            s3 = addition(n1, n2);
        } else if (action.equals("division")) {
            s3 = division(n1, n2);
        } else if (action.equals("modulo")) {
            s3 = modulo(n1, n2);
        } else {
            s3 = n1;
        }
        str = "";
        for (int i = 0; i < s3.size(); i++) {
            str += s3.n.get(i);
        }
        this.result.setText(str);
        n1.n.clear();
        n2.n.clear();

    }

    @FXML
    private void start(ActionEvent event) {
        this.clicked = false;
        this.str = "";
        this.result.setText("0");
        this.text.setText("0");
        this.action = "";
        this.n1.n.clear();
        this.n2.n.clear();
    }

    @FXML
    private void modulob(ActionEvent event) {
        clicked = true;
        str += "%";
        this.text.setText(str);
        this.action = "modulo";
    }

}
