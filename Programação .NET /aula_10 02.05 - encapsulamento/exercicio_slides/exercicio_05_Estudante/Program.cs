/*Defina uma classe Estudante que contém as propriedades Nome e uma propriedade privada notaFinal.  
A notaFinal deve ser acessível apenas através de um método GetNotaFinal(), que deve retornar "Aprovado" 
se a nota for maior ou igual a 70 e "Reprovado" se for menor*/
namespace exercicio05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Estudante e = new Estudante("Vanessa", 60);
            Console.WriteLine("Estudante 1");
            Console.WriteLine("Nome: "+e.Nome);
            Console.Write("Situação: "+ e.GetNotaFinal());

            Estudante e2 = new Estudante("Amanda", 89);
            Console.WriteLine("\n\nEstudante 2");
            Console.WriteLine("Nome: " + e2.Nome);
            Console.Write("Situação: " + e2.GetNotaFinal());

        }
    }
}
