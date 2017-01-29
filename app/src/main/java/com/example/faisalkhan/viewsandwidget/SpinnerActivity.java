package com.example.faisalkhan.viewsandwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Activity class that will show how to use Spinner in android.
 * <p>
 * Please refer activity_spinner layout file to know how to set properties in Spinner in xml.
 * <p>
 * For more details follow link :- https://developer.android.com/reference/android/widget/ImageView.html
 *
 * @author Faisal Khan
 */

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //initializing instance of Spinner from xml
        // items are already set in xml
        final Spinner spList1 = (Spinner) findViewById(R.id.sp_list1);

        //array of items initialized in string file
        final String[] array=getResources().getStringArray(R.array.spinner_items);

        //setting listener on spinner
        spList1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(SpinnerActivity.this, array[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // item will set using adapter class
        Spinner spList2 = (Spinner) findViewById(R.id.sp_list2);

        //data list
        final ArrayList<String> listData = new ArrayList<>();
        listData.add("Four");
        listData.add("Five");
        listData.add("Six");

        //setting adapter on spinner
        spList2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, listData));

        //setting listener on spinner
        spList2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(SpinnerActivity.this, listData.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
