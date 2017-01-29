
package com.example.faisalkhan.viewsandwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * Activity Class to display list of views
 *
 * @author Faisal Khan
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list of data
        ArrayList<String> listData=new ArrayList<>();
        listData.add("View");
        listData.add("TextView");
        listData.add("Button");
        listData.add("ImageView");
        listData.add("EditText");
        listData.add("Spinners");
        listData.add("Toasts");

        // initializing instance of list view from xml
        ListView listView=(ListView)findViewById(R.id.lv_items);

        //setting adapter in list
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData));

        //setting on item click listener on list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){

                    case 0: //View
                        //start intent to reach activity where you can see how to use View
                        startActivity(new Intent(MainActivity.this,ViewActivity.class));
                        break;

                    case 1: //TextView
                        //start intent to reach activity where you can see how to use TextView
                        startActivity(new Intent(MainActivity.this,TextViewActivity.class));
                        break;

                    case 2: //Button
                        //start intent to reach activity where you can see how to use Button
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;

                    case 3: //ImageView
                        //start intent to reach activity where you can see how to use ImageView
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;

                    case 4: //EditText
                        //start intent to reach activity where you can see how to use EditText
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;

                    case 5: //Spinners
                        //start intent to reach activity where you can see how to use Spinners
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;

                    case 6: //Toasts
                        //start intent to reach activity where you can see how to use Toasts
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                        break;
                }
            }
        });
    }
}
