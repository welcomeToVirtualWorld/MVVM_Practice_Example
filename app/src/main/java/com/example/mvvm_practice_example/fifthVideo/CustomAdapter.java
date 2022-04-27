package com.example.mvvm_practice_example.fifthVideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ListViewBinding;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private List<ListViewModel> data;
    private ListViewBinding binding;

    public CustomAdapter(Context context, List<ListViewModel> data) {
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
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.innerlayout,null);
            binding = DataBindingUtil.bind(convertView);
            convertView.setTag(binding);
        }else {
            binding = (ListViewBinding) convertView.getTag();
        }
        binding.setNewsmodel(data.get(pos));
        return binding.getRoot();
    }
}
