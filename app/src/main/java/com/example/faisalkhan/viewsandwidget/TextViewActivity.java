package com.example.faisalkhan.viewsandwidget;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Activity class that will show how to use textView in android.
 *
 * Please refer activity_text_view layout file to know how to set properties in textView in xml.
 *
 * For more details follow
 * link :- https://developer.android.com/guide/topics/ui/notifiers/toasts.html
 * link :- https://developer.android.com/reference/android/widget/Toast.html
 *
 * @author Faisal Khan
 */
public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
    }

    /**
     * Method to show normal toast
     * @param view view
     */
    public void ShowNormalToast(View view){
        Toast toast= Toast.makeText(this,"Normal Toast",Toast.LENGTH_LONG);
        toast.show();
        //You can use in this way also
//        Toast.makeText(this, "Normal Toast", Toast.LENGTH_SHORT).show();
    }
}
