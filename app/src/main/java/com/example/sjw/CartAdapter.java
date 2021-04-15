package com.example.sjw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    List<CartItem>items;
    public CartAdapter(List<CartItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CartViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_item,
                        parent,
                        false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder{
        TextView index,name,price,quantity,total;
        public CartViewHolder(View view){
            super(view);
            index=view.findViewById(R.id.index_i);
            name=view.findViewById(R.id.name_i);
            price=view.findViewById(R.id.price_i);
            quantity=view.findViewById(R.id.quantity_i);
            total=view.findViewById(R.id.total_i);
        }
        public void bind(CartItem item){
            name.setText(item.getName());
            price.setText(item.getPrice());
            quantity.setText(item.getQuantity());
            total.setText(item.getTotal());
        }
    }
}
