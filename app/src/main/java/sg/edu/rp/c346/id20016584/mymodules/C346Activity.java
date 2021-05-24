package sg.edu.rp.c346.id20016584.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C346Activity extends AppCompatActivity {
    TextView c346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        c346=findViewById(R.id.textView2);
        Intent i=getIntent();
        String modnum=i.getStringExtra("Module Code");
        String modname=i.getStringExtra("Module Name");
        String year=i.getStringExtra("Academic Year");
        String sem=i.getStringExtra("Semester");
        String cred=i.getStringExtra("Module Credit");
        String venue=i.getStringExtra("Venue");
        c346.setText(modnum+": C346\n"+modname+": Android Programming\n"+year+": 2020\n"+sem+": 1\n"+cred+": 4\n"
        +venue+": E62E");

    }
}