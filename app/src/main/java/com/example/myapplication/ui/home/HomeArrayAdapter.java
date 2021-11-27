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
    private final String[] times;
    private final String[] texts;

    public HomeArrayAdapter(Context context, String[] names, String[] times,
                            String[] texts) {
        super(context, -1, names);
        this.context = context;
        this.values = names;
        this.times = times;
        this.texts = texts;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        TextView pubName = rowView.findViewById(R.id.PubName);
        TextView timePost = rowView.findViewById(R.id.timePost);
        TextView postText = rowView.findViewById(R.id.postText);
        ImageView pubIcon = rowView.findViewById(R.id.PubIcon);
        ImageView postPicture = rowView.findViewById(R.id.postPicture);
        pubName.setText(values[position]);
        timePost.setText(times[position]);
        postText.setText(texts[position]);
        pubIcon.setImageResource(R.drawable.ic_baseline_android_24);
        postPicture.setImageResource(R.drawable.pic);

        return rowView;
    }
}
