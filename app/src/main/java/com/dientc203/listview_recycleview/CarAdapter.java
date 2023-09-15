package com.dientc203.listview_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarAdapterViewHoller>{
    private List<CarModel> list;

    public CarAdapter(List<CarModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CarAdapterViewHoller onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false);
        return new CarAdapterViewHoller(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapterViewHoller holder, int position) {
        CarModel carModel = list.get(position);
        if(carModel != null){
            holder.tvName.setText("Name: " + carModel.getName());
            holder.tvColor.setText("Color: " + carModel.getColor());
            holder.tvYear.setText("Year: " + carModel.getYear());
            Picasso.get().load(carModel.getImg()).into(holder.img);
        }
    }

    @Override
    public int getItemCount() {
        if (list != null){
            return list.size();
        }
        return 0;
    }

    public class CarAdapterViewHoller extends RecyclerView.ViewHolder {
        private CardView cardView;
        private ImageView img;
        private TextView tvName;
        private TextView tvColor;
        private TextView tvYear;
        public CarAdapterViewHoller(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            img = (ImageView) itemView.findViewById(R.id.img);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvColor = (TextView) itemView.findViewById(R.id.tv_color);
            tvYear = (TextView) itemView.findViewById(R.id.tv_year);

        }
    }
}
