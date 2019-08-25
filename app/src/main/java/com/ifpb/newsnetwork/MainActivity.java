package com.ifpb.newsnetwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.ifpb.newsnetwork.telas.TelaLogin;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart(){
        super.onStart();
        startActivity(new Intent(this, TelaLogin.class));
    }

}
