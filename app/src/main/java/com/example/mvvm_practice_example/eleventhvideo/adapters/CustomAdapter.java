package com.example.mvvm_practice_example.eleventhvideo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.GridClass;
import com.example.mvvm_practice_example.eleventhvideo.model.Categories;
import com.example.mvvm_practice_example.eleventhvideo.viewmodel.CategoryViewModel;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<CategoryViewModel> data;
    private GridClass gridClass;
    public CustomAdapter(Context context, ArrayList<CategoryViewModel> data) {
        this.context = context;
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertedView, ViewGroup parent) {
        if (convertedView == null){
            convertedView = LayoutInflater.from(context).inflate(R.layout.layout_grid,null);
            gridClass = DataBindingUtil.bind(convertedView);
            convertedView.setTag(gridClass);
        }else {
            gridClass = (GridClass) convertedView.getTag();
        }
        gridClass.setModel(data.get(position));
        return gridClass.getRoot();
    }
}
