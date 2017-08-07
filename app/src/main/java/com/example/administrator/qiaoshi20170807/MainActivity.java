package com.example.administrator.qiaoshi20170807;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.administrator.qiaoshi20170807.MyView.onMyListener;

/**
 * 乔石 2017 08 07
 */
public class MainActivity extends AppCompatActivity implements onMyListener{
    private MyView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            myView= (MyView) findViewById(R.id.myview);
        myView.setListeners(this);
    }

    @Override
    public void goListener() {
        Toast.makeText(MainActivity.this,"点击更多按钮",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void contentListener() {

    }

    @Override
    public void backListener() {
        Toast.makeText(MainActivity.this,"点击返回按钮",Toast.LENGTH_SHORT).show();
    }
}
