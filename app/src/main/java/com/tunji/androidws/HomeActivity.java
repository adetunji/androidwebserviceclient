package com.tunji.androidws;

/**
 * Created by Tunji on 2015-03-04.
 */
import android.app.Activity;
import android.os.Bundle;
/**
 *
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);
    }

}