package com.unisannio.gdevanno.uicheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        final String im_checked_string = getString(R.string.im_checked_string);
        final String im_not_checked_string = getString(R.string.im_not_checked_string);
        final String hide_checkbox_string = getString(R.string.hide_checkbox_string);
        final String unhide_checkbox_string = getString(R.string.unhide_checkbox_string);

        //Get a reference to the CheckBox
        final CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox);

        //Set OnClickListener on the CheckBox
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Check whethern CheckBox is currently checked
                //Set CheckBox text accordingly
                if (checkbox.isChecked()){
                    checkbox.setText(im_checked_string);
                }else{
                    checkbox.setText(im_not_checked_string);
                }
            }
        });

        //Get a reference to the Hide CheckBox Button
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Toggle the CheckBox's visibility state
                //Set the Button text accordingly
                if (checkbox.isShown()){
                    checkbox.setVisibility(View.INVISIBLE);
                    button.setText(unhide_checkbox_string);
                }else {
                    checkbox.setVisibility(View.VISIBLE);
                    button.setText(hide_checkbox_string);
                }
            }
        });
    }
}