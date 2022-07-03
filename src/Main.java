import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack stack = new Stack();

        int op;
        while (true) {
            System.out.println("||| MENU PRINCIPAL ||| \n" +
                    "1 - Criar \n" +
                    "2 - Inserir \n" +
                    "3 - Remover \n" +
                    "4 - Imprimir \n" +
                    "0 - Sair");
            System.out.println("Informe a opcao desejada: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o tamanho da pilha: ");
                    stack.setTamanhoStack(leitor.nextInt());
                    System.out.println("Pilha criada com sucesso!");
                    break;

                case 2:

                    if (stack.getTamanhoStack() == 0) {
                        System.out.println("Impossivel inserir. A pilha nao foi definida!");
                        break;
                    } else if (stack.cheia() == false) {
                        System.out.println("Impossivel inserir. A pilha esta cheia!");
                        break;
                    }

                    int valor;
                    System.out.println("Informe o valor que deseja inserir: ");
                    valor = leitor.nextInt();
                    stack.push(valor);
                    break;

                case 3:
                    stack.pop();
                    System.out.println("Item removido com sucesso!");
                    break;

                case 4:
                    if (stack.vazia() == true) {
                        System.out.println("Impossivel imprimir. A pilha esta vazia!");
                        break;
                    }
                    System.out.println(stack.toString());
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(1);

                default:
                    System.out.println("Erro! Informe uma opcao valida.");
            }
        }
    }
}
