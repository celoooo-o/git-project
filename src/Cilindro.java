public class Cilindro {
    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }
    public double getAltura() {
        return altura;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double cacularVolume() {
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }
}
