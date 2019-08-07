package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {
    List<Hero> mylist;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = (ListView) findViewById(R.id.listView);
        mylist = new ArrayList<>();

        mylist.add(new Hero(R.drawable.spiderman ,"Spiderman"));
        mylist.add(new Hero(R.drawable.joker ,"Joker"));
        mylist.add(new Hero(R.drawable.ironman ,"Iron Man"));
        mylist.add(new Hero(R.drawable.doctorstrange ,"Doctor Strange"));
        mylist.add(new Hero(R.drawable.captainamerica ,"Captain America"));
        mylist.add(new Hero(R.drawable.batman ,"Batman"));

        MyListAdapter adapter = new MyListAdapter(this , R.layout.list_custom , mylist);
        listView.setAdapter(adapter);
    }
}

