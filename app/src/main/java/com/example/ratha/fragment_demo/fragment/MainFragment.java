package com.example.ratha.fragment_demo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ratha.fragment_demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainFragment  extends Fragment{
    @BindView(R.id.imageView)
     ImageView imageView;

    private static MainFragment fragment;
    public static MainFragment newInstance(String name){
        Bundle bundle=new Bundle();
        bundle.putString("name",name);
        if(fragment==null)
            fragment=new MainFragment();

        fragment.setArguments(bundle);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.main_fragment_layout,container,false);

        //imageView=view.findViewById(R.id.imageView);
        ButterKnife.bind(this,view);

        return view;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //bind data here
        imageView.setImageResource(R.drawable.spring_by_pivotal);
    }
}
