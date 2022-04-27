package com.example.mvvm_practice_example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.secondVideo.NewsAdapter;
import com.example.mvvm_practice_example.databinding.ActivityListViewBinding;
import com.example.mvvm_practice_example.secondVideo.NewsModel;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list_view);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list_view);
        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayList();
        newsAdapter = new NewsAdapter(this,newsModelArrayList);
        binding.listItem.setAdapter(newsAdapter);



    }
}