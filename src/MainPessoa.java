public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        double imc;

        p1.setNome("Marcelo");
        p1.setIdade(18);
        p1.setAltura(1.68);
        p1.setPeso(60);
        imc = p1.calcularImc();
        p1.apresentarInformacao();
        System.out.println(p1.getClasseIMC());
    }

}
