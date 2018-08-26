package com.example.ratha.fragment_demo;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ratha.fragment_demo.fragment.ArticleFragment;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.add(R.id.container, ArticleFragment.newInstance());
        transaction.commit();
    }
}
