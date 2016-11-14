package com.example.bridgelabz.task.adapter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bridgelabz.task.R;

/**
 * Created by bridgelabz on 14/11/16.
 */
public class MyFragment extends android.support.v4.app.Fragment {
    String title;
    int id;


    public static  android.support.v4.app.Fragment newInstance(int id, String title) {
        MyFragment frag=new MyFragment();
        Bundle bundle=new Bundle();

        bundle.putString("key",title);
        bundle.putInt("num",id);
        frag.setArguments(bundle);
        return frag;
    }




    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.frag_lyout,container,false);
        TextView text= (TextView) v.findViewById(R.id.textView);
        String title =getArguments().getString("key");
        int id= getArguments().getInt("num");
        text.setText(title+"..."+id);
        return v;
    }
}
