package com.example.baserecyclerviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.baserecyclerviewadapter.views.FragmentA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragmentA();
    }

    private void initFragmentA() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameContainer, new FragmentA(), null);
        //fragmentTransaction.replace(R.id.container, new FragmentA(), null);
        fragmentTransaction.commit();
    }
}
