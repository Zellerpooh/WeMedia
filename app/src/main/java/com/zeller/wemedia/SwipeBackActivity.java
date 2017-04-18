package com.zeller.wemedia;

import com.zeller.library.base.BaseSwipeActivity;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/17
 * @date 17/4/17
 */

public class SwipeBackActivity extends BaseSwipeActivity {
    private static final String TAG = "SwipeBackActivity";


    @Override
    public int getLayoutId() {
        return R.layout.activity_back;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {
        setStatusBarColorForSwiperBack(getResources().getColor(R.color.colorAccent));
        loadRootFragment(R.id.ll_content, ExampleFragment.newInstance("example"));
    }


}
