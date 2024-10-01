package com.example.navigation5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView t1,t2;
    Button b;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        b=(Button) findViewById(R.id.b1);
        sp=getSharedPreferences("mypref",MODE_PRIVATE);
        if(sp.contains("Email"))
            t1.setText(sp.getString("Email",""));
        if(sp.contains("Password"))
            t2.setText(sp.getString("Password",""));
        b.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);


    }
}
