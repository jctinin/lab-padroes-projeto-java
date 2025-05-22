package one.digitalinovationon.gof.strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        System.out.println("O robô está se movendo...");
        comportamento.mover();
    }

}
