package cn.world.mvpdemo.base;


import android.app.Activity;
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
    protected Activity mContext;
    protected View mContentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        presenter = initPresenter();
        if (mContentView == null) {
            mContentView = inflater.inflate(getLayoutId(), container, false);
        }
        if (mContentView.getParent() != null) {//重要
            ViewGroup parent = (ViewGroup) mContentView.getParent();
            parent.removeView(mContentView);
        }
        mContext = getActivity();
        ButterKnife.bind(this, mContentView);
        initView();
        initListener();
        return mContentView;
    }

    protected abstract int getLayoutId();

    @Override
    public void onResume() {
        super.onResume();
        presenter.setView((V)this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public abstract T initPresenter();
}
