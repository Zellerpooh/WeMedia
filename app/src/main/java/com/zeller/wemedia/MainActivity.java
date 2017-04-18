package com.zeller.wemedia;

import android.widget.Button;
import android.widget.TextView;

import com.zeller.library.base.BaseActivity;
import com.zeller.library.base.BaseSwipeActivity;
import com.zeller.library.util.LogUtils;
import com.zeller.library.util.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";


    @BindView(R.id.btn_change)
    Button btnChange;
    @BindView(R.id.tv_waitchange)
    TextView tvWaitchange;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {
        setStatusBarColorNoTranslucent(getResources().getColor(R.color.colorPrimary));
    }

    @OnClick(R.id.btn_change)
    public void onViewClicked() {
        tvWaitchange.setText("change");
        LogUtils.logd(TAG, "change");
        ToastUtils.showShortToast("qqq");
        startActivity(SwipeBackActivity.class);
    }
}
