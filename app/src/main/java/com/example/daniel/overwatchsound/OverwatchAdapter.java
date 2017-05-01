package com.example.daniel.overwatchsound;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Daniel on 01/05/2017.
 */

public class OverwatchAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Character> mDataSource;

    public OverwatchAdapter(Context context, ArrayList<Character> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    //1
    @Override
    public int getCount() {
        return mDataSource.size();
    }

    //2
    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    //3
    @Override
    public long getItemId(int position) {
        return position;
    }

    //4
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get view for row item
        View rowView = mInflater.inflate(R.layout.list_characters, parent, false);

        // Get title element
        TextView titleTextView =
                (TextView) rowView.findViewById(com.example.daniel.overwatchsound.R.id.character_list_title);

// Get subtitle element
        TextView subtitleTextView =
                (TextView) rowView.findViewById(com.example.daniel.overwatchsound.R.id.character_list_subtitle);

// Get detail element
        TextView detailTextView =
                (TextView) rowView.findViewById(com.example.daniel.overwatchsound.R.id.character_list_detail);

// Get thumbnail element
        ImageView thumbnailImageView =
                (ImageView) rowView.findViewById(com.example.daniel.overwatchsound.R.id.character_list_thumbnail);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 1
        Character character = (Character) getItem(position);

// 2
        titleTextView.setText(character.title);
        subtitleTextView.setText(character.description);

// 3
        Picasso.with(mContext).load(character.imageUrl).placeholder(R.mipmap.ic_launcher).into(thumbnailImageView);

        return rowView;
    }
}
