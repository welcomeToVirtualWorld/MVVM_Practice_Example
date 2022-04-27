package com.example.mvvm_practice_example.thirdVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.secondVideo.NewsModel;

public class RecyclerViewExampleActivity extends AppCompatActivity {

    RecyclerView rv_1;
    private AdapterForRecycler adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_example);
        rv_1 = findViewById(R.id.rv_1);
        rv_1.setLayoutManager(new LinearLayoutManager(this));
        NewsModel model = new NewsModel();
        adapter = new AdapterForRecycler(this,model.getArrayList());
        rv_1.setAdapter(adapter);
    }
}