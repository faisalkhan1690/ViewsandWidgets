package com.example.faisalkhan.viewsandwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Activity class that will show how to use Button in android.
 *
 * Please refer activity_button layout file to know how to set properties in Button in xml.
 *
 * For more details follow link :- hhttps://developer.android.com/reference/android/widget/Button.html
 *
 * @author Faisal Khan
 */
public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        //initializing instance of Button from xml
        Button btnInstanceClick=(Button)findViewById(R.id.btn_instance_click);

        //setting click listener on button
        btnInstanceClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "You just clicked on instance initialized button", Toast.LENGTH_SHORT).show();
            }
        });
    }


    /**
     * Method that called by xml on button click
     * @param view control will pass automatically current view instance from which you are calling this method
     */
    public void clickByXml(View view){
        Toast.makeText(ButtonActivity.this, "You just clicked on click by xmlbutton", Toast.LENGTH_SHORT).show();
    }
}
