package cn.world.mvpdemo.mvp.activity;


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
        presenter.onResume();
    }

    @Override
    public void showMessage() {

    }
}
