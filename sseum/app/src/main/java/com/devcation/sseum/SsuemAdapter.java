package com.devcation.sseum;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devcation.sseum.data.ContentData;
import com.devcation.sseum.data.SsuemData;
import com.devcation.sseum.data.WriteData;
import com.devcation.sseum.item.ContentItem;
import com.devcation.sseum.item.SsuemItem;
import com.devcation.sseum.item.WriteItem;

import java.util.ArrayList;

public class SsuemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements OnSseumItemClickListner {

    OnSseumItemClickListner listener;

    ArrayList<Object> items = new ArrayList<Object>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == 0){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.activity_best_write_item, parent, false);
            return new ContentItem(itemView,this);

        }else if(viewType == 1){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.activity_new_write_item, parent, false);
            return new WriteItem(itemView,this);

        }else if(viewType == 2){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.activity_write_item, parent, false);
            return new SsuemItem(itemView,this);

        }else {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View itemView = inflater.inflate(R.layout.activity_best_write_item, parent, false);
            return new ContentItem(itemView,this);

        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Object obj = items.get(position);

        if (obj instanceof ContentData){
            ContentData cd = (ContentData) obj;

            ContentItem contentItem = (ContentItem) holder;

            contentItem.setItem(cd);

        } else if (obj instanceof SsuemData) {
            SsuemData sd = (SsuemData) obj;

            SsuemItem ssuemItem = (SsuemItem) holder;

            ssuemItem.setItem(sd);

        } else if (obj instanceof WriteData) {
            WriteData wd = (WriteData) obj;

            WriteItem writeItem = (WriteItem) holder;

            writeItem.setItem(wd);
        } else {
            ContentData cd = (ContentData) obj;

            ContentItem contentItem = (ContentItem) holder;

            contentItem.setItem(cd);
        }

    }

    @Override
    public int getItemCount() {
        return items.size(); // 5
    }

    @Override
    public int getItemViewType(int position) {
        Object obj = items.get(position);

        if (obj instanceof ContentData){
            ContentData con = (ContentData) obj;
            return con.getType();

        } else if(obj instanceof SsuemData) {
            SsuemData sum = (SsuemData) obj;
            return sum.getType();

        }else if(obj instanceof WriteData) {
            WriteData wdata = (WriteData) obj;
            return wdata.getType();

        }else{
            return 0;
        }

    }

    public void addContentData(ContentData data) { items.add(data); }

    public void addSsuemData(SsuemData data) { items.add(data); }

    public void addWriteData(WriteData data) { items.add(data); }



    @Override
    public void onItemClickListner(RecyclerView.ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClickListner(holder, view, position);
        }
    }

    public void setOnItemClickListener(OnSseumItemClickListner mainListener){
        listener = mainListener;
    }

}
