package com.zeller.wemedia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zeller.library.base.BaseBackFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/18
 * @date 17/4/18
 */

public class ExampleFragment extends BaseBackFragment {

    private static final String ARG_ITEM = "arg_item";
    @BindView(R.id.btn_start)
    Button btnStart;
    private String mTitle;

    @BindView(R.id.tv_name)
    TextView tvName;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_example;
    }

    @Override
    protected void initData() {
        this.mTitle = getArguments().getString(ARG_ITEM);
    }

    @Override
    public void initView(View rootView) {
        tvName.setText(mTitle);
    }

    public static ExampleFragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString(ARG_ITEM, title);
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.btn_start)
    public void onViewClicked() {
        start(new RootFragment());
    }
}
