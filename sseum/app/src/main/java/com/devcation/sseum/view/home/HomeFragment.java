package com.devcation.sseum.view.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devcation.sseum.R;
import com.devcation.sseum.SsuemAdapter;
import com.devcation.sseum.data.ContentData;
import com.devcation.sseum.data.SsuemData;
import com.devcation.sseum.data.WriteData;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView_home;
    SsuemAdapter ssuemAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView_home = view.findViewById(R.id.recycler_home);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView_home.setLayoutManager(gridLayoutManager);

        ssuemAdapter = new SsuemAdapter();
        recyclerView_home.setAdapter(ssuemAdapter);


        ContentData contentData1 = new ContentData(1, "오늘의 인기글감은?","이별");
        SsuemData ssuemData2 = new SsuemData(2, "오늘의 주제", "지옥");
        WriteData writeData3 = new WriteData("지옥", "101", "내삶은 지옥같이 힘들다","2022.07.03.","Uisu");

        ssuemAdapter.addContentData(contentData1);
        ssuemAdapter.addSsuemData(ssuemData2);
        ssuemAdapter.addWriteData(writeData3);
        recyclerView_home.setAdapter(ssuemAdapter);


        return view;

    }



}
