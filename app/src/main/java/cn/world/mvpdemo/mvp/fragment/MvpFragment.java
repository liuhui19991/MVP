package cn.world.mvpdemo.mvp.fragment;

import cn.world.mvpdemo.base.BaseMvpFragment;
import cn.world.mvpdemo.mvp.presenter.IPresenter;
import cn.world.mvpdemo.mvp.view.IView;

/**
 * Created by liuhui on 2016/10/26.
 */

public class MvpFragment extends BaseMvpFragment<IView,IPresenter> implements IView {

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    public IPresenter initPresenter() {
        return null;
    }

    @Override
    public void showMessage() {

    }
}
