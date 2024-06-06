public class Principal {
    public static void main(String[] args) {
        // Criar instâncias da classe Paciente
        Paciente paciente1 = new Paciente(50, 1.60);
        paciente1.setNome("Lucas");

        Paciente paciente2 = new Paciente(70, 1.75);
        paciente2.setNome("Ana");

        Paciente paciente3 = new Paciente(107, 1.86);
        paciente3.setNome("Carlos Lima");

        // Imprimir o resultado dos métodos calcularIMC() e diagnostico()
        System.out.println(paciente1);
        System.out.println(paciente2);
        System.out.println(paciente3);
    }
}
