package com.example.contacts;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder
{
    TextView NAME,PHONENO;
    ImageButton SHARE,EDIT,CALL;
    ImageView PERSONHOLDER;
    public ProgramViewHolder(View vv)
    {
        NAME=vv.findViewById(R.id.textView);
        PHONENO=vv.findViewById(R.id.textView2);
        PERSONHOLDER=vv.findViewById(R.id.imageView);
        SHARE=vv.findViewById(R.id.button2);
        EDIT=vv.findViewById(R.id.button3);
        CALL=vv.findViewById(R.id.button);
    }
}
