package com.cyj.a20181229_01_spinnertest;

import android.os.Bundle;
import android.widget.Spinner;

import com.cyj.a20181229_01_spinnertest.adapters.CompanyAdapter;
import com.cyj.a20181229_01_spinnertest.datas.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    CompanyAdapter mAdapter;
    List<Restaurant> restaurants = new ArrayList<Restaurant>();
    private android.widget.Spinner companySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        mAdapter = new CompanyAdapter(mContext, restaurants);
        companySpinner.setAdapter(mAdapter);

        fillRestaurants();

    }

    private void fillRestaurants() {
        restaurants.clear();

        restaurants.add(new Restaurant("도미노피자", "광진구", "09:00 ~ 22:00","http://cfs15.tistory.com/image/24/tistory/2008/11/05/18/00/491160cb593e2"));
        restaurants.add(new Restaurant("미스터피자", "관악구", "14:00 ~ 24:00", "http://postfiles12.naver.net/20160530_171/ppanppane_14646177044221JRNd_PNG/%B9%CC%BD%BA%C5%CD%C7%C7%C0%DA_%B7%CE%B0%ED_%281%29.png?type=w966"));
        restaurants.add(new Restaurant("피자헛", "강동구", "12:00 ~ 23:00", "https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2"));
        restaurants.add(new Restaurant("파파존스", "성북구", "10:00 ~ 21:00", "http://postfiles2.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w966"));
    }


    @Override
    public void bindViews() {
        this.companySpinner = (Spinner) findViewById(R.id.companySpinner);
    }
}
