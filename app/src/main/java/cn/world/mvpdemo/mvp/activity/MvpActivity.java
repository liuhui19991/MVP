package cn.world.mvpdemo.mvp.activity;


import android.util.Log;

import cn.world.mvpdemo.base.BaseMvpActivity;
import cn.world.mvpdemo.mvp.presenter.IPresenter;
import cn.world.mvpdemo.mvp.view.IView;

/**
 * Created by liuhui on 2016/10/24.
 */

public class MvpActivity extends BaseMvpActivity<IView, IPresenter> implements IView {


    @Override
    public IPresenter initPresent() {
        return new IPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);//这里需要在哪里请求网络,就在哪里设置这句
        Log.i("lh", "imple");
    }

    @Override
    public void showMessage() {

    }
}
