package com.example.navigation5;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.navigation5.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed1,ed2;
    Button btn;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        btn=(Button) findViewById(R.id.btn);
        sp=getSharedPreferences("mypref",MODE_PRIVATE);
        if(sp.contains("Email"))
            ed1.setText(sp.getString("Email",""));
        if(sp.contains("Password"))
            ed2.setText(sp.getString("Password",""));
        btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View view)
    {
        String a= ed1.getText().toString();
        String b=ed2.getText().toString();
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("Email",a);
        ed.putString("Password",b);
        ed.apply();
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}
