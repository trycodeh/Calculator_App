package com.example.caluclator2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b7,b6,b8,b9,b0,bAC,bC,b00,bdot,bremainder,bdivison,badd, bsubtract,bmultiply,bequals;
    TextView tvmain,tvsec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        b00 = findViewById(R.id.b00);
        bdot = findViewById(R.id.dot);
        badd = findViewById(R.id.add);
        bsubtract = findViewById(R.id.subtract);
        bAC = findViewById(R.id.AC);
        bC = findViewById(R.id.C);
        bremainder = findViewById(R.id.remaider);
        bdivison = findViewById(R.id.divison);
        bmultiply = findViewById(R.id.multiple);
        bequals = findViewById(R.id.equal);

        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);


        //onClick Listeners

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
                fontSize(tvmain.toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
                fontSize(tvmain.toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");
                fontSize(tvmain.toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
                fontSize(tvmain.toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");
                fontSize(tvmain.toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
                fontSize(tvmain.toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
                fontSize(tvmain.toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
                fontSize(tvmain.toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
                fontSize(tvmain.toString());
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "0");
                fontSize(tvmain.toString());
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "00");
                fontSize(tvmain.toString());
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ".");
                fontSize(tvmain.toString());
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
                fontSize(tvmain.toString());
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val );
                fontSize(tvmain.toString());
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "+");
                fontSize(tvmain.toString());
            }
        });
        bsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "-");
                fontSize(tvmain.toString());
            }
        });
        bmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String val =checkinput(tvmain.getText().toString());
                    tvmain.setText(val +"×");

            }
        });
        bdivison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val= checkinput(tvmain.getText().toString());
                    tvmain.setText(val+ "/");

            }
        });
        bremainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
        try {
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String val = tvmain.getText().toString();
                    String replacedstr = val.replace('÷', '/').replace('×', '*');
                    if(val.length() <= 0 && val.equals("")){
                        tvmain.setText("");
                    }
                    else if (checkinput1(replacedstr)){
                        double result = eval(replacedstr);
                        tvmain.setText(String.valueOf(result));
                        tvsec.setText(val);
                    }
                    else{
                        tvmain.setText("Wrong Input..");
                    }
            }
        });
        }
        catch(Exception e){
            tvmain.setText("Wrong Input..");
        }
    }
    public void fontSize(String str){
        if(str.length()<12){
            tvmain.setTextSize(50);
        }
        else if(str.length()> 12 || str.length() < 30){
            tvmain.setTextSize(30);
        }
       else{
            tvmain.setTextSize(15);
        }

    }
    // checking input
    public static String checkinput( final String str){
        char c=str.charAt(str.length()-1);
        if((c == '+') || (c == '-') || (c=='*') ||(c == '×') ||(c=='/') || (c =='÷')){
            return str.substring(0,str.length()-1);
        }
        else{
            return str;
        }
    }

    public static boolean checkinput1( final String str){
        char c=str.charAt(str.length()-1);
        if((c == '+') || (c == '-') || (c == '*') || (c == '/') || (c == '√') || (c == '÷') || (c == '×')){
            return false;
        }

            return true;
    }


        //eval function

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor


            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}