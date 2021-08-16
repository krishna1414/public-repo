package com.example.avengersguid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder
{
    TextView name;
    ImageView photo;
    TextView detail;
    public ProgramViewHolder(View v)
    {
        name=v.findViewById(R.id.textView);
        photo=v.findViewById(R.id.imageView);
        detail=v.findViewById(R.id.textView);
    }
}
