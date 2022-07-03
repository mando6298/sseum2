package com.devcation.sseum.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devcation.sseum.OnSseumItemClickListner;
import com.devcation.sseum.R;
import com.devcation.sseum.data.ContentData;
import com.devcation.sseum.data.SsuemData;

public class ContentItem extends RecyclerView.ViewHolder {
    TextView textViewid;       // 인기 글감
    TextView textViewtag;

    public ContentItem(@NonNull View itemView, final OnSseumItemClickListner listener) {
        super(itemView);

        textViewid = itemView.findViewById(R.id.bestTag);
        textViewtag = itemView.findViewById(R.id.tag);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();

                if(listener != null){
                    listener.onItemClickListner(ContentItem.this, view, position);
                }
            }
        });


    }

    public void setItem(ContentData data) {

        textViewid.setText(data.getId());
        textViewtag.setText(data.getTag());

    }



}
