package cn.world.mvpdemo.base;

/**
 * Created y liuhui on 201/10/24.
 */

public abstract class BasePresenter<V> {
    private V mView;

    public void attach(V view) {
        mView = view;
    }

    public void dettach() {
        mView = null;
    }
}
