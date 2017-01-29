package com.example.faisalkhan.viewsandwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Activity class that will show how to use View in android.
 *
 * Please refer activity_view layout file to know how to set properties in View in xml.
 *
 * For more details follow link :- https://developer.android.com/reference/android/view/View.html
 *
 * @author Faisal Khan
 */
public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        // initializing instance of TextView from xml
        View view=findViewById(R.id.view);

        //setting view visibility visible
        view.setVisibility(View.VISIBLE);

    }
}
