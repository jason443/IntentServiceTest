package com.intentservicetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Person> persons;
    ListView mListView;
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.main_lv);
        initListAllPerson();
        mAdapter = new MyAdapter(this,persons);
        mListView.setAdapter(mAdapter);
    }

    public void initListAllPerson() {
        persons = new ArrayList<Person>();
        persons.add(new Person("Jack",1,R.drawable.photo1));
        persons.add(new Person("Tommy",2,R.drawable.photo2));
        persons.add(new Person("Loser",3,R.drawable.photo3));
        persons.add(new Person("Jon",4,R.drawable.photo4));
        persons.add(new Person("Jim",5,R.drawable.photo5));
        persons.add(new Person("Bruse",6,R.drawable.photo6));
        persons.add(new Person("SkyWalker",7,R.drawable.photo7));
        persons.add(new Person("No one",8,R.drawable.photo8));
        persons.add(new Person("Aliya",9,R.drawable.photo9));
        persons.add(new Person("Lian",10,R.drawable.photo10));
    }
}


