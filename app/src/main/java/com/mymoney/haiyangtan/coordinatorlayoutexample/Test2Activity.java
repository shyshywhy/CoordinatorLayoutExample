package com.mymoney.haiyangtan.coordinatorlayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by haiyang.tan on 2017/7/19.
 */

public class Test2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        final NestedScrollView leftSrcollView = (NestedScrollView) findViewById(R.id.scrollview_left);
        Button layoutBtn = (Button) findViewById(R.id.layout_btn);
        layoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftSrcollView.requestLayout();
            }
        });
    }
}
