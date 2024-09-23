package com.calc;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class controler {
    String enseñar = "";
    String num1 = "";
    String num2 = "";
    boolean guard = true;
    boolean fin = false;
    String simb = "";

    private void dondeGuard(String num){
        if (guard){
            num1 += num;
        }
        else {
            num2 += num;
        }
    }
    private void borrar(){
        if (guard){
            num1 = "";
            enseñar = "";
        }
        else {
            num2 += "";
            enseñar = num1+simb;
        }
    }

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button0;

    @FXML
    private Button buttonMult;

    @FXML
    private Button buttonRest;

    @FXML
    private Button buttonSum;

    @FXML
    private Button buttonDiv;

    @FXML
    private Button buttonRes;

    @FXML
    private Button buttonCe;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonBorr;

    @FXML
    private Text text;

    @FXML
    private void one(ActionEvent event){
        enseñar += "1";
        this.dondeGuard("1");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void two(ActionEvent event){
        enseñar += "2";
        this.dondeGuard("2");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void three(ActionEvent event){
        enseñar += "3";
        this.dondeGuard("3");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void four(ActionEvent event){
        enseñar += "4";
        this.dondeGuard("4");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void five(ActionEvent event){
        enseñar += "5";
        this.dondeGuard("5");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void six(ActionEvent event){
        enseñar += "6";
        this.dondeGuard("6");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void seven(ActionEvent event){
        enseñar += "7";
        this.dondeGuard("7");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void eight(ActionEvent event){
        enseñar += "8";
        this.dondeGuard("8");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void nine(ActionEvent event){
        enseñar += "9";
        this.dondeGuard("9");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void cero(ActionEvent event){
        enseñar += "0";
        this.dondeGuard("0");
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void sum(ActionEvent event){
        enseñar += "+";
        if (guard){
            simb = "+";
            text.setText(String.valueOf(enseñar));
            guard = false;
        }

    }
    @FXML
    private void rest(ActionEvent event){
        enseñar += "-";
        if (guard){
            simb = "-";
            text.setText(String.valueOf(enseñar));
        }
        guard = false;
    }
    @FXML
    private void mult(ActionEvent event){
        enseñar += "*";
        if (guard){
            simb = "*";
            text.setText(String.valueOf(enseñar));
        }
        guard = false;
    }
    @FXML
    private void div(ActionEvent event){
        enseñar += "/";
        if (guard){
            simb = "/";
            text.setText(String.valueOf(enseñar));
        }
        guard = false;
    }
    @FXML
    private void CE(ActionEvent event){
        enseñar += "";
        text.setText(String.valueOf(enseñar));
        guard = true;
        num1 = "";
        num2 = "";
        simb = "";
    }
    @FXML
    private void bor(ActionEvent event){
        this.borrar();
        text.setText(String.valueOf(enseñar));
    }

    @FXML
    private void del(ActionEvent event){
        if (!enseñar.isEmpty()) {
            enseñar = enseñar.substring(0, enseñar.length() - 1);
            if (guard & !num1.isEmpty()){
                num1 = num1.substring(0, num1.length() - 1);
            }
            else if (!guard & !num2.isEmpty()) {
                num2 = num2.substring(0, num2.length() - 1);
            }
        }
        text.setText(String.valueOf(enseñar));
    }
    @FXML
    private void res(ActionEvent event){
        if (!num1.isEmpty() & !num2.isEmpty()){
            int numCal1 = Integer.parseInt(num1);
            int numCal2 = Integer.parseInt(num2);
            int result = 0;
            switch (simb){
                case "+":
                    result = numCal1 + numCal2;
                    break;
                case "-":
                    result = numCal1 - numCal2;
                    break;
                case "*":
                    result = numCal1 * numCal2;
                    break;
                case "/":
                    result = numCal1 / numCal2;
                    break;
            }
            num1 = "";
            num2 = "";
            enseñar = ""+result;
            fin = true;
            simb = "";
        }

        text.setText(String.valueOf(enseñar));
        if (fin){
            enseñar = "";

        }
    }

}


