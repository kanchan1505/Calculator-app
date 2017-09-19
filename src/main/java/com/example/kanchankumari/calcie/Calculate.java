package com.example.kanchankumari.calcie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {
    TextView l1;
    EditText t1;
    boolean flag=false;
    String operand1;
    String operand2;
    double result;
    String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        l1=(TextView)findViewById(R.id.l1);
        t1=(EditText)findViewById(R.id.t1);

    }
    public void one(View v)
    {
        if(flag)
        {
            t1.setText("1");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"1");
        }

    }
    public void two(View v)
    {
        if(flag)
        {
            t1.setText("2");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"2");
        }

    }
    public void three(View v)
    {
        if(flag)
        {
            t1.setText("3");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"3");
        }

    }
    public void four(View v)
    {
        if(flag)
        {
            t1.setText("4");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"4");
        }

    }
    public void five(View v)
    {
        if(flag)
        {
            t1.setText("5");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"5");
        }
    }
    public void six(View v)
    {
        if(flag)
        {
            t1.setText("6");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"6");
        }
    }
    public void seven(View v)
    {
        if(flag)
        {
            t1.setText("7");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"7");
        }
    }
    public void eight(View v)
    {
        if(flag)
        {
            t1.setText("8");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"8");
        }
    }
    public void nine(View v)
    {
        if(flag)
        {
            t1.setText("9");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"9");
        }
    }
    public void zero(View v)
    {
        if(flag)
        {
            t1.setText("0");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+"0");
        }
    }
    public void point(View v)
    {
        if(flag)
        {
            t1.setText(".");
            flag=false;
        }
        else
        {
            t1.setText(t1.getText()+".");
        }
    }
    public  void add(View v)
    {
        operand1=t1.getText().toString();
        action="plus";
        flag=true;
        l1.setText(t1.getText()+"+");
    }

    public  void sub(View v)
    {
        operand1=t1.getText().toString();
        action="minus";
        flag=true;
        l1.setText(t1.getText()+"-");
    }
    public  void div(View v)
    {
        operand1=t1.getText().toString();
        action="divide";
        flag=true;
        l1.setText(t1.getText()+"/");
    }
    public  void mul(View v)
    {
        operand1=t1.getText().toString();
        action="multiply";
        flag=true;
        l1.setText(t1.getText()+"*");
    }

    public void onc(View v)
    {
        t1.setText("");
        l1.setText("");
    }
    public void eq(View v)
    {
        double d1;
        double d2;
        operand2=t1.getText().toString();
        if(flag==false)
        {
            if(action.equals("plus"))
            {
                d2=Double.parseDouble(operand2);
                d1=Double.parseDouble(operand1);
                result=d1+d2;
                t1.setText(""+result);
                flag=true;
            }
            else if(action.equals("minus"))
            {
                d2=Double.parseDouble(operand2);
                d1=Double.parseDouble(operand1);
                result=d1-d2;
                t1.setText(""+result);
                flag=true;
            }
            else if(action.equals("divide"))
            {
                d2=Double.parseDouble(operand2);
                d1=Double.parseDouble(operand1);
                result=d1/d2;
                t1.setText(""+result);
                flag=true;
            }
            else if(action.equals("multiply"))
            {
                d2=Double.parseDouble(operand2);
                d1=Double.parseDouble(operand1);
                result=d1*d2;
                t1.setText(""+result);
                flag=true;
            }

        }
    }
}
