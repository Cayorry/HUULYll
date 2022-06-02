package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KT_HUULY extends AppCompatActivity {
 private Button btnchuyendoi;
 private EditText DuongLich;
 private TextView AmLich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        btnchuyendoi = (Button) findViewById(R.id.button);
        DuongLich = (EditText) findViewById(R.id.duong);
        AmLich = (TextView)  findViewById(R.id.am);
        btnchuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String []arrCan={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
                String []arrChi={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                int namDuong=Integer.parseInt(DuongLich.getText().toString());
                String can=arrCan[namDuong%10];
                String chi=arrChi[namDuong%12];
                AmLich.setText(can+" "+chi);
            }
        });

    }
}