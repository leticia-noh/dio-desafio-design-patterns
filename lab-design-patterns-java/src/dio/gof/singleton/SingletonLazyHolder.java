package dio.gof.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {}

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
