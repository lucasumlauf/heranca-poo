public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Lucas", 20.0, 160);
        Lider l1 = new Lider("Ariel", 20.0, 160);
        Gerente g1 = new Gerente("Elis", 20.0, 160);

        System.out.println(f1.getNome() + " possui um salário de: R$" + f1.calcularSalario());
        System.out.println(l1.getNome() + " possui um salário de: R$" + l1.calcularSalario());
        System.out.println(g1.getNome() + " possui um salário de: R$" + g1.calcularSalario());
    }
}