package com.example.components4;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    EditText et;
    CheckBox cb;
    ToggleButton tb;
    TextView tv;
    LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.et);
        cb=(CheckBox) findViewById(R.id.cb);
        tb=(ToggleButton) findViewById(R.id.tb);
        tv=(TextView) findViewById(R.id.tv) ;
        l=(LinearLayout) findViewById(R.id.main) ;
        et.addTextChangedListener(this);
        cb.setOnClickListener(this);
        tb.setOnCheckedChangeListener(this);
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}


    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}


    @Override
    public void afterTextChanged(Editable editable) {
       /*if(et == editable)
       {*/
        Float num;
        String s = editable.toString();
        if (!s.isEmpty()) {
            num = Float.parseFloat(s);
            if (num > 100)
                editable.replace(0, editable.length(), "100");
        }
        // }
    }


    @Override
    public void onClick(View view)
    {
        if (cb.isChecked())
            Toast.makeText(this,"Terms and Conditions accepted",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Accept Terms and Conditions ",Toast.LENGTH_LONG).show();


    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
    {
        if (b)
        {
            l.setBackgroundColor(Color.DKGRAY);
            cb.setTextColor(Color.WHITE);
            tv.setTextColor(Color.WHITE);
            tb.setTextColor(Color.WHITE);
            et.setTextColor(Color.WHITE);
        }
        else {
            l.setBackgroundColor(Color.WHITE);
            cb.setTextColor(Color.DKGRAY);
            tv.setTextColor(Color.DKGRAY);
            tb.setTextColor(Color.DKGRAY);
            et.setTextColor(Color.DKGRAY);
        }
    }
}
