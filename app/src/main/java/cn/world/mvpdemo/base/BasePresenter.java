package cn.world.mvpdemo.base;

/**
 * Created y liuhui on 201/10/24.
 */

public abstract class BasePresenter<V> {
    public V mView;//这里view必须使用public才能在presenter中调用他的方法使得在activity中使用

    public void attach(V view) {
        mView = view;
    }

    public void dettach() {
        mView = null;
    }
}
