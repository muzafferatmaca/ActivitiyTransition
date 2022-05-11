package com.muzafferatmaca.activitiytransition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView isim, telNo, soyIsim;
    List<TransitionModel> list;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        define();
        fillList();
        gec();
    }

    public void define() {
        isim = findViewById(R.id.isim);
        telNo = findViewById(R.id.telNo);
        soyIsim = findViewById(R.id.soyIsim);
    }

    public void fillList() {
        list = new ArrayList<>();
        TransitionModel m1 = new TransitionModel("Muzaffer", "0000000", "atmaca");
        TransitionModel m2 = new TransitionModel("Ahmet", "0000000", "denden");
        TransitionModel m3 = new TransitionModel("veli", "0000000", "yılmaz");
        TransitionModel m4 = new TransitionModel("akın", "0000000", "sarı");
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
    }

    public void gec() {

        listView = findViewById(R.id.listView);
        TransitionAdapter adp = new TransitionAdapter(list, this, this);
        listView.setAdapter(adp);


    }
}
