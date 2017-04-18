package com.zeller.wemedia.leakcanary;

import android.content.Context;
import android.widget.TextView;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/4/17
 * @date 17/4/17
 */

public class LeakTest {
    private Context mCtx;
    private TextView mTextView;

    private static LeakTest ourInstance = null;

    public static LeakTest getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new LeakTest(context);
        }
        return ourInstance;
    }

    public void setRetainedTextView(TextView tv) {
        this.mTextView = tv;
        mTextView.setText(mCtx.getString(android.R.string.ok));
    }

    private LeakTest() {
    }

    private LeakTest(Context context) {
        this.mCtx = context;
    }
}
