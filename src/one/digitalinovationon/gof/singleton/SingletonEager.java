package one.digitalinovationon.gof.singleton;

/**
 * Singleton "apressado" pattern
 *
 * @author jctinin
 */
public class SingletonEager {

  private static SingletonEager instance = new SingletonEager();

  private SingletonEager() {
    super();
  }

  public static SingletonEager getInstance(){
    return instance;
  }

}
