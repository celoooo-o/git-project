public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        double volume;

        cilindro.setRaio(5);
        cilindro.setAltura(10);
        volume = cilindro.cacularVolume();
        System.out.println("volume 1 = " + volume);

        Cilindro cilindro2 = new Cilindro();
        cilindro2.setRaio(7);
        cilindro2.setAltura(12);
        volume = cilindro2.cacularVolume();
        System.out.println("volume 2 = " + volume);

    }
}