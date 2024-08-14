package com.example.app_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgButtonPic1,imgButtonPic2,imgButtonPic3;
    private ImageView imageViewId;
    private TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgButtonPic1 = (ImageButton) findViewById(R.id.imageButton_pic1);
        imgButtonPic2 = (ImageButton) findViewById(R.id.imageButton_pic2);
        imgButtonPic3 = (ImageButton) findViewById(R.id.imageButton_pic3);

        imageViewId = (ImageView) findViewById(R.id.imageView_id);
        textViewData = (TextView) findViewById(R.id.textView_data);

        imgButtonPic1.setOnClickListener(new MyButton());
        imgButtonPic2.setOnClickListener(new MyButton());
        imgButtonPic3.setOnClickListener(new MyButton());
    }
    private class MyButton implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imageButton_pic1:
                    Log.d("main","imgButtonPic1");
                    imageViewId.setImageResource(R.drawable.mountain1);
                    textViewData.setText("見山是山");

                    break;
                case R.id.imageButton_pic2:
                    Log.d("main","imgButtonPic2");
                    imageViewId.setImageResource(R.drawable.mountain2);
                    textViewData.setText("見山不是山");

                    break;
                case R.id.imageButton_pic3:
                    Log.d("main","imgButtonPic3");
                    imageViewId.setImageResource(R.drawable.mountain3);
                    textViewData.setText("見山果然是山");

                    break;
            }
        }
    }
}