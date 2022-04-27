package com.example.mvvm_practice_example.thirdVideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvm_practice_example.databinding.NewsBinding;
import com.example.mvvm_practice_example.secondVideo.NewsModel;

import java.util.ArrayList;

public class AdapterForRecycler extends RecyclerView.Adapter<AdapterForRecycler.MyViewHolder> {
    private Context context;
    private ArrayList<NewsModel> list;
    private LayoutInflater inflater;
    public AdapterForRecycler(Context context, ArrayList<NewsModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(inflater == null){
            inflater = LayoutInflater.from(context);

        }
        NewsBinding newsBinding = NewsBinding.inflate(inflater,parent,false);
        return new MyViewHolder(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        NewsModel newsModel = list.get(position);
        holder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private NewsBinding newsBinding;
        public MyViewHolder(NewsBinding binding) {
            super(binding.getRoot());
            this.newsBinding = binding;
        }
        public void bind(NewsModel newsModel){
            this.newsBinding.setNewsView(newsModel);
        }
        public NewsBinding getNewsBinding(){
            return newsBinding;
        }
    }
}
