namespace PrimeiroProjeto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num;
            Console.Write("Digite um valor: ");
            num = int.Parse(Console.ReadLine()); //.Parse = converte a string para int //.ReadLine = le a entrada como string
            Console.WriteLine("Numero digitado = " +num); //line = \n

            double num2;
            Console.Write("Digite um valor colm virgula: ");
            num2 = double.Parse(Console.ReadLine());
            Console.WriteLine("Numero digitado = " + num2);



        }
    }
}
