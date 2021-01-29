package com.example.calc1;

import android.view.View;

public class Controller implements View.OnClickListener {

    private Model model;
    public Controller(MainActivity mainActivity){
        model = new Model(mainActivity);

    }

    @Override
    public void onClick(View v) {
   String argument = "";
   switch(v.getId()){

       case R.id.buttonone:
           argument="1";
           break;
       case R.id.buttontwo:
           argument="2";
           break;
       case R.id.buttonthree:
           argument="3";
           break;
       case R.id.buttonfour:
           argument="4";
           break;
       case R.id.buttonfive:
           argument="5";
           break;
       case R.id.buttonsix:
           argument="6";
           break;
       case R.id.buttonseven:
           argument="7";
           break;
       case R.id.buttoneight:
           argument="8";
           break;
       case R.id.buttonine:
           argument="9";
           break;
       case R.id.buttonzero:
           argument="0";
           break;
       case R.id.buttonC:
           argument="C";
           break;
           case R.id.buttonmulti:
           argument="*";
           break;
       case R.id.buttonminus:
           argument="-";
           break;
           case R.id.buttondevite:
           argument="/";
           break;
           case R.id.buttondelete:
           argument="D";
           break;
           case R.id.buttonplus:
           argument="+";
           break;
           case R.id.buttonpoint:
           argument=".";
           break;
           case R.id.buttonpersent:
           argument="%";
           break;
           case R.id.buttonCE:
           argument="CE";
           break;
           case R.id.buttonequal:
           argument="=";
           break;
   }
        model.doAction(argument);

    }

}
