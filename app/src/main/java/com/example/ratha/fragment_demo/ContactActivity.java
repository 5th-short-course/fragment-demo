package com.example.ratha.fragment_demo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ratha.fragment_demo.fragment.ListFragment;
import com.example.ratha.fragment_demo.fragment.MainFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ButterKnife.bind(this);

        FragmentManager fragmentManager= getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        MainFragment mainFragment=MainFragment.newInstance("Main Fragment");
        transaction.add(R.id.container,mainFragment,"Main Fragment");
        transaction.commit();
    }

    @OnClick(R.id.btnAddFragment)
    public void onAddFragmentClick(){

    }

    @OnClick(R.id.btnReplaceFragment)
    public void onReplaceFragment(){
        FragmentTransaction t=getFragmentManager().beginTransaction();
        ListFragment fragment=ListFragment.newInstance("list Fragment");
        t.replace(R.id.container,fragment,"list fragment");
        t.addToBackStack(null);
        t.commit();
    }

    @OnClick(R.id.btnRemoveFragment)
    public void onRemoveFragment(){
        FragmentTransaction t=getFragmentManager().beginTransaction();
        //find Fragment
        Fragment fragment =getFragmentManager().findFragmentByTag("list fragment");
        if(fragment==null)
            fragment=ListFragment.newInstance("list Fragment");

        t.remove(fragment);
        t.commit();

    }
}
