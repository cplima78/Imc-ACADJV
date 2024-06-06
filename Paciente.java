public class Paciente {
    private double peso;
    private double altura;
    private String nome;

    // Construtor
    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Método para definir o nome do paciente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para gerar o diagnóstico baseado no IMC
    public String diagnostico() {
        double imc = calcularIMC();
        if (imc < 16) {
            return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
        } else if (imc >= 16 && imc <= 16.99) {
            return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
        } else if (imc >= 17 && imc <= 18.49) {
            return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
        } else if (imc >= 25 && imc <= 29.99) {
            return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
        } else if (imc >= 30 && imc <= 34.99) {
            return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
        } else if (imc >= 35 && imc <= 39.99) {
            return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
        } else {
            return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
        }
    }

    // Método toString() para retornar uma representação em texto do objeto
    @Override
    public String toString() {
        return "O diagnóstico do pac. " + nome + " é: " + diagnostico();
    }
}
