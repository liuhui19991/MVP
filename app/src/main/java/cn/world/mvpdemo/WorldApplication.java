package cn.world.mvpdemo;

import android.app.Application;

/**
 * Created by liuhui on 2016/10/25.
 */

public class WorldApplication extends Application {
    private Application mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public Application getInstance() {
        return mApplication;
    }
}
