package com.example.archana_pc.gesturetestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;


//First implement two event Handlers of GestureDetector i.e. 1) onGestureListener 2) onDoubleTapListener
public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

//Then initialize the Global GestureDetector variable
    private TextView message;
    private  GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.tvMessage);

        //i think it's going to create the object with two arguments.
        this.gestureDetector  = new GestureDetector(this, this);

        gestureDetector.setOnDoubleTapListener(this);
    }

//    for override methods, press alt + inc

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


//    for implemented methods, press alt + inc

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {

        message.setText("singleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        message.setText("onDoubleTap");


        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        message.setText("onDoubleTapEvent");

        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        message.setText("onDown");

        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        message.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {

        message.setText("onSingleTapUp");

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        message.setText("onScroll");

        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        message.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        message.setText("onFling");


        return false;
    }
}
