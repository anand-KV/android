package com.example.addition;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{
    EditText n1,n2,res;
    Button sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.numtext);
        n2 = (EditText) findViewById(R.id.num2text);
        res = (EditText) findViewById(R.id.result);
        sum = (Button)findViewById(R.id.sumbut);
        sum.setOnClickListener(this);


    }
    @Override
    public void onClick(View view)
    {
        if (view.getId()==R.id.sumbut)
        {
            int a = Integer.parseInt(n1.getText().toString());
            int b = Integer.parseInt(n2.getText().toString());
            int c =a+b;
            res.setText(String.valueOf(c));
        }
    }


}
