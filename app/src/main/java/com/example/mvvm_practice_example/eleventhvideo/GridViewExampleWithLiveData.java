package com.example.mvvm_practice_example.eleventhvideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.GridView;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.eleventhvideo.model.Categories;
import com.example.mvvm_practice_example.eleventhvideo.viewmodel.CategoryViewModel;
import com.example.mvvm_practice_example.eleventhvideo.adapters.CustomAdapter;

import java.util.ArrayList;

public class GridViewExampleWithLiveData extends AppCompatActivity {
    private CategoryViewModel model;
    private CustomAdapter adapter;
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_example_with_live_data);
        gridView = findViewById(R.id.grid);
        model = ViewModelProviders.of(this).get(CategoryViewModel.class);
        model.getData().observe(this, new Observer<ArrayList<CategoryViewModel>>() {
            @Override
            public void onChanged(ArrayList<CategoryViewModel> categories) {

                adapter = new CustomAdapter(GridViewExampleWithLiveData.this,categories);
                gridView.setAdapter(adapter);
            }
        });
    }
}