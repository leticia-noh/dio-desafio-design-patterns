package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.*;

public class Test {

    public static void main(String[] args) {
        /* SINGLETON TESTS*/
        // Lazy
        System.out.println("\nSingleton Lazy");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        System.out.println("-----------------------------------------------");

        // Eager
        System.out.println("Singleton Eager");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);
        System.out.println("-----------------------------------------------");

        // Lazy Holder
        System.out.println("Singleton Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        /* STRATEGY TESTS */
        System.out.println("\n===============================================");
        System.out.println("Strategy");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agitado = new ComportamentoAgitado();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agitado);
        robo.mover();

        /* FACADE TESTS */
        System.out.println("\n===============================================");
        System.out.println("Facade");

        Facade facade = new Facade();
        facade.migrarCliente("Cliente X", "00000000");
    }

}
