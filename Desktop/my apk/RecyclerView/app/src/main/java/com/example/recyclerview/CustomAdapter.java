package com.example.recyclerview;


import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private String[] name;
    private Integer[] photoId;
    private String [] phoneNo;
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final ImageView imageView;
        private final TextView textView,textView2;
        private final ImageButton call,edit,share;
        public ViewHolder(View view)
        {
            super(view);
            textView = (TextView) view.findViewById(R.id.textView);
            textView2 = (TextView) view.findViewById(R.id.textView2);
            imageView=(ImageView) view.findViewById(R.id.imageView);
            call=(ImageButton) view.findViewById(R.id.imageButton);
            edit=(ImageButton) view.findViewById(R.id.imageButton2);
            share=(ImageButton) view.findViewById(R.id.imageButton3);
        }

        public TextView getTextView()
        {
            return textView;
        }

        public TextView getTextView2() {
            return textView2;
        }

        public ImageView getImageView() {
            return imageView;
        }
        public void dialPhoneNumber(String phoneNumber) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
//        public ImageButton getCall() {
//            return call;
//        }
//
//        public ImageButton getEdit() {
//            return edit;
//        }
//
//        public ImageButton getShare() {
//            return share;
//        }
    }
    public CustomAdapter(String[] name, String[] phoneNo, Integer[] photoId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.photoId=photoId;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position)
    {
        viewHolder.getTextView().setText(name[position]);
        viewHolder.getTextView2().setText(phoneNo[position]);
        viewHolder.getImageView().setImageResource(photoId[position]);
        viewHolder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return name.length;
    }
}

