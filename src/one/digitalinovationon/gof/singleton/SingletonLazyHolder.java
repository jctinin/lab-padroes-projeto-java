package one.digitalinovationon.gof.singleton;


/**
 * Singleton "Lazy Holder" pattern
 *
 * @author jctinin
 * @see <a href="https://pt.wikipedia.org/wiki/Singleton">Singleton</a>
 */

public class SingletonLazyHolder {
  private static class InstanceHolder {
    private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstance() {
    return InstanceHolder.instancia;
  }

}
