package sg.edu.rp.c346.id20016584.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346, tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346=findViewById(R.id.TextViewC346);
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, C346Activity.class);
                i.putExtra("Module Code", "Module Code");
                i.putExtra("Module Name", "Module Name");
                i.putExtra("Academic Year", "Academic Year");
                i.putExtra("Semester", "Semester");
                i.putExtra("Module Credit", "Module Credit");
                i.putExtra("Venue", "Venue");
                startActivity(i);
            }
        });
        tvC349=findViewById(R.id.textViewC349);
        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, C349Activity.class);
                i.putExtra("Module Code", "Module Code");
                i.putExtra("Module Name", "Module Name");
                i.putExtra("Academic Year", "Academic Year");
                i.putExtra("Semester", "Semester");
                i.putExtra("Module Credit", "Module Credit");
                i.putExtra("Venue", "Venue");
                startActivity(i);
            }
        });
    }@Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }
}