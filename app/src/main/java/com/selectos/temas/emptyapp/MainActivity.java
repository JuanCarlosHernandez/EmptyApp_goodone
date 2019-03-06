package com.selectos.temas.emptyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        Intent try_second_activity = new Intent(this, SecondActivity.class); //Intenta llamar de esta clase a su referencia
        startActivity(try_second_activity); //To deploy your other layout
    }
}
