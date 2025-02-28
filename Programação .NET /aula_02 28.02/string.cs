namespace PrimeiroProjeto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("primeiro projeto c#");
            Console.WriteLine("VAMOS INICIAR MANIPULANDO STRING");
            string frase = "Frase da declaração de variavel com string";
            string frase2 = "Frase da declaração de variavel com string";

            //CONCATENANDO STRING
            Console.WriteLine("concatenando string");
            Console.WriteLine("FRASE 1 = "+frase);
            Console.WriteLine("FRASE 2 = " + frase2);
            //INTERPOLAÇÃO
            Console.WriteLine("intertpolando string");
            Console.WriteLine($"FRASE 1 =  { frase}");
            Console.WriteLine($"FRASE 2 =  {frase2}");

            //ctrl k - comentar bloco
        }
    }
}
