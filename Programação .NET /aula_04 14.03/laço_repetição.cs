namespace quartoProjeto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i;
            for (i = 0; i < 10; i++)
            {
                if (i == 7) //para em i =7
                {
                    break;
                }
                Console.WriteLine("i vale " + i);

            }
            Console.WriteLine();
            for (i = 10; i > 0; i--)
            {
                if (i == 5) //pulado i =5
                {
                    continue;
                }
                Console.WriteLine("i vale " + i);

            }



        }
    }
}
