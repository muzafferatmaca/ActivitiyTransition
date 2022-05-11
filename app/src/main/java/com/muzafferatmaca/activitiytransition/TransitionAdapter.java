package com.muzafferatmaca.activitiytransition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class TransitionAdapter extends BaseAdapter {

    List<TransitionModel> list;
    Context context;
    Activity activity;

    public TransitionAdapter(List<TransitionModel> list, Context context, Activity activity) {
        this.list = list;
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);

        TextView isim = convertView.findViewById(R.id.isim);
        TextView telNo = convertView.findViewById(R.id.telNo);
        TextView soyIsim = convertView.findViewById(R.id.soyIsim);
        LinearLayout linearLayout = convertView.findViewById(R.id.anaLayout);

        final String isimS = list.get(position).getIsim();
        final String soyIsimS = list.get(position).getSoyIsim();
        final String telNoS = list.get(position).getTelNo();

        isim.setText(isimS);
        soyIsim.setText(soyIsimS);
        telNo.setText(telNoS);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("isim", isimS);
                intent.putExtra("soyisim", soyIsimS);
                intent.putExtra("telno", telNoS);
                activity.startActivity(intent);
            }
        });


        return convertView;
    }
}
