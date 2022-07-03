package com.devcation.sseum.item;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devcation.sseum.OnSseumItemClickListner;
import com.devcation.sseum.R;
import com.devcation.sseum.data.WriteData;

public class WriteItem extends RecyclerView.ViewHolder {
    TextView textViewTag2;   // 최근 작성 글
    TextView textViewID;
    TextView textViewWrite;
    TextView textViewDate;
    TextView textViewUn;


    public WriteItem(@NonNull View itemView, final OnSseumItemClickListner listener) {
        super(itemView);

        textViewTag2 = itemView.findViewById(R.id.bestTag);
        textViewID = itemView.findViewById(R.id.textViewID);
        textViewWrite = itemView.findViewById(R.id.textViewWrite);
        textViewDate = itemView.findViewById(R.id.tag);
        textViewUn = itemView.findViewById(R.id.textViewUn);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();

                if(listener != null){
                    listener.onItemClickListner(WriteItem.this, view, position);
                }
            }
        });

    }

    public void setItem(WriteData data) {
        textViewTag2.setText(data.getTag());
        textViewID.setText(data.getTextid());
        textViewWrite.setText(data.getWrite());
        textViewDate.setText(data.getDate());
        textViewUn.setText(data.getUsername());
    }

}
