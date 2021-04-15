package com.example.sjw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        RecyclerView recyclerView = findViewById(R.id.cart_recycler);
        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        items.add(new CartItem("name","200","3000","6000000"));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CartAdapter adapter = new CartAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}