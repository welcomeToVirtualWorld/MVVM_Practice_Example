package com.example.mvvm_practice_example.fifthVideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mvvm_practice_example.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewWithImageExample extends AppCompatActivity {
    ListView listView;
    CustomAdapter adapter;
    ListViewModel listViewModel1,listViewModel2,listViewModel3,listViewModel4;
    List<ListViewModel> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_image_example);
        listView = findViewById(R.id.listview);
        listViewModel1 = new ListViewModel("Title1","desc1","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
        listViewModel2 = new ListViewModel("Title2","desc2","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
        listViewModel3 = new ListViewModel("Title3","desc3","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
        listViewModel4 = new ListViewModel("Title4","desc4","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg");
        data = new ArrayList<>();
        data.add(listViewModel1);
        data.add(listViewModel2);
        data.add(listViewModel3);
        data.add(listViewModel4);

        adapter = new CustomAdapter(this,data);
        listView.setAdapter(adapter);
    }
}