package com.example.contacts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String>
{
    Context context;
    String name[];
    String phoneNo[];
    Integer image[];
    public CustomAdapter(Context context, String[] name, String[] phoneNo, Integer[] image)
    {
        super(context,R.layout.customlayout,R.id.textView,name);
        this.context=context;
        this.name=name;
        this.phoneNo=phoneNo;
        this.image=image;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        View vv=convertView;
        ProgramViewHolder holder=null;
        if(vv==null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            vv = layoutInflater.inflate(R.layout.customlayout, parent, false);
            holder = new ProgramViewHolder(vv);
            vv.setTag(holder);
        }
        else
        {
            holder= (ProgramViewHolder) vv.getTag();
            holder.PERSONHOLDER.setImageResource(image[position]);
            holder.NAME.setText(name[position]);
            holder.PHONENO.setText(phoneNo[position]);
            holder.CALL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + phoneNo[position]));
                    context.startActivity(intent);
                }
            });
        }
        return vv;
    }
}
