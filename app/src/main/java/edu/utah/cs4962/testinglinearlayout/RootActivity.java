package edu.utah.cs4962.testinglinearlayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class RootActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams rootLayoutParameters = new LinearLayout.LayoutParams(300, 200);
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setBackgroundColor(Color.BLACK);

        ImageView img50View = new ImageView(this);
        img50View.setImageResource(R.drawable.image50);
        img50View.setBackgroundColor(Color.GREEN);
        rootLayout.addView(img50View);

        ImageView img100View = new ImageView(this);
        img100View.setImageResource(R.drawable.image100);
        img100View.setBackgroundColor(Color.RED);
        rootLayout.addView(img100View);



        setContentView(rootLayout);
    }

}
