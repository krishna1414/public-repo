package com.example.contactsps;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>
{
    Context context;
    private Contacts[] contacts;
    private TextView textView,textView2;
    private ImageView imageView;
    private Button call;
    private Button button;

    public CustomAdapter(Contacts[] cotact)
    {
        contacts=cotact;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView textView,textView2;
        private ImageView imageView;
        private Button call;
        private Button button;
        public ViewHolder(View view)
        {
            super(view);
            textView=view.findViewById(R.id.textView);
            textView2=view.findViewById(R.id.textView2);
            imageView = view.findViewById(R.id.imageView);
            call=view.findViewById(R.id.button);
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(, "Toast is activated", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(Intent.ACTION_DIAL);
//                    intent.setData(Uri.parse("tel:" + contacts[position].phoneno));
//                    context.startActivity(intent);
                }
            });
        }
        public TextView getTextView()
        {
            return textView;
        }
        public TextView getTextView2()
        {
            return textView2;
        }
        public ImageView getImageView()
        {
            return imageView;
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
        textView = (TextView) view.findViewById(R.id.textView);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        imageView = (ImageView) view.findViewById(R.id.imageView);
        call=(Button) view.findViewById(R.id.button);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        textView.setText(contacts[position].name);
        textView2.setText(contacts[position].phoneno);
        imageView.setImageResource(contacts[position].photo);
//        call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "click listener is working", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:" + contacts[position].phoneno));
//                context.startActivity(intent);
//            }
//        });
    }
    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount()
    {
        return contacts.length;
    }
}

