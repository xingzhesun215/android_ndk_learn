package com.sun.eg1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zj.public_lib.ui.BaseActivity;
import com.zj.public_lib.utils.Logutil;

public class MainActivity extends BaseActivity  {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initTopBarForOnlyTitle("eg1");
    }

    @Override
    protected void initData(Bundle bundle) {

    }

}
