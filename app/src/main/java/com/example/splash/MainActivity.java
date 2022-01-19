package com.example.splash;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView menuList = (ListView) findViewById(R.id.listView);

        String[] items = {
                getResources().getString(R.string.menu),
                getResources().getString(R.string.menu_item_play),
                getResources().getString(R.string.menu_item_scores),
                getResources().getString(R.string.menu_item_settings),
                getResources().getString(R.string.menu_item_help) };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,
                R.layout.menu_item, items);

        menuList.setAdapter(adapt);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked,
                                    int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_play))) {
                    startActivity(new Intent(MainActivity.this,
                            GameActivity.class));

                } /*else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_help))) {
// Launch the Help Activity
                    startActivity(new Intent(MainActivity.this,
                            HelpActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_settings))) {
// Launch the Settings Activity
                    startActivity(new Intent(MainActivity.this,
                            SettingsActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.menu_item_scores))) {
// Launch the Scores Activity
                    startActivity(new Intent(MainActivity.this,
                            ScoresActivity.class));
                }

                     */
            }
        });
    }
}