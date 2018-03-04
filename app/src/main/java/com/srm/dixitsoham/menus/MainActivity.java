package com.srm.dixitsoham.menus;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        textView = findViewById(R.id.text);
        setSupportActionBar(mToolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.text_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.red:
                textView.setTextColor(getResources().getColor(R.color.red));
                return true;

            case R.id.green:
                textView.setTextColor(getResources().getColor(R.color.green));
                return true;

            case R.id.blue:
                textView.setTextColor(getResources().getColor(R.color.blue));
                return true;

            case R.id.yellow:
                textView.setTextColor(getResources().getColor(R.color.yellow));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
