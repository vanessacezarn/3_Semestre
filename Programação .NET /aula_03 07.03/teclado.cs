namespace aula
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //.Parse = converte a string para int //.ReadLine = le a entrada como string
            int num;
            Console.Write("Digite um valor: ");
            num = int.Parse(Console.ReadLine()); 
            Console.WriteLine("Numero digitado = " + num); //line = \n

            double num2;
            Console.Write("Digite um valor com virgula: ");
            num2 = double.Parse(Console.ReadLine());
            Console.WriteLine("Numero digitado = " + num2);

            char l;
            Console.Write("Digite uma letra: ");
            l = char.Parse(Console.ReadLine());
            Console.WriteLine("Letra digitada = " + l);

            string frase;
            Console.Write("Digite uma frase: ");
            frase = Console.ReadLine();
            Console.WriteLine("Frase digitada = " + frase);

        }
    }
}
