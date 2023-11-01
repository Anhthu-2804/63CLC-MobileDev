package com.anhthu.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.List;

import javax.sql.DataSource;

public class CountryArrayAdapter extends BaseAdapter
{
    // Class's attributes
    List<Country> lstDataSource;
    private LayoutInflater inflater;
    private Context context;
    // Constructor
    public CountryArrayAdapter(List<Country> lstDataSource, Context context) {
        this.lstDataSource = lstDataSource;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    //inner class
    class CountryItemViewHoder {// mapping from customize item XML layout
        ImageView flagView;
        TextView countryNameView;
        TextView populationView;
    }
    @Override
    public int getCount() {
        return lstDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return lstDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {  //later
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CountryItemViewHoder itemViewHoder;
        if (view ==null)
        {
            // XML item view --> Java item view
            view = inflater.inflate(R.layout.country_item_layout,null);
            // get Ref: Java  -- XML
            itemViewHoder = new CountryItemViewHoder();
            itemViewHoder.flagView= view.findViewById(R.id.imageViewFlag);
            itemViewHoder.countryNameView = view.findViewById(R.id.textView);
            itemViewHoder.populationView= view.findViewById(R.id.textView2);
            //
            view.setTag(itemViewHoder);
        }
        else
        {
            itemViewHoder =(CountryItemViewHoder)view.getTag();
        }
        // Set item's data
        Country countryItem = lstDataSource.get(i);
        itemViewHoder.countryNameView.setText( countryItem.getCountryName() );
        itemViewHoder.populationView.setText("Population: " + countryItem.getPopulation() );
        //image data,  need your own function
        int flagID = getImgIDbyResName( countryItem.getCountryFlag() );
        itemViewHoder.flagView.setImageResource(flagID);

        return view;
    }  // end of getView
    //My own function for reading image ID from filename in mipmap folder
    public int getImgIDbyResName(String resName) {
        String packageName = context.getPackageName();
        int imgId = context.getResources().getIdentifier(resName,"mipmap",packageName);
        return imgId;
    };
}