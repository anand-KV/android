package com.example.factorial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText e,fact;
    Button b;
    //TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.num);
        fact = (EditText) findViewById(R.id.fact);
        b = (Button)findViewById(R.id.btn);
        b.setOnClickListener(this);


    }
    @Override
    public void onClick(View view)
    {
        if (view.getId()==R.id.btn)
        {
            int a = Integer.parseInt(e.getText().toString());
            int f=1;
            for(int i=a;i>=1;i--)
                f=f*i;
            fact.setText(String.valueOf(f));
        }
    }


}
