package com.example.flowz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.transition.TransitionManager;
import android.content.Intent;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {


//    ViewGroup flowzlayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent service = new Intent(this, flowzIntentServices.class);
        startService(service);


//        Intent bacon = new Intent(this, Bacon.class);
//        bacon.putExtra()
//        startActivity(bacon);
//
//        startActivity(new Intent(this, Bacon.class));
////
//        flowzlayout = (ViewGroup)findViewById(R.id.flowz_layout);
//
//        flowzlayout.setOnTouchListener(
//                new RelativeLayout.OnTouchListener(){
//                    @Override
//                    public boolean onTouch(View view, MotionEvent motionEvent) {
//                        moveButton();
//                        return true;
//                    }
//                }
//        );
//
//    }
//
//    public void moveButton() {
//        View flowzButton = findViewById(R.id.flowz_button);
//
//        TransitionManager.beginDelayedTransition(flowzlayout);
//
//        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//
//        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
//        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
//        flowzButton.setLayoutParams(positionRules);
//
//        ViewGroup.LayoutParams sizeRules = flowzButton.getLayoutParams();
//        sizeRules.width = 450;
//        sizeRules.height = 300;
//        flowzButton.setLayoutParams(sizeRules);

}

    public void OnClick (View view) {
        Intent bacon = new Intent(this, Bacon.class);

        final EditText Applesinput = (EditText) findViewById(R.id.Applesinput);
        String usermessage = Applesinput.getText().toString();
        bacon.putExtra("applemessage", usermessage);


        startActivity(bacon);
    }
}


