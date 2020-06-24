package com.pro.movie.ui.app.spash;

import android.content.Intent;
import android.os.Handler;

import com.pro.movie.R;
import com.pro.movie.databinding.ActivitySplashBinding;

import com.pro.movie.ui.base.component.BaseActivity;
import com.pro.movie.utils.helper.Constants;
import com.pro.movie.utils.helper.SharedPrefUtils;

import org.jetbrains.annotations.NotNull;

public class SplashActivity extends BaseActivity<SplashMvpView, SplashPresenter> {
    private ActivitySplashBinding mBinding;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_splash;
    }

    @NotNull
    @Override
    protected SplashPresenter getActivityPresenter() {
        return new SplashPresenter();
    }

    @Override
    protected void startUI() {
        SharedPrefUtils.INSTANCE.init(SplashActivity.this);
        mBinding = (ActivitySplashBinding) getViewDataBinding();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

         /*       SharedPrefUtils.INSTANCE.init(SplashActivity.this);
                if (SharedPrefUtils.INSTANCE.readBoolean(Constants.Preferences.IS_LOGGED_IN)) {
                    startActivity(new Intent(SplashActivity.this, DashboardActivity.class));
                } else {
                    startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
                }
                finish();*/

            }
        }, 2000);

    }

    @Override
    protected void stopUI() {

    }
}
