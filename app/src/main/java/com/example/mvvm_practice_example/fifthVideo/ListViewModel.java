package com.example.mvvm_practice_example.fifthVideo;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.BindingAdapter;

import com.example.mvvm_practice_example.R;
import com.squareup.picasso.Picasso;

public class ListViewModel extends BaseObservable {
    public String title,desc,image;

    public ListViewModel(String title, String desc, String image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView imageView,String imageUrl){
        Picasso.with(imageView.getContext()).load(imageUrl).placeholder(R.drawable.ic_launcher_background).into(imageView);
    }

    public String getImageUrl(){
        return image;
    }
}
