package com.example.faisalkhan.viewsandwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Activity class that will show how to use textView in android.
 *
 * Please refer activity_text_view layout file to know how to set properties in textView in xml.
 *
 * For more details follow link :- https://developer.android.com/reference/android/view/View.html
 *
 * @author Faisal Khan
 */
public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        // initializing instance of TextView from xml
        TextView tvMessage=(TextView)findViewById(R.id.tv_message);

        //setting text in textView
        tvMessage.setText("HI i am TextView");
    }
}
