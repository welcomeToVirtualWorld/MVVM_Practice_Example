package com.example.mvvm_practice_example.NinthVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mvvm_practice_example.NinthVideo.viewmodel.TicketViewModel;
import com.example.mvvm_practice_example.R;

public class LiveDataExample extends AppCompatActivity {

    private TicketViewModel ticketViewModel;
    TextView txt_id,txt_name,txt_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data_example);
        txt_id = findViewById(R.id.txt_id);
        txt_name = findViewById(R.id.txt_name);
        txt_desc = findViewById(R.id.txt_desc);

        ticketViewModel = ViewModelProviders.of(this).get(TicketViewModel.class);
        ticketViewModel.getLiveData();
        txt_id.setText(ticketViewModel.getLiveData().getValue().ticketId);
        txt_name.setText(ticketViewModel.getLiveData().getValue().ticketName);
        txt_desc.setText(ticketViewModel.getLiveData().getValue().ticketDesc);


    }
}