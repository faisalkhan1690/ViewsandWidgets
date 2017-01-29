package com.example.faisalkhan.viewsandwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Activity class that will show how to use ImageView in android.
 *
 * Please refer activity_image_view layout file to know how to set properties in ImageView in xml.
 *
 * For more details follow link :- https://developer.android.com/reference/android/widget/ImageView.html
 *
 * @author Faisal Khan
 */
public class ImageViewActivity extends AppCompatActivity {

    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        //initializing instance of Button from xml
        ImageView ivSample=(ImageView)findViewById(R.id.iv_sample);

        //setting image in src at run time
        ivSample.setImageResource(R.mipmap.ic_launcher);

        //setting background at run time
        ivSample.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
    }
}
