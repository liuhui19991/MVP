package cn.world.mvpdemo.mvp.domain;

/**
 * Created by liuhui on 2016/10/24.
 */

public class MvpModel {
    //请求地址需要命名在此
   //这个类应该是javaBean
    private String mApkVersion;

    public String getApkVersion() {

        return mApkVersion;

    }

    public void setApkVersion(String apkVersion) {
        mApkVersion = apkVersion;
    }
}
