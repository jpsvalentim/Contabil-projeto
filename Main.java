import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome da Empresa: ");
        Pagamentos pag = new Pagamentos(sc.nextLine());

        while (true) {
            System.out.print("\nTipo (PIS/IPI) ou 'pare': ");
            String op = sc.next().toLowerCase();
            
            if (op.equals("pare")) {
                break;
            }

            if (op.equals("pis")) {
                System.out.print("Débito e Crédito: ");
                pag.adicionarImposto(new Pis(sc.nextDouble(), sc.nextDouble()));
            } else if (op.equals("ipi")) {
                System.out.print("Prod, Frete, Seguro, Despesas, Aliquota: ");
                pag.adicionarImposto(new Ipi(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            } else {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("\n--- Relatório de Impostos da empresa " + pag.getNomeEmpresa() + " ---");
        for (Imposto i : pag.getListaImpostos()) {
            System.out.printf("%s: R$ %.2f%n", i.getDescricao(), i.calcularImposto());
        }
        
        sc.close();
    }
}