package com.kpinfotech.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kpinfotech.R;
import com.kpinfotech.adapter.Adapter_RecycleView;
import com.kpinfotech.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Activity_RecyclerView extends Activity {

    RecyclerView rvlist;
    List<Person> person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        rvlist = (RecyclerView) findViewById(R.id.rvlist);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvlist.setLayoutManager(llm);
        rvlist.setHasFixedSize(true);

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(glm);
        rv.setHasFixedSize(true);*/

        initializeData();
        initializeAdapter();
    }


    private void initializeData() {
        person = new ArrayList<>();
        person.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        person.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        person.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
        person.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        person.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        person.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
        person.add(new Person("Emma Wilson", "23 years old", R.drawable.emma));
        person.add(new Person("Lavery Maiss", "25 years old", R.drawable.lavery));
        person.add(new Person("Lillie Watts", "35 years old", R.drawable.lillie));
    }

    private void initializeAdapter() {
        Adapter_RecycleView a_RecycleView = new Adapter_RecycleView(this, person);
        rvlist.setAdapter(a_RecycleView);
    }

}