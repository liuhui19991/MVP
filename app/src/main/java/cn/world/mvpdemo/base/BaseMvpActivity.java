package cn.world.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by liuhui on 2016/10/24.
 */

public abstract class BaseMvpActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresent();
    }

    @Override
    protected void onResume() {
        presenter.attach((V) this);

    }

    @Override
    protected void onDestroy() {
        presenter.dettach();
    }

    public abstract T initPresent();

}
