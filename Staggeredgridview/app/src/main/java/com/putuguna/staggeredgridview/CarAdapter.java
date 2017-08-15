package com.putuguna.staggeredgridview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by putuguna on 31/01/17.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder>{

    private List<CarModel> listCar;
    private Context context;

    public CarAdapter(List<CarModel> listCar, Context context) {
        this.listCar = listCar;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_car_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CarModel car  = listCar.get(position);

        holder.tvCarName.setText("Name : " + car.getCarName());
        holder.tvCarPrice.setText("Price : " + car.getCarPrice());
        holder.tvCarQty.setText("Quantity : " + car.getCarQty());

        Glide.with(context)
                .load(car.getCarImage())
                .into(holder.ivCar);

        holder.tvCarAvailability.setText("Available Here : " + car.getCarAvailable());

        //on click linear layout to check the position
        holder.llCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position : " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCar.size();
    }

    // inner class of adapter
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView ivCar;
        public TextView tvCarName;
        public TextView tvCarPrice;
        public TextView tvCarQty;
        public TextView tvCarAvailability;
        public LinearLayout llCar;

        public ViewHolder(View itemView) {
            super(itemView);

            ivCar = (ImageView) itemView.findViewById(R.id.image_view_car);
            tvCarName = (TextView) itemView.findViewById(R.id.text_view_car_name);
            tvCarPrice = (TextView) itemView.findViewById(R.id.text_view_car_price);
            tvCarQty = (TextView) itemView.findViewById(R.id.text_view_car_qty);
            tvCarAvailability = (TextView) itemView.findViewById(R.id.text_view_car_available);
            llCar = (LinearLayout) itemView.findViewById(R.id.ll_car);
        }
    }
}
