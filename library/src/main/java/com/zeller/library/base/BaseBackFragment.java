package com.zeller.library.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/18
 * @date 17/4/18
 */

public abstract class BaseBackFragment extends SwipeBackFragment {

    protected final String TAG = this.getClass().getSimpleName();
    protected LayoutInflater mInflater;
    protected Unbinder mUnbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.mInflater = inflater;
        View rootView = inflateView(getLayoutId());
        this.mUnbinder = ButterKnife.bind(this, rootView);
        initView(rootView);
        return attachToSwipeBack(rootView);
    }

    @Override
    protected FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultHorizontalAnimator();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mUnbinder.unbind();
    }

    protected abstract int getLayoutId();

    protected View inflateView(int resId) {
        return this.mInflater.inflate(resId, null);
    }

    protected abstract void initData();

    public abstract void initView(View rootView);

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
        intent.setClass(getActivity(), cls);
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
        intent.setClass(getActivity(), cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
}
