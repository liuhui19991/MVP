package cn.world.mvpdemo.mvp.view;

import cn.world.mvpdemo.base.BaseView;
import cn.world.mvpdemo.mvp.domain.MvpModel;

/**
 * Created by liuhui on 2016/10/24.
 */

public interface IView extends BaseView<MvpModel> {

    public void showMessage(MvpModel domain);
}
