package cn.world.mvpdemo.mvp.activity;


import android.widget.TextView;

import cn.world.mvpdemo.R;
import cn.world.mvpdemo.base.BaseMvpActivity;
import cn.world.mvpdemo.mvp.domain.MvpModel;
import cn.world.mvpdemo.mvp.presenter.IPresenter;
import cn.world.mvpdemo.mvp.view.IView;

/**
 * Created by liuhui on 2016/10/24.
 */

public class MvpActivity extends BaseMvpActivity<IView, IPresenter> implements IView {


    private TextView mTextView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mvp;
    }

    @Override
    protected void initView() {
        mTextView = (TextView) findViewById(R.id.tv);
    }

    @Override
    public IPresenter initPresent() {
        return new IPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);//这里需要在哪里请求网络,就在哪里设置这句
    }

    @Override
    public void showMessage(MvpModel domain) {
        mTextView.setText(domain.getApkVersion()+"\n"+domain.getCode());
    }
//MVP文章
//http://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650236866&idx=1&sn=da666831f67303eeb7a57c1591204b43&mpshare=1&scene=23&srcid=1102DuqUt13ekmD10hxngM0Y#rd
}
