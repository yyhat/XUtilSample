package com.lidroid.xutils.sample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/**
 * Created by anting.hu on 2015/10/26.
 */
public class TestLayoutView {

    @ViewInject(R.id.test_btn)
    private Button testBtn;

    public TestLayoutView(Context context)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View testLayoutView = inflater.inflate(R.layout.activity_test, null, false);
        ViewUtils.inject(this, testLayoutView);

        if(testBtn == null)
            Log.i("test", "testBtn is null");
        else
            Log.i("test", "testBtn is not null");
    }

}
