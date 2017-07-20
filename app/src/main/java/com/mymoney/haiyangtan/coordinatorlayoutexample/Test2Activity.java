package com.mymoney.haiyangtan.coordinatorlayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
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
        final NestedScrollView rightSrcollView = (NestedScrollView) findViewById(R.id.ScrollView_right);
        Button layoutBtn = (Button) findViewById(R.id.layout_btn);
        Button changeBtn = (Button) findViewById(R.id.change_view_btn);
        layoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightSrcollView.requestLayout();
            }
        });
        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (leftSrcollView.getChildAt(0) != null) {
                    leftSrcollView.removeViewAt(0);
                }
            }
        });
    }
}
