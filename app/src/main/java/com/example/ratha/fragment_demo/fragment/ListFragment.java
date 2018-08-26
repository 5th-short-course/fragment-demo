package com.example.ratha.fragment_demo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ratha.fragment_demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListFragment extends Fragment{
    @BindView(R.id.textView)
    TextView textView;
    //public  ListFragment(){}
    private static ListFragment fragment;
    public static ListFragment newInstance(String name){
        Bundle bundle=new Bundle();
        bundle.putString("name",name);

        if(fragment==null)
            fragment=new ListFragment();

        fragment.setArguments(bundle);

        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.list_fragment_layout,container,false);

        //imageView=view.findViewById(R.id.imageView);
        ButterKnife.bind(this,view);

        return view;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //bind data here
        textView.setText("List fragment");
    }
}
