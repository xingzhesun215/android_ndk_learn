package com.sun.eg6;


import android.os.Bundle;

import com.zj.public_lib.ui.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initTopBarForOnlyTitle("eg2");

    }


    @Override
    protected void initData(Bundle bundle) {

    }


}
