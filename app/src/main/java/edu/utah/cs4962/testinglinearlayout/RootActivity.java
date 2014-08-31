package edu.utah.cs4962.testinglinearlayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class RootActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setBackgroundColor(Color.BLACK);

        ImageView img50View = new ImageView(this);
        img50View.setImageResource(R.drawable.image50);
        img50View.setBackgroundColor(Color.GREEN);
        LinearLayout.LayoutParams img50LP = new LinearLayout.LayoutParams(
                //100, 20, 1);
                //50, 20, 0);
                //50, 20, 1);
                //50, 20, 1);
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
                //ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 0);
        img50LP.gravity = Gravity.LEFT;
        rootLayout.addView(img50View, img50LP);

        ImageView img100View = new ImageView(this);
        img100View.setImageResource(R.drawable.image100);
        img100View.setBackgroundColor(Color.RED);
        LinearLayout.LayoutParams img100LP = new LinearLayout.LayoutParams(
                //100, 20, 2);
                //100, 20, 0);
                //100, 20, 1);
                //100, 20, 1);
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
                //ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
        img100LP.gravity = Gravity.RIGHT;
        rootLayout.addView(img100View, img100LP);



        setContentView(rootLayout);
    }

}
