package com.microsoft.Deliver;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dhruva.shopping.R;


public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView tShirts, sportsTShirts;
    private ImageView glasses, walletsBagsPurses, shoes;
    private ImageView headPhonesHandFree, Laptops, watches, mobilePhones;
    private Button LogoutBtn, CheckOrdersBtn;
    TextView exclusive,best,nonveg;
TextView  femaleDresses,sweathers,hatsCaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
        exclusive=findViewById(R.id.textView51);
        best=findViewById(R.id.best);
        nonveg=findViewById(R.id.nonveg);

        exclusive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AdminAddNewProductActivity.class);
                startActivity(intent);
            }
        });
        best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),BestSellingActivity.class);
                startActivity(intent1);
            }
        });
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),NonVegActivity.class);
                startActivity(intent2);
            }
        });











        CheckOrdersBtn=findViewById(R.id.check_orders_btn);
        CheckOrdersBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {


                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        tShirts = (ImageView) findViewById(R.id.t_shirts);
        sportsTShirts = (ImageView) findViewById(R.id.sports_t_shirts);


        glasses = (ImageView) findViewById(R.id.glasses);


        shoes = (ImageView) findViewById(R.id.shoes);

        watches = (ImageView) findViewById(R.id.watches);
        mobilePhones = (ImageView) findViewById(R.id.mobilephones);


        tShirts.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {


                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });
        sportsTShirts.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sports tShirts");
                startActivity(intent);
            }
        });








        glasses.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });









        shoes.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);
            }
        });







        watches.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });


        mobilePhones.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Mobile Phones");
                startActivity(intent);
            }
        });
    }
}
