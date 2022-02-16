package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCl = findViewById(R.id.btnCl);
        btnCl.setOnClickListener(this);
        Button btnPercent = findViewById(R.id.btnPercent);
        btnPercent.setOnClickListener(this);
        Button btnDiv = findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);
        Button btnMult = findViewById(R.id.btnMult);
        btnMult.setOnClickListener(this);
        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        Button btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(this);
        Button btnEq = findViewById(R.id.btnEq);
        btnEq.setOnClickListener(this);
        Button btnComma = findViewById(R.id.btnComma);
        btnComma.setOnClickListener(this);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        Button btnZero = findViewById(R.id.btnZero);
        btnZero.setOnClickListener(this);

        TextView txtvwResult = findViewById(R.id.txtvw);

    }

    String num1 = "0";
    String num2 = "0";
    String op = "";
    String error = "";
    boolean newcalc = true;
    boolean eql = false;

    @Override
    public void onClick(View view) {
        TextView txtvwResult = findViewById(R.id.txtvw);
        String result = txtvwResult.getText().toString();


        if (result.equals("0") || result.equals("Error")) {
            error = "";
            result = "";
        }

        switch(view.getId()) {
            case R.id.btn1:
                if (newcalc) {
                    txtvwResult.setText(result.concat("1"));
                } else {
                    txtvwResult.setText("1");
                    newcalc = true;
                }
                break;
            case R.id.btn2:
                if (newcalc) {
                    txtvwResult.setText(result.concat("2"));
                } else {
                    txtvwResult.setText("2");
                    newcalc = true;
                }
                break;
            case R.id.btn3:
                if (newcalc) {
                    txtvwResult.setText(result.concat("3"));
                } else {
                    txtvwResult.setText("3");
                    newcalc = true;
                }
                break;
            case R.id.btn4:
                if (newcalc) {
                    txtvwResult.setText(result.concat("4"));
                } else {
                    txtvwResult.setText("4");
                    newcalc = true;
                }
                break;
            case R.id.btn5:
                if (newcalc) {
                    txtvwResult.setText(result.concat("5"));
                } else {
                    txtvwResult.setText("5");
                    newcalc = true;
                }
                break;
            case R.id.btn6:
                if (newcalc) {
                    txtvwResult.setText(result.concat("6"));
                } else {
                    txtvwResult.setText("6");
                    newcalc = true;
                }
                break;
            case R.id.btn7:
                if (newcalc) {
                    txtvwResult.setText(result.concat("7"));
                } else {
                    txtvwResult.setText("7");
                    newcalc = true;
                }
                break;
            case R.id.btn8:
                if (newcalc) {
                    txtvwResult.setText(result.concat("8"));
                } else {
                    txtvwResult.setText("8");
                    newcalc = true;
                }
                break;
            case R.id.btn9:
                if (newcalc) {
                    txtvwResult.setText(result.concat("9"));
                } else {
                    txtvwResult.setText("9");
                    newcalc = true;
                }
                break;
            case R.id.btnZero:
                if (newcalc) {
                    txtvwResult.setText(result.concat("0"));
                } else {
                    txtvwResult.setText("0");
                    newcalc = true;
                }
                break;
            case R.id.btnComma:
                if (newcalc) {
                    txtvwResult.setText(result.concat("."));
                } else {
                    txtvwResult.setText(".");
                    newcalc = true;
                }
                break;
            case R.id.btnAdd:
                newcalc = false;
                if (num1.equals("0")) {
                    num1 = txtvwResult.getText().toString();
                    txtvwResult.setText("0");
                } else {
                    if (eql) {
                        num1 = txtvwResult.getText().toString();
                        eql = false;
                    }
                    if (!num2.equals("0")) {
                        if(op.isEmpty()) {
                            op = "add";
                        }
                        double res = operations(op, Double.parseDouble(num1), Double.parseDouble(txtvwResult.getText().toString()));
                        num1 = String.valueOf(res);
                        txtvwResult.setText(num1);

                        eql = true;
                    }

                }
                op = "add";
                break;
            case R.id.btnSub:
                newcalc = false;
                if (num1.equals("0")) {
                    num1 = txtvwResult.getText().toString();
                    txtvwResult.setText("0");
                } else {
                    if (eql) {
                        num1 = txtvwResult.getText().toString();
                        eql = false;
                    }

                    if(!num2.equals("0")) {
                        if(op.isEmpty()) {
                            op = "sub";
                        }
                        double res = operations(op, Double.parseDouble(num1), Double.parseDouble(txtvwResult.getText().toString()));
                        num1 = String.valueOf(res);
                        txtvwResult.setText(num1);
                        newcalc = false;
                        eql = true;
                    }
                }
                op = "sub";
                break;
            case R.id.btnMult:
                newcalc = false;
                if (num1.equals("0")) {
                    num1 = txtvwResult.getText().toString();
                    txtvwResult.setText("0");
                } else {
                    if (eql) {
                        num1 = txtvwResult.getText().toString();
                        eql = false;
                        op = "mult";
                    }

                    if(!num2.equals("0")) {
                        if(op.isEmpty()) {
                            op = "mult";
                        }
                        double res = operations(op, Double.parseDouble(num1), Double.parseDouble(txtvwResult.getText().toString()));
                        num1 = String.valueOf(res);
                        txtvwResult.setText(num1);
                        newcalc = false;
                        eql = true;
                    }
                }
                op = "mult";
                break;
            case R.id.btnDiv:
                newcalc = false;
                if (num1.equals("0")) {
                    num1 = txtvwResult.getText().toString();
                } else {
                    if (eql) {
                        num1 = txtvwResult.getText().toString();
                        txtvwResult.setText("0");
                        eql = false;
                        op = "div";
                    }

                    if (!num2.equals("0")) {
                        if(op.isEmpty()) {
                            op = "div";
                        }
                        double res = operations(op, Double.parseDouble(num1), Double.parseDouble(txtvwResult.getText().toString()));
                        num1 = String.valueOf(res);
                        txtvwResult.setText(num1);
                        newcalc = false;
                        eql = true;
                    }
                };
                op = "div";
                break;
            case R.id.btnPercent:
                if (!result.isEmpty() && !result.equals("0")) {
                    txtvwResult.setText(String.valueOf(Double.parseDouble(result) / 100));
                } else {
                    txtvwResult.setText("0");
                }
                break;
            case R.id.btnCl:
                num1 = "0";
                num2 = "0";
                op = "";
                txtvwResult.setText("0");
                break;
            case R.id.btnEq:
                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(txtvwResult.getText().toString());
                double r = operations(op, n1, n2);

                op = "";
                if (error.isEmpty()) {
                    num1 = String.valueOf(r);
                    txtvwResult.setText(num1);
                    newcalc = false;
                    eql = true;
                } else {
                    txtvwResult.setText(error);
                    num1 = "0";
                }
                break;
        }
    }

    public double operations(String op, double n1, double n2) {
        double res = 0;
        switch(op) {
            case "add":
                res = n1 + n2;
                break;
            case "sub":
                res = n1 - n2;
                break;
            case "mult":
                res = n1 * n2;
                break;
            case "div":
                if (n2 != 0) {
                    res = n1 / n2;;
                } else {
                    error = "Error";
                }
                break;
            case "mod":
                res = n1 + n2;;
                break;
            default:
                break;
        }
        return res;
    }
}