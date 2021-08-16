package com.example.avengersguid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class avengers_adapter extends ArrayAdapter<String>
{
    int count=0;
    Context context;
    String name[];
    Integer photoId[];
    String discription[];
    public avengers_adapter(Context context,String name[],Integer photoId[],String discription[]) {
        super(context,R.layout.custom_adapter,R.id.textView,name);
        this.context=context;
        this.name=name;
        this.photoId=photoId;
        this.discription=discription;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        View vv=convertView;
        ProgramViewHolder holder=null;
        if(vv==null)
        {
            LayoutInflater ll= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            vv=ll.inflate(R.layout.custom_adapter,parent,false);
            holder=new ProgramViewHolder(vv);
            vv.setTag(holder);
        }
        else
        {
            holder= (ProgramViewHolder) vv.getTag();
            holder.photo.setImageResource(photoId[position]);
            holder.name.setText(name[position]);
        }
        ProgramViewHolder finalHolder = holder;
        vv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count+1;
                if(count%2==1) finalHolder.name.setText(discription[position]);
                else finalHolder.name.setText(name[position]);
            }
        });
        return vv;
    }
}
