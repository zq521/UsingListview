package com.example.zhaoqiang.usinglistview;

import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    // private ArrayAdapter<String> adapter;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        myAdapter = new MyAdapter(this);
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(myAdapter);
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));
        myAdapter.add(new User("zhangsan",10,"nan"));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            private int count = 0;

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
//                myAdapter.add("Item" + count);
//                count++;
                Snackbar.make(view,"Not implemanted",Snackbar.LENGTH_SHORT).show();

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
