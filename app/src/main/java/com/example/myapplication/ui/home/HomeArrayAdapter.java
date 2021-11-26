package com.example.myapplication.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class HomeArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public HomeArrayAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.text_view);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image_view);
        textView.setText(values[position]);
        imageView.setImageResource(R.drawable.ic_baseline_android_24);

        return rowView;
    }
}
