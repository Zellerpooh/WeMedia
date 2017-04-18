package com.zeller.library.base;

import android.content.Intent;
import android.os.Bundle;

import com.zeller.library.util.StatusBarUtil;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/17
 * @date 17/4/17
 */

public abstract class BaseActivity extends SupportActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        beforeSetContentView();
        setContentView(getLayoutId());
        initData();
        ButterKnife.bind(this);
        initView();
    }

    protected void beforeSetContentView() {
        AppManager.getAppManager().addActivity(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(this);
    }

    protected void setStatusBarColor(int color) {
        StatusBarUtil.setColor(this, color);
    }

    protected void setStatusBarColorNoTranslucent(int color) {
        StatusBarUtil.setColorNoTranslucent(this, color);
    }

    public abstract int getLayoutId();

    public abstract void initData();

    public abstract void initView();

    /**
     * 通过Class跳转界面
     **/
    public void startActivity(Class<?> cls) {
        startActivity(cls, null);
    }

    /**
     * 通过Class跳转界面
     **/
    public void startActivityForResult(Class<?> cls, int requestCode) {
        startActivityForResult(cls, null, requestCode);
    }

    /**
     * 含有Bundle通过Class跳转界面
     **/
    public void startActivityForResult(Class<?> cls, Bundle bundle,
                                       int requestCode) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    /**
     * 含有Bundle通过Class跳转界面
     **/
    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
}