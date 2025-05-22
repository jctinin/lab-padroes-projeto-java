package one.digitalinovationon.gof.singleton;

/**
 * Singleton "PREGUIÇOCO" pattern
 *
 * @author jctinin
 */

public class SingletonLazy {

  private static SingletonLazy instance;

  private SingletonLazy() {
    super();
  }

  public static SingletonLazy getInstance(){
    if (instance == null) {
      instance = new SingletonLazy();
    }
    return instance;
  }

}
