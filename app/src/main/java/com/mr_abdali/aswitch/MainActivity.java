package com.mr_abdali.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //
    SwitchCompat switchCompat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference
        switchCompat = (SwitchCompat) findViewById(R.id.switch_id);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // watch on run window
                // System.out.println(b);

                if (b){
                    //
                    Toast.makeText(getApplicationContext(),"Switch is On ",Toast.LENGTH_LONG).show();
                }else {
                    //
                    Toast.makeText(getApplicationContext(),"Switch is OFF ",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
