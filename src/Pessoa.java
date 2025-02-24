public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularImc(){
        double imc = peso/(altura*altura);
        return imc; //apresentar em kg/cm^2
    }
    public void apresentarInformacao(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.printf("IMC: %.2f\n " , calcularImc());
    }

    public String getClasseIMC(){
        double imc = this.calcularImc();
        if (imc < 18.5){
            return "Abaixo do peso";
        }
        else if (imc >= 18.5 && imc < 24.9){
            return "Peso adequado";
        }
        else if (imc >= 25 && imc < 29.9){
            return "Sobrepeso";
        }
        else if (imc >= 30 && imc < 34.9){
            return "Obeso grau 1";
        }
        else if (imc >= 35 && imc < 39.9){
            return "Obeso grau 2";
        }
        else
            return "Obesidade extrema";
    }
}


