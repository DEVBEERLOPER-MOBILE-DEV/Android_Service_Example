package co.devbeerloper.sound_serviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void startServiceOnClick (View view){

        Intent intent = new Intent(this, AudioService.class);
        startService(intent);

    }


    public void stopServiceOnClick (View view){

        Intent intent = new Intent(this, AudioService.class);
        stopService(intent);

    }


}
