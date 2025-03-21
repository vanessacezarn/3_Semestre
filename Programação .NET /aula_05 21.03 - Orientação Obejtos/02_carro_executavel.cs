namespace Exercicio_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
           Console.WriteLine("Carro 1");
           Carro c= new Carro();
           Console.Write("Digite a marca:");
           c.marca = Console.ReadLine();
           Console.Write("Digite o modelo:");
           c.modelo = Console.ReadLine();
           Console.Write("Digite o ano de fabricação:");
           c.anoFabricação = int.Parse(Console.ReadLine());

           Console.WriteLine("Carro 2");
           Carro c2= new Carro();
           Console.Write("Digite a marca:");
           c2.marca = Console.ReadLine();
           Console.Write("Digite o modelo:");
           c2.modelo = Console.ReadLine();
           Console.Write("Digite o ano de fabricação:");
           c2.anoFabricação = int.Parse(Console.ReadLine());

            Console.WriteLine();
            Console.WriteLine("Informações digitadas");
            Console.WriteLine("Carro 1 ");
            Console.WriteLine("marca: "+c.marca);
            Console.WriteLine("modelo: " + c.modelo);
            Console.WriteLine("Ano de fabricação: " + c.anoFabricação);
            Console.WriteLine();
            Console.WriteLine("Carro 2 ");
            Console.WriteLine("marca: " + c2.marca);
            Console.WriteLine("modelo: " + c2.modelo);
            Console.WriteLine("Ano de fabricação: " + c2.anoFabricação);
        }
    }
}
