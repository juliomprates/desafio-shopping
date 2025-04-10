import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true){  
            System.out.println("\n\t\tMENU:");
            System.out.println("-------------------------------------");
            System.out.println("\t (1) criar uma loja");
            System.out.println("\t (2) criar um produto");
            System.out.println("\t (3) sair");
            System.out.println("-------------------------------------");
            System.out.print("Opção: ");
            int opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 3) {
                teclado.close();
                break;
            }

            if (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Operaçao inválida");
                System.out.print("Por favor, insira uma nova operação: ");
                opcao = Integer.parseInt(teclado.nextLine());
            }

            if(opcao == 1){
                System.out.println("\n\tCrie uma nova Loja");
                System.out.println("-----------------------------------");
                Loja novaLoja;

                // atributos do objeto da classe Loja
                String nome;
                int qtdDeFuncionarios;
                double salarioBaseFuncionario;
                Endereco endereco;
                Data dataDeFundacao;

                System.out.print("Nome da Loja: ");
                nome = teclado.nextLine();

                System.out.print("Quantidade de funcionários da Loja: ");
                qtdDeFuncionarios = Integer.parseInt(teclado.nextLine());

                System.out.print("Salário base dos funcionários: ");
                salarioBaseFuncionario = Double.parseDouble(teclado.nextLine());


                // atributos do objeto da classe Endereco
                System.out.print("\nInforme o endereço da Loja");
                String rua, cidade, estado, pais, cep, numero, complemento;

                System.out.print("\nNome da Rua: ");
                rua = teclado.nextLine();

                System.out.print("Nome da Cidade: ");
                cidade = teclado.nextLine();

                System.out.print("Estado: ");
                estado = teclado.nextLine();

                System.out.print("País: ");
                pais = teclado.nextLine();

                System.out.print("CEP: ");
                cep = teclado.nextLine();

                System.out.print("Número: ");
                numero = teclado.nextLine();

                System.out.print("Complemento: ");
                complemento = teclado.nextLine();

                endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                // atributos do objeto da classe Data
                System.out.println("\nInforme a data de fundação da Loja");
                int dia, mes, ano;

                System.out.print("Dia: ");
                dia = Integer.parseInt(teclado.nextLine());

                System.out.print("Mês: ");
                mes = Integer.parseInt(teclado.nextLine());

                System.out.print("Ano: ");
                ano = Integer.parseInt(teclado.nextLine());

                dataDeFundacao = new Data(dia, mes, ano);

                // construção do objeto da classe Loja
                novaLoja = new Loja(nome, qtdDeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
                System.out.println("\nLoja criada com sucesso!");
                System.out.println("-----------------------------------");
                System.out.println("\tInformações da Loja");
                System.out.println(novaLoja.toString());
                System.out.println("-----------------------------------");
            }

            if(opcao == 2){
                System.out.println("\n\tCrie um novo Produto");
                System.out.println("-----------------------------------");
                Produto novoProduto;

                // atributos do objeto da classe Produto
                String nome;
                double preco;
                Data validade;

                System.out.print("\nNome do Produto: ");
                nome = teclado.nextLine();

                System.out.print("Preço: ");
                preco = Double.parseDouble(teclado.nextLine());

                // atributos do objeto da classe Data
                System.out.print("\nInforme a validade do produto");
                int dia, mes, ano;

                System.out.print("\nDia: ");
                dia = Integer.parseInt(teclado.nextLine());

                System.out.print("Mês: ");
                mes = Integer.parseInt(teclado.nextLine());

                System.out.print("Ano: ");
                ano = Integer.parseInt(teclado.nextLine());

                validade = new Data(dia, mes, ano);

                // construção do objeto da classe Produto
                novoProduto = new Produto(nome, preco, validade);
                System.out.println("\nProduto criado com sucesso!");
                System.out.println("-----------------------------------");
                System.out.println("\tInformações do Produto\n");
                System.out.println(novoProduto.toString());
                // dia atual como parâmetro para checar se o produto está na validade
                if (novoProduto.estaVencido(new Data(9, 4, 2025))) {
                    System.out.println("\n\tPRODUTO VENCIDO");
                } else {
                    System.out.println("\n\tPRODUTO NÃO VENCIDO");
                }
                System.out.println("-----------------------------------\n");
            }
        }   

        System.out.println("Criação finalizada!");
    }

}