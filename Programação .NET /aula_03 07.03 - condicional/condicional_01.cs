namespace aula
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //CONDICIONAL
            int n;
            Console.WriteLine("Digite um numero:");
            n = int.Parse(Console.ReadLine());
            if (n > 0)
            {
                Console.WriteLine("POSITIVO");
            }
            
            else if(n<0)
            {
                Console.WriteLine("NEGATIVO");
            }
            else
            {
                Console.WriteLine("zero");
            }

            //fim
        }
    }
}
