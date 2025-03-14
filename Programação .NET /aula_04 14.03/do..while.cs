using System;

namespace quartoProjeto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int op;
            do
            {
                Console.Write("Digite um numero:");
                op = int.Parse(Console.ReadLine());

            } while (op != 0);
            if(op == 0)
            {
                Console.WriteLine("FIM DO PROGRAMA");
            }



        }
    }
}
