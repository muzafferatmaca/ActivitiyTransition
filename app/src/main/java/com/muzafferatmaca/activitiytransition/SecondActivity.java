package com.muzafferatmaca.activitiytransition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text2,text3,text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        define();
        al();
    }

    public void define(){
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
    }

    public void al(){

        Bundle bundle = getIntent().getExtras();
        String isim = bundle.getString("isim");
        String tel = bundle.getString("telno");
        String soy = bundle.getString("soyisim");

        text2.setText(isim);
        text3.setText(soy);
        text4.setText(tel);

    }
}
