package com.example.a22_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //方法一
//        String [] strs = new String[]{"111", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222", "222"};
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, strs);

        //方法二
//        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.myArray, android.R.layout.simple_expandable_list_item_2);

        String[] strs = {"基神","B神","翔神","曹神","J神"};

        //方法三
        List<String> data = new ArrayList<String>();
        data.add("666");
        data.add("777");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, data);

        ListView listView = findViewById(R.id.list_test);
        listView.setAdapter(adapter);
    }
}
