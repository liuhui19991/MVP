package cn.world.mvpdemo.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liuhui on 2016/10/26.
 */

public abstract class BaseMvpFragment<V, T extends BasePresenter<V>> extends Fragment {
    public T presenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        presenter = initPresenter();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.attach((V)this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public abstract T initPresenter();
}
