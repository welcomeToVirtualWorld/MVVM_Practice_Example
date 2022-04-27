package com.example.mvvm_practice_example.NinthVideo.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_practice_example.NinthVideo.model.Ticket;
import com.example.mvvm_practice_example.NinthVideo.remote.ApiClient;

public class TicketViewModel extends ViewModel {
    private Ticket ticket;
    private ApiClient client = new ApiClient();
    private LiveData<Ticket> liveData;
    public Ticket getTicketVal(){
        if (ticket==null){
            ticket = client.getTicket();
        }
        return ticket;
    }

    public LiveData<Ticket> getLiveData(){
        if (liveData == null){
            liveData = client.getTicketLiveData();
        }
        return liveData;
    }
}
