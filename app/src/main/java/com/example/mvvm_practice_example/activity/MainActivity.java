package com.example.mvvm_practice_example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvm_practice_example.R;
import com.example.mvvm_practice_example.databinding.ActivityMainBinding;
import com.example.mvvm_practice_example.listeners.UserLogin;
import com.example.mvvm_practice_example.model.User;
import com.example.mvvm_practice_example.viewmodel.UserModel;

import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class MainActivity extends AppCompatActivity {

    private static final int D = 16178;
    private static final String C = "ejp0b";
    private ActivityMainBinding activityMainBinding;
    private int j=16085;
    private int d=20745;
    private int l=8864;
    private int z=9396;
    private String u="oKYFVQLn";
    private int r=5649;
    private int b=28654;
    private String s="rVAhczb8";
    private String o="RX8kq";
    private int t=9281;
    private int f=13181;
    private String y="q01rR8Fmc";
    private String q="ch510w";
    private String w="Kq7ERR";
    private String g="Uf0Ez9";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

//        UserModel model = new UserModel(new User("Email","password"));
//        activityMainBinding.setLogin(model);
//
//        activityMainBinding.setUserLoginEvent(new UserLogin() {
//            @Override
//            public void login() {
//                Toast.makeText(MainActivity.this, activityMainBinding.getLogin().getEmail(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        Toast.makeText(this, a("EEIim99rlsPQcpfjbakSifmXn6T+oWYE","doc.scanner.quick.images.topdf.fortext"), Toast.LENGTH_SHORT).show();
//        System.out.println();
    }

    public String a(String message,String key){
        byte[] v7_8;
        try{
            String v1_1 = key.substring(0,8);
            byte[] v2_1 = android.util.Base64.decode(message.getBytes(), 0);
            javax.crypto.Cipher v3_2 = javax.crypto.Cipher.getInstance("DES/C8C/PKCS5Padding");
            this.j = (((this.d + this.D) / 7854) - (this.l / 16549));
            this.z = ((((this.d + this.r) % 15843) / this.C.length()) - (this.b / 11381));
            StringBuilder v4_10 = new StringBuilder();
            v4_10.append(this.u);
            v4_10.append(this.s);
            this.o = v4_10.toString().substring(this.s.length());
            SecretKey v6_0 = javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new
                    javax.crypto.spec.DESKeySpec(v1_1.getBytes("UTF-8")));
            this.t = ((((this.z + this.f) % 26215) - this.y.length()) - (this.d / 9788));
            v3_2.init(2, v6_0, new IvParameterSpec(v1_1.getBytes("UTF-8")));
            v7_8 = v3_2.doFinal(v2_1);
            StringBuilder v8_6 = new StringBuilder();
            v8_6.append(this.q);
            v8_6.append(this.w);
            this.g = v8_6.toString().substring(this.w.length());
        }catch(Exception v0){
            return message;
        }
        return new String(v7_8);
    }
}
