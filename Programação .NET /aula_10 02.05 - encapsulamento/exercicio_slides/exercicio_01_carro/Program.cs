//Crie uma classe Carro com três propriedades: Marca, Modelo e Ano.
//Use o encapsulamento adequado para garantir que:
//a) A Marca e o Modelo possam ser lidose escritos externamente.
//b) O Ano só possa ser definido no construtor e acessado (mas não modificado) depois disso.
namespace exercicio01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Carro c = new Carro("Ka", "Ford", 2025);
            Console.WriteLine("modelo: "+c.Modelo);
            Console.WriteLine("marca: "+c.Marca);
            Console.WriteLine("ano: "+c.Ano);

            Console.WriteLine("\ntestando modificações");
            c.Modelo = "gol";
            c.Marca = "VW";
            Console.WriteLine("modelo: " + c.Modelo);
            Console.WriteLine("marca: " + c.Marca);


        }
    }
}
