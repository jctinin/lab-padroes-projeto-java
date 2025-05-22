import one.digitalinovationon.gof.facade.Facade;
import one.digitalinovationon.gof.singleton.SingletonEager;
import one.digitalinovationon.gof.singleton.SingletonLazy;
import one.digitalinovationon.gof.singleton.SingletonLazyHolder;
import one.digitalinovationon.gof.strategy.ComportamentoAgressivo;
import one.digitalinovationon.gof.strategy.ComportamentoDefensivo;
import one.digitalinovationon.gof.strategy.ComportamentoNormal;
import one.digitalinovationon.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        // Teste do padrão Singleton
        System.out.println("Teste do padrão Singleton");

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

        // Teste do padrão Strategy
        System.out.println("Teste do padrão Strategy");
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Facade.migrarCliente("julio", "02245090");

    }
}
