import java.util.Scanner; // Import necessário para utilizar a classe Scanner

public class MenuOpcoes {
    public static void main (String [] args) {

        System.out.println("======= Menu de Opcoes ========");
        System.out.println(" 1 - Cadastrar Produtos ");
        System.out.println(" 2 - Listas Produtos ");
        System.out.println(" 3 - Sair do sistema ");
        System.out.println("======= Escolha uma opcao ========");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt(); //Lê a opção dirigida

        switch (menu) {
            case 1:
                System.out.println("Voce escolheu o menu 1");
                System.out.println("Que eh a opção Cadastrar Produtos");
                break;
            case 2:
                System.out.println("Voce escolheu o menu 2");
                System.out.println("Que eh a opção Listar Produtos");
                break;
            case 3:
                System.out.println("Voce escolheu o menu 3");
                System.out.println("Que eh a opção sair do sistema");
                break;
            default:
                System.out.println("Item de menu inválido");
        }
        entrada.close();
    }
}
