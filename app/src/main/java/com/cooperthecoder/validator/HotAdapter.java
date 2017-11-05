package com.cooperthecoder.validator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by phill on 11/5/2017.
 */

public class HotAdapter  extends RecyclerView.Adapter<HotAdapter.MyViewHolder> {

    private ArrayList<DataModel2> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView farmer;
        TextView price;
        ImageView product;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.name = (TextView) itemView.findViewById(R.id.name);
            this.farmer = (TextView) itemView.findViewById(R.id.farmer);
            this.price = (TextView) itemView.findViewById(R.id.price);
            this.product = (ImageView) itemView.findViewById(R.id.product);


        }
    }

    public HotAdapter(ArrayList<DataModel2> data) {
        this.dataSet = data;
    }

    @Override
    public HotAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardhot, parent, false);



        HotAdapter.MyViewHolder myViewHolder = new HotAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final HotAdapter.MyViewHolder holder, final int listPosition) {

        TextView name = holder.name;
        TextView price = holder.price;
        TextView farmer = holder.farmer;
        ImageView product = holder.product;



        name.setText(dataSet.get(listPosition).getName());
        price.setText(dataSet.get(listPosition).getprice());
        farmer.setText(dataSet.get(listPosition).getfarmer());
        product.setImageResource(dataSet.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}

