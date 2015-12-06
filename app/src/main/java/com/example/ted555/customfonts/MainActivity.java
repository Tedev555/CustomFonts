package com.example.ted555.customfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare text and typeFace Variable
    TextView textView;
    Typeface typeFace;

    //Define sample text and Path of font
    String someText = "ສະບາຍດີປີີໃຫມ່່ 2016";
    String fontsPath = "Fonts/Phetsarath OT.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Binding TextViw(txt1)
        textView = (TextView)findViewById(R.id.txt1);
        //Create typeFce from Asset
        typeFace = Typeface.createFromAsset(getAssets(),fontsPath);
        //Set TypeFace to textView
        textView.setTypeface(typeFace);
        //make TextView show some text
        textView.setText(someText);
    }
}
