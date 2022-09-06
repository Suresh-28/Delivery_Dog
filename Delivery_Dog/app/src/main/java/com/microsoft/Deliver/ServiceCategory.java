package com.microsoft.Deliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dhruva.shopping.R;

public class ServiceCategory extends AppCompatActivity {

    ImageView bike,car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_category);
        bike=findViewById(R.id.bike);
        car=findViewById(R.id.car);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ServiceActivity.class);
                startActivity(intent);
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),ServiceActivity.class);
                startActivity(intent1);
            }
        });
    }
}