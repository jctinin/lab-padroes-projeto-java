import one.digitalinovationon.gof.SingletonEager;
import one.digitalinovationon.gof.SingletonLazy;
import one.digitalinovationon.gof.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
         eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

    }
}
