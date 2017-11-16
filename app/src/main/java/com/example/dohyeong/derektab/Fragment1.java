package com.example.dohyeong.derektab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.dohyeong.derektab.R.id.listview;

/**
 * Created by Dohyeong on 2017-11-13.
 */

public class Fragment1 extends Fragment {

    FriendAdapter adapter;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        listView = rootview.findViewById(listview);

        adapter = new FriendAdapter();

        adapter.addItem(new FriendItem("김도형", "010-9553-2733"));
        adapter.addItem(new FriendItem("이형도", "011-8553-2733"));
        adapter.addItem(new FriendItem("도형킴", "012-7553-2733"));
        adapter.addItem(new FriendItem("김형호", "013-6553-2733"));

        listView.setAdapter(adapter);

        return rootview;
    }

    class FriendAdapter extends BaseAdapter {

        ArrayList<FriendItem> items = new ArrayList<FriendItem>();


        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(FriendItem item) {
            items.add(item);

        }

        @Override
        public Object getItem(int i) {
            return items.get(i);

        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            FriendItemView itemView = new FriendItemView(getActivity());
            FriendItem item = items.get(i);
            itemView.setName(item.getName());
            itemView.setMobile(item.getMobile());

            return itemView;
        }

    }


}
