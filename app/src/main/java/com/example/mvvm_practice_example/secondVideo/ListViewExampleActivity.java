package com.example.mvvm_practice_example.secondVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityListViewExampleBinding;

import java.util.ArrayList;
import java.util.List;

public class ListViewExampleActivity extends AppCompatActivity {

    private ActivityListViewExampleBinding binding;
    ArrayList<NewsModel> data;
    NewsModel model;
    NewsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list_view_example);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list_view_example);
        model = new NewsModel();
        data = model.getArrayList();
        adapter = new NewsAdapter(this,data);
        binding.ls.setAdapter(adapter);
    }
}