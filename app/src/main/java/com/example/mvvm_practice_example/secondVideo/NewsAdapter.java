package com.example.mvvm_practice_example.secondVideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ItemLayoutBinding;
import com.example.mvvm_practice_example.secondVideo.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel> {
    private ArrayList<NewsModel> list;
    private Context context;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.item_layout,newsModelArrayList);
        this.context = context;
        this.list = newsModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ItemLayoutBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_layout,parent,false);
        binding.setNewsList(list.get(position));
        return binding.getRoot();
    }
}
