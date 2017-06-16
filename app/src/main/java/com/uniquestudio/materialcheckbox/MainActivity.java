package com.uniquestudio.materialcheckbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.uniquestudio.library.CircleCheckBox;

public class MainActivity extends AppCompatActivity {
   public CircleCheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CircleCheckBox) findViewById(R.id.circle_check_box);
        Toast.makeText(this,"new line added",Toast.LENGTH_SHORT).show();
    }
}
