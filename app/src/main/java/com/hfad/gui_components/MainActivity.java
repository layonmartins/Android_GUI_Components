package com.hfad.gui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkCheckBoxMilk(){
        CheckBox checkBoxMilk = (CheckBox) findViewById(R.id.checkbox_milk);
        boolean checked = checkBoxMilk.isChecked();
        if (checked) {
            // do something
        }
    }

    public void onToggleButtonClicked(View view){
        //Get the state of ToggleButton
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // on
        } else {
            // off
        }
    }
}
