package fr.cesi.ril2021.android.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void clickTest(View view) {
        Log.v("m","hello");


    }
    public void showToast(View view){
        Toast.makeText(this, "Pouf", Toast.LENGTH_SHORT).show();
    }

    public void toMain(View v) {
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
    }
}