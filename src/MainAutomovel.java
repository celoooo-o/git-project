public class MainAutomovel {
    public static void main(String[] args) {
        Automovel a1 = new Automovel();

        a1.setMarca("Toyota");
        a1.setMatricula("11-11-AA");
        a1.setCilindrada(1400);
        System.out.println(a1);
        System.out.println("Matrícula do automóvel 1: " + a1.getMatricula());
        System.out.println("Automóveis totais: " + Automovel.getTotalAutomoveis());

        Automovel a2 = new Automovel();

        a2.setMarca("Fiat");
        a2.setMatricula("22-22-BB");
        System.out.println(a2);
        a2.setCilindrada(1800);
        System.out.println(a2);
        System.out.println("Automóveis totais: " + Automovel.getTotalAutomoveis());
        int difc = Math.abs (a1.calcularDiferencaCilindrada(a2));
        System.out.println("Diferença absoluta das cilindradas: " + difc);
        if (a1.isCilindradaMaior(a2)){
            System.out.println("A cilidrada maior é a do automóvel " + a1.getMatricula());
        } else {
            System.out.println("A cilindrada maior é a do automóvel " + a2.getMatricula());
        }
        System.out.println("A cilindrada do automóvel 1 é maior que 2000? ");
        if (a1.isCilindradaMaior(2000)){
            System.out.println("A cilindrada é maior que 2000");
        } else {
            System.out.println("A cilindrada não é maior que 2000");
        }
    }
}
