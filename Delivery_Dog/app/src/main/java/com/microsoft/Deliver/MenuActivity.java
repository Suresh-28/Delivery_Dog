package com.microsoft.Deliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhruva.shopping.R;

public class MenuActivity extends AppCompatActivity {

    ImageView order,address,cart,settig,log;
    TextView order1,cart1,addres1s,accout,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        order=findViewById(R.id.orders);
        address=findViewById(R.id.address);
        cart=findViewById(R.id.cart);
        settig=findViewById(R.id.account);
        log=findViewById(R.id.logout1);


        order1=findViewById(R.id.textView58);
        cart1=findViewById(R.id.cart1);
        addres1s=findViewById(R.id.address1);
        accout=findViewById(R.id.acc);
        logout=findViewById(R.id.log);

        order1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(getApplicationContext(),UserOrdersActivity.class);
                startActivity(intent5);
            }
        });
        cart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(getApplicationContext(),CartActivity.class);
                startActivity(intent6);
            }
        });
        addres1s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(getApplicationContext(),LocationActivity.class);
                startActivity(intent7);
            }
        });
        accout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(getApplicationContext(),SettinsActivity.class);
                startActivity(intent8);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent4);
                finish();
            }
        });



        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),UserOrdersActivity.class);
                startActivity(intent);
            }
        });
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),LocationActivity.class);
                startActivity(intent1);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),CartActivity.class);
                startActivity(intent2);
            }
        });
        settig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),SettinsActivity.class);
                startActivity(intent3);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent4);
                finish();
            }
        });
    }
}