package com.example.homework4_2_1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ItemsDataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        adapter = new ItemsDataAdapter(this, null);
        fillData();

        listView.setAdapter(adapter);


    }

    private void fillData(){
        adapter.addItem(new ItemData(getDrawable(R.drawable.homework211),
                getString(R.string.homework211_title),
                getString(R.string.homework211_subtitle),
                false));
        adapter.addItem(new ItemData(getDrawable(R.drawable.homework212),
                getString(R.string.homework212_title),
                getString(R.string.homework212_subtitle),
                false));
        adapter.addItem(new ItemData(getDrawable(R.drawable.homework213),
                getString(R.string.homework213_title),
                getString(R.string.homework213_subtitle),
                false));
        adapter.addItem(new ItemData(getDrawable(R.drawable.homework221),
                getString(R.string.homework221_title),
                getString(R.string.homework221_subtitle),
                false));
    }
}
