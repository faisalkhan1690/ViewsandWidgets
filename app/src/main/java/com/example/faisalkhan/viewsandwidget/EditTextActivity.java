package com.example.faisalkhan.viewsandwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Activity class that will show how to use EditText in android.
 *
 * Please refer activity_edit_text layout file to know how to set properties in EditText in xml.
 *
 * For more details follow link :- https://developer.android.com/reference/android/widget/EditText.html
 *
 * @author Faisal Khan
 */
public class EditTextActivity extends AppCompatActivity {

    private  EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        //initializing instance of EditText from xml
        etMessage=(EditText)findViewById(R.id.et_message);

    }

    /**
     * Method that call when to click button available on screen
     * @param view view
     */
    public void showToast(View view){
        if(etMessage==null){
            Toast.makeText(this, "Something went wrong please try again", Toast.LENGTH_SHORT).show();
            return;
        }

        String text=etMessage.getText().toString().trim();
        if(TextUtils.isEmpty(text)){
            Toast.makeText(this, "Please enter some thing in Edit Text", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
    }
}
