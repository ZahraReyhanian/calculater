/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AVAJANG
 */
public class AntegralController extends BigInt implements Initializable {

    private int z[] = new int[10];
    @FXML
    private TextArea top;
    @FXML
    private TextArea under;
    @FXML
    private Button f0;
    @FXML
    private Button f9;
    @FXML
    private Button f8;
    @FXML
    private Button f7;
    @FXML
    private Button f6;
    @FXML
    private Button f4;
    @FXML
    private Button f3;
    @FXML
    private Button f2;
    @FXML
    private Button f1;
    @FXML
    private Button f5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void a0(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 0 ام");
        z[0] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[0] = z[0] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[0] = 0;
                break;
            }
        }
        f0.setText(str);

    }

    @FXML
    private void a9(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 9 ام");
        z[9] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[9] = z[9] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[9] = 0;
                break;
            }
        }
        z[9]/=10;
        f9.setText(str);
    }

    @FXML
    private void a8(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 8 ام");
        z[8] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[8] = z[8] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[8] = 0;
                break;
            }
        }
        z[8]/=9;
        f8.setText(str);
    }

    @FXML
    private void a7(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 7 ام");
        z[7] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[7] = z[7] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[7] = 0;
                break;
            }
        }
        z[7]/=8;
        f7.setText(str);
    }

    @FXML
    private void a6(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 6 ام");
        z[6] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[6] = z[6] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[6] = 0;
                break;
            }
        }
        z[6]/=7;
        f6.setText(str);
    }

    @FXML
    private void a4(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 4 ام");
        z[4] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[4] = z[4] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[4] = 0;
                break;
            }
        }
        z[4]/=5;
        f4.setText(str);
    }

    @FXML
    private void a3(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 3 ام");
        z[3] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[3] = z[3] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[3] = 0;
                break;
            }
        }
        z[3]/=4;
        f3.setText(str);
    }

    @FXML
    private void a2(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 2 ام");
        z[2] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[2] = z[2] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[2] = 0;
                break;
            }
        }
        z[2]/=3;
        f2.setText(str);
    }

    @FXML
    private void a1(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 1 ام");
        z[1] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[1] = z[1] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[1] = 0;
                break;
            }
        }
        z[1]/=2;
        f1.setText(str);
    }

    @FXML
    private void a5(ActionEvent event) {
        String str = "";
        str = JOptionPane.showInputDialog("ضریب جمله ی 5 ام");
        z[5] = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                z[5] = z[5] * 10 + str.charAt(i) - '0';
            } else {
                JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                z[5] = 0;
                break;
            }
        }
        z[5]/=6;
        f5.setText(str);
    }

    @FXML
    private void return_calc(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void ok_method(ActionEvent event) throws Exception {
        if (this.top.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "کران بالا نباید خالی باشد");
        } else if (this.under.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "کران پایین نباید خالی باشد");
        } else {
            BigInt result = new BigInt();
            BigInt top_k = new BigInt();
            BigInt under_k = new BigInt();
            String str1 = this.top.getText();
            String str2 = this.under.getText();
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                    top_k.n.add(Integer.parseInt(str1.charAt(i) + ""));
                } else {
                    JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                    top_k.n.clear();
                    break;
                }
            }
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                    under_k.n.add(Integer.parseInt(str2.charAt(i) + ""));
                } else {
                    JOptionPane.showMessageDialog(null, "ضریب باید عدد باشد");
                    under_k.n.clear();
                    break;
                }
            }
            result.n.add(0);
            for (int i = 0; i < 10; i++) {
                if (z[i] != 0) {
                    BigInt zz=new BigInt();
                    int l = z[i];
                    while(l!=0){
                       zz.add(0, l%10);
                       l/=10;
                    }
                    result = addition(multy( top_k.power(i + 1),zz), result);
                }
            }
            System.out.println("s re=="+result.size());
            for(int i=0 ; i<result.size() ; i++){
                System.out.println(result.n.get(i));
                
            }
            for (int i = 0; i < 10; i++) {
                if (z[i] != 0) {
                    BigInt zz=new BigInt();
                    while(z[i]!=0){
                       zz.add(0, z[i]%10);
                       z[i]/=10;
                    }
                    result = subtraction(result ,multy(under_k.power(i + 1),zz));
                    System.out.println("s re in sub=="+result.size());
            for(int j=0 ; j<result.size() ; j++){
                System.out.println(result.n.get(j));
                
            }
                }
            }

            String str = "";
            for (int i = 0; i < result.size(); i++) {
                str += result.n.get(i);
            }
            JOptionPane.showMessageDialog(null, str);
        }
    }

}
