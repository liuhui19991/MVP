package cn.world.mvpdemo.mvp.presenter;

import android.content.Context;

import cn.world.mvpdemo.base.BasePresenter;
import cn.world.mvpdemo.mvp.domain.MvpModel;
import cn.world.mvpdemo.mvp.view.IView;


/**
 * Created by liuhui on 2016/10/24.
 */

public class IPresenter extends BasePresenter<IView> {
    private MvpModel mModel;//在present中做网络请求
    private Context mContext;

    public IPresenter(Context context) {
        mContext = context;
        mModel = new MvpModel();

    }

    //在此方法中进行版本检查
    public void onResume() {
            //在此处做网络请求
    }
}
