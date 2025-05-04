/*3) Crie uma classe Pessoa com as propriedades Nome e Idade. Adicione validação nas propriedades para que:  
a) Nome não aceite valores nulos ou strings vazias.  
b) Idade não aceite valores menores que 0 ou maiores que 120.*/

namespace exercicio03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Pessoa p = new Pessoa();

            Console.Write("digite um nome: ");
            p.Nome = Console.ReadLine();
            Console.Write("digite uma idade: ");
            p.Idade = int.Parse(Console.ReadLine());          
            Console.WriteLine("\nnome: " + p.Nome);
            Console.WriteLine("idade: " + p.Idade);




        }
    }
}
