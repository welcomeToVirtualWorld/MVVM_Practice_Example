package com.example.mvvm_practice_example.sixthVideo.remote.data;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.mvvm_practice_example.sixthVideo.remote.APICALL;
import com.example.mvvm_practice_example.sixthVideo.remote.VolleySingleton;

import org.json.JSONObject;

public class DataManager {
    private Context context;
    public DataManager(Context context){
        this.context = context;
    }
    public void sendVolleyRequest(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(APICALL.BASEURL, new JSONObject(), new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Toast.makeText(context, response.toString(), Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
               // Toast.makeText(context, error.printStackTrace(), Toast.LENGTH_SHORT).show();
            }
        }
        );
        VolleySingleton.getInstance(context).addToRequestQueue(jsonObjectRequest);

    }
}
