package dio.gof.strategy;

public class ComportamentoAgitado implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agitadamente...");
    }
}
