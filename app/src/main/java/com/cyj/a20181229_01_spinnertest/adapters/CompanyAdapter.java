package com.cyj.a20181229_01_spinnertest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cyj.a20181229_01_spinnertest.R;
import com.cyj.a20181229_01_spinnertest.datas.Restaurant;

import java.util.List;

public class CompanyAdapter extends ArrayAdapter<Restaurant> {

    Context mContext;
    List<Restaurant> mList;
    LayoutInflater inf;

    public CompanyAdapter(Context context, List<Restaurant> list){
        super(context, R.layout.company_list_item, list);

        this.mContext = context;
        this.mList = list;
        this.inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.company_list_item, null);
        }

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

        Restaurant data = mList.get(position);

        nameTxt.setText(data.getName());

        Glide.with(mContext).load(data.getLogoURL()).into(logoImg);

        return row;
    }

    @Override
    public View getDropDownView(int position, View convertView,  ViewGroup parent) {
        View row = convertView;
        if(row == null){
            row = inf.inflate(R.layout.company_list_item, null);
        }

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

        Restaurant data = mList.get(position);

        nameTxt.setText(data.getName());

        Glide.with(mContext).load(data.getLogoURL()).into(logoImg);

        return row;
    }
}
