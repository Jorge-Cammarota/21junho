public class Fiat extends Carro {
    @Override
    public void acelerar() {
        int velocidade;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + "km/h");
        this.velocidade += 12;
    }
}
