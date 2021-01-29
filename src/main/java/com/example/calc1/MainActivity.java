package com.example.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Controller controller;
    private TextView textView;
    public MainActivity(){
        controller=new Controller(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView)findViewById(R.id.textView);
        
        Button buttonone = (Button)findViewById(R.id.buttonone);
        buttonone.setOnClickListener(controller);
        Button buttontwo = (Button)findViewById(R.id.buttontwo);
        buttontwo.setOnClickListener(controller);
        Button buttonthree = (Button)findViewById(R.id.buttonthree);
        buttonthree.setOnClickListener(controller);
        Button buttonfour = (Button)findViewById(R.id.buttonfour);
        buttonfour.setOnClickListener(controller);
        Button buttonfive = (Button)findViewById(R.id.buttonfive);
        buttonfive.setOnClickListener(controller);
        Button buttonsix = (Button)findViewById(R.id.buttonsix);
        buttonsix.setOnClickListener(controller);
        Button buttonseven = (Button)findViewById(R.id.buttonseven);
        buttonseven.setOnClickListener(controller);
        Button buttoneight = (Button)findViewById(R.id.buttoneight);
        buttoneight.setOnClickListener(controller);
        Button buttonine = (Button)findViewById(R.id.buttonine);
        buttonine.setOnClickListener(controller);
        Button buttonzero = (Button)findViewById(R.id.buttonzero);
        buttonzero.setOnClickListener(controller);
        Button buttonC = (Button)findViewById(R.id.buttonC);
        buttonC.setOnClickListener(controller);
        Button buttonmulti = (Button)findViewById(R.id.buttonmulti);
        buttonmulti.setOnClickListener(controller);
        Button buttondevite = (Button)findViewById(R.id.buttondevite);
        buttondevite.setOnClickListener(controller);
        Button buttondelete = (Button)findViewById(R.id.buttondelete);
        buttondelete.setOnClickListener(controller);
        Button buttonminus = (Button)findViewById(R.id.buttonminus);
        buttonminus.setOnClickListener(controller);
        Button buttonplus = (Button)findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(controller);
        Button buttonpoint = (Button)findViewById(R.id.buttonpoint);
        buttonpoint.setOnClickListener(controller);
        Button buttonpersent = (Button)findViewById(R.id.buttonpersent);
        buttonpersent.setOnClickListener(controller);
        Button buttonCE = (Button)findViewById(R.id.buttonCE);
        buttonCE.setOnClickListener(controller);
        Button buttonequal = (Button)findViewById(R.id.buttonequal);
        buttonequal.setOnClickListener(controller);




    }


    public void update(String text){

        textView.setText(text);
    }

}