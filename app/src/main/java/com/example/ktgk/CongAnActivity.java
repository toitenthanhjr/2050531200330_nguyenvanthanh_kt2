package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class CongAnActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<CauThuBongDa> arrayBaiHat;
    CongAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cauthubongda);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AnhXa();
        adapter = new CongAnAdapter(this, R.layout.layoutbaihat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myIntent = new Intent(CongAnActivity.this, a_congan1.class);
                    startActivity(myIntent);
                }
                if(position==1){
                    Intent myIntent = new Intent(CongAnActivity.this, b_congan2.class);
                    startActivity(myIntent);
                }
                if(position==2){
                    Intent myIntent = new Intent(CongAnActivity.this, c_congan3.class);
                    startActivity(myIntent);
                }
                if(position==3){
                    Intent myIntent = new Intent(CongAnActivity.this, d_congan4.class);
                    startActivity(myIntent);
                }
                if(position==4){
                    Intent myIntent = new Intent(CongAnActivity.this, e_congan5.class);
                    startActivity(myIntent);
                }
                if(position==5){
                    Intent myIntent = new Intent(CongAnActivity.this, f_congan6.class);
                    startActivity(myIntent);
                }
                if(position==6){
                    Intent myIntent = new Intent(CongAnActivity.this, g_congan7.class);
                    startActivity(myIntent);
                }
                if(position==7){
                    Intent myIntent = new Intent(CongAnActivity.this, h_congan8.class);
                    startActivity(myIntent);
                }
                if(position==8){
                    Intent myIntent = new Intent(CongAnActivity.this, i_congan9.class);
                    startActivity(myIntent);
                }
                if(position==9){
                    Intent myIntent = new Intent(CongAnActivity.this, j_congan10.class);
                    startActivity(myIntent);
                }

            }
        });
    }
    private void AnhXa(){
        lvBaiHat = (ListView) findViewById(R.id.listviewBaiHat);
        arrayBaiHat = new ArrayList<>();
        arrayBaiHat.add(new CauThuBongDa("Lê Đình Tân", "Thiếu tá",R.drawable.congan1));
        arrayBaiHat.add(new CauThuBongDa("Phạm Khánh", "Trung tá",R.drawable.congan2));
        arrayBaiHat.add(new CauThuBongDa("Nguyễn Hào Nam", "Thượng tá",R.drawable.congan3));
        arrayBaiHat.add(new CauThuBongDa("Trần Minh ", "Thượng úy",R.drawable.congan4));
        arrayBaiHat.add(new CauThuBongDa("Lê Trường Trọng", "Trung úy",R.drawable.congan5));
        arrayBaiHat.add(new CauThuBongDa("Hồ Văn Nhật", "Đại tá",R.drawable.congan6));
        arrayBaiHat.add(new CauThuBongDa("Hồ Bá Thân", "Thiếu úy",R.drawable.congan7));
        arrayBaiHat.add(new CauThuBongDa("Nguyễn Nhật Nam", "Đại úy",R.drawable.congan8));
        arrayBaiHat.add(new CauThuBongDa("Văn Đức Nam ", "Trung tá",R.drawable.congan9));
        arrayBaiHat.add(new CauThuBongDa("Lê Ái Đào", "Thượng tướng",R.drawable.congan10));
    }


}
