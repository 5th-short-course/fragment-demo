package com.example.ratha.fragment_demo.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ratha.fragment_demo.R;

import java.util.List;

public class ArticleFragment  extends ListFragment {

    private static  ArticleFragment fragment;
    public static ArticleFragment newInstance(){
        if(fragment==null)
            fragment=new ArticleFragment();

        return fragment;
    }

    String[] values={"Apple","Samsung","Nokai","Huvie","Oppo"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.article_fragment_layout,container,false);

        return view;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        ArrayAdapter<String> adapter=new ArrayAdapter(
          getActivity(),
                android.R.layout.simple_list_item_1,
                values
        );

        setListAdapter(adapter);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(), ""+values[position], Toast.LENGTH_SHORT).show();
    }
}
