package com.iuh.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomClothesAdapter extends BaseAdapter {

    private Context ctx;
    private int layoutItem;
    private ArrayList<Clothes> arrayList;

    public CustomClothesAdapter(Context ctx, int layoutItem, ArrayList<Clothes> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);
        //
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);
        ImageView imgClothes = convertView.findViewById(R.id.imgViewClothes);
        //
        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(arrayList.get(position).getPrice());
        imgClothes.setImageResource(arrayList.get(position).getImageClothes());

        return convertView;
    }
}
