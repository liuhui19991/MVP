package cn.world.mvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by liuhui on 2016/10/24.
 */

public abstract class BaseMvpActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    public T presenter;
    protected Activity mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
//        setContentView(getLayoutId());
//        ButterKnife.bind(this);//绑定黄油刀
//        initActionBar();
//        initWindow();
//        initView();
//        initListener();
        presenter = initPresent();
    }

    protected abstract T initPresent();

//    @Override
//    protected void onResume() {
//        super.onResume();
//        presenter.setView((V) this);//这里需要在哪里请求网络,就在哪里设置这句
//        Log.i("lh","base");
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettach();
    }

}
