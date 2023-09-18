package Ex1_Carros;

public class Hyundai extends Carros{

    public Hyundai(String marca, Integer ano, Double valor, String cor, Integer portas, Integer velocidade) {
        super();
    }

    public void detalhesCarro(){
        System.out.println("Marca do Carro: " + getMarca());
        System.out.println("Ano do Carro: " + getAno());
        System.out.println("Valor do Carro: " + getValor());
        System.out.println("Cor do Carro: " + getCor());
        System.out.println("Quantas portas o carro possui: " + getPortas()+"\n");
    }

    private String getPortas() {
        return null;
    }

    private String getCor() {
        return null;
    }

    private String getValor() {
        return null;
    }

    private String getAno() {
        return null;
    }

    private String getMarca() {
        return null;
    }

    @Override
    public void iniciarMotor() {
        setVelocidade(5);
        System.out.println("Iniciando o motor...minha velocidade está em " + getVelocidade() + "km/h");
    }

    private String getVelocidade() {
        return null;
    }

    private void setVelocidade(int i) {
    }

    @Override
    public void freiar() {
        if(getVelocidade() == 0){
            System.out.println("Carro desligado!");
        } else {
            setVelocidade(getVelocidade() - 2);
            System.out.println("Freando...minha velocidade está em " + getVelocidade() + "km/h");
        }
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
        System.out.println("Acelerando...minha velocidade está em " + getVelocidade() + "km/h");
    }
}