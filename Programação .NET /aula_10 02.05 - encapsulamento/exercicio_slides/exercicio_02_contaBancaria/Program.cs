/*2) Crie uma classe ContaBancaria com os seguintes atributos: NumeroConta, Saldo e Titular.
Criar propriedades para acesso (get e set) aos dados.
Analise as necessidades de encapsulamento.
Crie os métodos construtor, public bool Depositar(double valor), public bool Sacar(double valor) e public void ExibirSaldo()*/
namespace exercicio02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaBancaria cb = new ContaBancaria("1574-5", "Vanessa Cezar", 1500);
            Console.WriteLine("Informações sobre a conta bancaria ");
            Console.WriteLine("Nome do titular : "+cb.Titular);
            Console.WriteLine("Número da conta : "+cb.NumeroConta);
            cb.ExibirSaldo();
            int op=0;
            do
            {
                Console.WriteLine("\n\tMENU");
                Console.WriteLine("1 - Sacar");
                Console.WriteLine("2 - Depositar");
                Console.WriteLine("3 - Saldo");
                Console.WriteLine("4 - Informações da conta");
                Console.WriteLine("5 - Sair");
                Console.Write("digite uma opção: ");
                op = int.Parse(Console.ReadLine());
                if (op == 1)
                {
                    Console.Write("\nDigite o valor que deseja sacar:");
                    double saque = double.Parse(Console.ReadLine());
                    Boolean retorno = cb.Sacar(saque);
                    if (retorno == true)
                    {
                        Console.WriteLine("Saque realizado com sucesso !!! ");
                    }
                    else
                    {
                        Console.WriteLine("ERRO : saldo insuficiente");
                    }
                }
                else if (op == 2)
                {
                    Console.Write("\nDigite o valor que deseja depositar:");
                    double deposito = double.Parse(Console.ReadLine());
                    Boolean retorno = cb.Depositar(deposito);
                    if (retorno == true)
                    {
                        Console.WriteLine("Depósito realizado com sucesso");
                    }
                    else
                    {
                        Console.WriteLine("ERRO : valor digitado é inválido");
                    }
                }
                else if (op == 3)
                {
                    cb.ExibirSaldo();
                }else if (op == 4) {
                    Console.WriteLine("\nInformações da conta");
                    cb.Titular = "Vanessa Cezar do Nascimento"; //PARA MOSTRAR QUE É POSSIVEL ALTERAR O NOME DO TITULAR
                    Console.WriteLine("Nome do titular : " + cb.Titular);
                    Console.WriteLine("Número da conta : " + cb.NumeroConta);

                }
                else if(op == 5)
                {
                    Console.WriteLine("\nFIM DO PROGRAMA");
                }
                else
                {
                    Console.WriteLine("opção inválida!! tente novamente");
                }
            } while (op != 5);
        }
    }
}
