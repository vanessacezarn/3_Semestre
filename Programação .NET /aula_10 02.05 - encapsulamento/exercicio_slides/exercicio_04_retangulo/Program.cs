/*4) Crie uma classe Retangulo com propriedades para Largura e Altura, e uma propriedade calculada Area. 
 * A área deve ser calculada como Largura * Altura. */
namespace exercicio04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Retangulo r = new Retangulo();

            Console.Write("digite a largura do retângulo: ");
            r.Largura = double.Parse(Console.ReadLine());
            Console.Write("digite a altura do retângulo: ");
            r.Altura = double.Parse(Console.ReadLine());
            Console.WriteLine("A área do retângulo digitada é de "+ r.Area());
        }
    }
}
