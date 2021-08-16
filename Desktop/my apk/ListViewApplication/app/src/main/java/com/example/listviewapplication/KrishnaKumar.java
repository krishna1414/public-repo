package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class KrishnaKumar extends ArrayAdapter<String>
{
    String arr[];
    public KrishnaKumar(@NonNull Context context, int resource, @NonNull String[] ll) {
        super(context, resource, ll);
        arr=ll;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.krishnakumar,parent,false);
        TextView tt=convertView.findViewById(R.id.textView);
        tt.setText(getItem(position));
        return convertView;
    }
}
