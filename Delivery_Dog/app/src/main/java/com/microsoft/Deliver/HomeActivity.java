package com.microsoft.Deliver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.dhruva.shopping.R;
import com.microsoft.Deliver.Model.Products;
import com.microsoft.Deliver.Prevalent.Prevalent;
import com.microsoft.Deliver.ViewHolder.ProductViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity  {
    private DatabaseReference ProductsRef;
    private DatabaseReference ProductsRef1;
    private DatabaseReference ProductsRef2;
    ImageView imageView;
    FloatingActionButton m;
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    private RecyclerView recyclerView1;
    RecyclerView.LayoutManager layoutManager1;

    private RecyclerView recyclerView2;
    RecyclerView.LayoutManager layoutManager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        ProductsRef = FirebaseDatabase.getInstance().getReference().child("Products");
        ProductsRef1 = FirebaseDatabase.getInstance().getReference().child("BestSelling");
        ProductsRef2 = FirebaseDatabase.getInstance().getReference().child("NonVeg");

        imageView=findViewById(R.id.imageView7);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),Suggestio.class);
                startActivity(intent3);
            }
        });

        m=findViewById(R.id.menu);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent);
            }
        });









        recyclerView = findViewById(R.id.recycler_menu);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView1 = findViewById(R.id.bestcycle);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);

        recyclerView2 = findViewById(R.id.nonvegcycle);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);



    }
    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerOptions<Products> options =
                new FirebaseRecyclerOptions.Builder<Products>()
                        .setQuery(ProductsRef, Products.class)
                        .build();

        FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter =
                new FirebaseRecyclerAdapter<Products, ProductViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull ProductViewHolder holder, int position, @NonNull final Products model)
                    {
                        holder.txtProductName.setText(model.getPname());
                        holder.txtProductDescription.setText(model.getDescription());
                        holder.txtProductPrice.setText("₹" + model.getPrice() );
                        Picasso.get().load(model.getImage()).into(holder.imageView);
                        holder.itemView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(HomeActivity.this,ProductDetailsActivity.class);
                                intent.putExtra("pid",model.getPid());
                                startActivity(intent);
                            }
                        });
                    }

                    @NonNull
                    @Override
                    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_items_layout, parent, false);
                        ProductViewHolder holder = new ProductViewHolder(view);
                        return holder;
                    }
                };
        recyclerView.setAdapter(adapter);
        adapter.startListening();













        FirebaseRecyclerOptions<Products> options1 =
                new FirebaseRecyclerOptions.Builder<Products>()
                        .setQuery(ProductsRef1, Products.class)
                        .build();

        FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter1 =
                new FirebaseRecyclerAdapter<Products, ProductViewHolder>(options1) {
                    @Override
                    protected void onBindViewHolder(@NonNull ProductViewHolder holder1, int position, @NonNull final Products model)
                    {
                        holder1.txtProductName.setText(model.getPname());
                        holder1.txtProductDescription.setText(model.getDescription());
                        holder1.txtProductPrice.setText("₹" + model.getPrice() );
                        Picasso.get().load(model.getImage()).into(holder1.imageView);
                        holder1.itemView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(HomeActivity.this,ProductDetailsActivity.class);
                                intent.putExtra("pid",model.getPid());
                                startActivity(intent);
                            }
                        });
                    }

                    @NonNull
                    @Override
                    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_items_layout, parent, false);
                        ProductViewHolder holder1 = new ProductViewHolder(view1);
                        return holder1;
                    }
                };
        recyclerView1.setAdapter(adapter1);
        adapter1.startListening();







        FirebaseRecyclerOptions<Products> options2 =
                new FirebaseRecyclerOptions.Builder<Products>()
                        .setQuery(ProductsRef2, Products.class)
                        .build();

        FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter2 =
                new FirebaseRecyclerAdapter<Products, ProductViewHolder>(options2) {
                    @Override
                    protected void onBindViewHolder(@NonNull ProductViewHolder holder2, int position, @NonNull final Products model)
                    {
                        holder2.txtProductName.setText(model.getPname());
                        holder2.txtProductDescription.setText(model.getDescription());
                        holder2.txtProductPrice.setText("₹" + model.getPrice() );
                        Picasso.get().load(model.getImage()).into(holder2.imageView);
                        holder2.itemView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent =new Intent(HomeActivity.this,ProductDetailsActivity.class);
                                intent.putExtra("pid",model.getPid());
                                startActivity(intent);
                            }
                        });
                    }

                    @NonNull
                    @Override
                    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_items_layout, parent, false);
                        ProductViewHolder holder2 = new ProductViewHolder(view2);
                        return holder2;
                    }
                };
        recyclerView2.setAdapter(adapter2);
        adapter2.startListening();
    }

}









