package com.acat.firebase.rtdbbe.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.acat.firebase.rtdbbe.R;
import com.google.gson.Gson;

import java.util.List;

public class CustomListView extends BaseAdapter {

    private List<KeyAndValue> data;
    private Context context;

    public CustomListView(Context context, List<KeyAndValue> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
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
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_list_view, null);
        TextView textView1 = convertView.findViewById(R.id.customKey);
        TextView textView2 = convertView.findViewById(R.id.customName);
        TextView textView3 = convertView.findViewById(R.id.customAge);

        textView1.setText(data.get(position).getKey());
        Gson gson = new Gson();
        User user = gson.fromJson(data.get(position).getValue(), User.class);
        textView2.setText(user.getName());
        textView3.setText(user.getAge());

        return convertView;
    }
}
