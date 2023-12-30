package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void onAdd(View a)
    {
        if(a.getId()==R.id.add)
        {
            EditText a1=(EditText)findViewById(R.id.num1);
            EditText a2=(EditText)findViewById(R.id.num2);
            int n1,n2,ans;
            n1=Integer.parseInt(a1.getText().toString());
            n2=Integer.parseInt(a2.getText().toString());
            TextView t=(TextView) findViewById(R.id.res);
            ans=n1+n2;
            t.setText(String.valueOf(ans));
        }
    }

    @SuppressLint("SetTextI18n")
    public void onSub(View b)
    {
        if(b.getId()==R.id.sub)
        {
            EditText a1=(EditText)findViewById(R.id.num1);
            EditText a2=(EditText)findViewById(R.id.num2);
            int n1,n2,ans;
            n1=Integer.parseInt(a1.getText().toString());
            n2=Integer.parseInt(a2.getText().toString());
            TextView t=(TextView) findViewById(R.id.res);
            ans=n1-n2;
            t.setText(String.valueOf(ans));
        }
    }
    @SuppressLint("SetTextI18n")
    public void onMul(View c)
    {
        if(c.getId()==R.id.mul)
        {
            EditText a1=(EditText)findViewById(R.id.num1);
            EditText a2=(EditText)findViewById(R.id.num2);
           int n1,n2,ans;
            n1=Integer.parseInt(a1.getText().toString());
            n2=Integer.parseInt(a2.getText().toString());
            TextView t=(TextView) findViewById(R.id.res);
            ans=n1*n2;
            t.setText(String.valueOf(ans));
        }
    }
    @SuppressLint("SetTextI18n")
    public void onDiv(View d)
    {
        if(d.getId()==R.id.div)
        {
            EditText a1=(EditText)findViewById(R.id.num1);
            EditText a2=(EditText)findViewById(R.id.num2);
            int n1,n2,ans;
            n1=Integer.parseInt(a1.getText().toString());
            n2=Integer.parseInt(a2.getText().toString());
            TextView t=(TextView) findViewById(R.id.res);
            ans=n1/n2;
            t.setText(String.valueOf(ans));
        }
    }

}