package com.mayank.fbtry;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_TAG = "fragment_tag";
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();
        onClick1();

    }

    public void onClick1()
    {
        Fragment fragment = mFragmentManager.findFragmentByTag(FRAGMENT_TAG);
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.replace(android.R.id.content, new frag(),FRAGMENT_TAG);
        transaction.commit();
    }

}
