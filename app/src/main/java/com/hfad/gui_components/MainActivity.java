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

    public void onCheckboxClicked(View view) {
        // Has the checkbox that was clicked been checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Retrieve which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_milk:
                if (checked) {
                    // Milky coffe
                } else {
                }
                break;
            case R.id.checkbox_sugar:
                if (checked) {
                    // Sweet
                } else {
                }
                break;

        }
    }

    public void onToggleButtonClicked(View view) {
        //Get the state of ToggleButton
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // on
        } else {
            // off
        }
    }
}
