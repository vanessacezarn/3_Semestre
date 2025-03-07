namespace aula
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //CONDICIONAL
            int n;
            Console.Write("Digite um numero:");
            n = int.Parse(Console.ReadLine());
            if (n % 4 ==0 && n%3 == 0)
            {
                Console.WriteLine(n +" é divisivel por 4, 3 e 2 ao mesmo tempo");
            }
            else 
            {
                Console.WriteLine(n + " não é divisivel por 4, 3 e 2 ao mesmo tempo");
            }
            
            

            //fim
        }
    }
}
