package com.example.mvvm_practice_example.eleventhvideo.viewmodel;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.eleventhvideo.model.Categories;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryViewModel extends ViewModel {
    public String id = "";
    public String title = "";
    public String desc = "";
    public String imagePath = "";
    public MutableLiveData<ArrayList<CategoryViewModel>> data = new MutableLiveData<>();
    public ArrayList<CategoryViewModel> categoriesList;
    public CategoryViewModel(){

    }
    public CategoryViewModel(Categories categories){
        this.id = categories.id;
        this.title = categories.title;
        this.desc = categories.desc;
        this.imagePath = categories.imagePath;
    }

    @BindingAdapter({"bind.imageUrl"})
    public static void loadImage(ImageView imageView,String imageUrl){
        Picasso.with(imageView.getContext()).load(imageUrl).placeholder(R.drawable.ic_launcher_background);
    }
    public String getImagePath(){
        return imagePath;
    }

    public MutableLiveData<ArrayList<CategoryViewModel>> getData(){
        categoriesList = new ArrayList<>();
        categoriesList.add(new CategoryViewModel(new Categories("1","Hello","sxsj","https://images.pexels.com/photos/302743/pexels-photo-302743.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")));
        categoriesList.add(new CategoryViewModel(new Categories("2","Hello","sxsj","https://media.istockphoto.com/photos/mountain-landscape-picture-id517188688?k=20&m=517188688&s=612x612&w=0&h=i38qBm2P-6V4vZVEaMy_TaTEaoCMkYhvLCysE7yJQ5Q=")));

        data.setValue(categoriesList);
        return data;
    }
}
