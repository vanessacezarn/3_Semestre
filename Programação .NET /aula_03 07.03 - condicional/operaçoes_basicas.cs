namespace aula
{
    internal class Program
    {
        static void Main(string[] args)
        {
           

            double num1;
            Console.Write("Digite um valor com virgula: ");
            num1 = double.Parse(Console.ReadLine());
            Console.WriteLine("Numero digitado = " + num1);

            double num2;
            Console.Write("Digite um valor com virgula: ");
            num2 = double.Parse(Console.ReadLine());
            Console.WriteLine("Numero digitado = " + num2);

            double soma;
            soma = num1 + num2;
            Console.WriteLine("SOMA dos valores digitado: "+num1+" + "+num2 +" = "+ soma.ToString("N2"));

            double diferenca;
            diferenca = num1 - num2;
            Console.WriteLine("SUBTRAÇÃO dos valores digitado = " + num1 + " - " + num2 + " = " + diferenca.ToString("N2"));

            double multi;
            multi = num1 * num2;
            Console.WriteLine("MULTIPLICAÇÃO dos valores digitado = " + num1 + " * " + num2 + " = " + multi.ToString("N2"));

            double divisao;
            divisao = num1 / num2;
            Console.WriteLine("DIVISÃO dos valores digitado = " + num1 + " / " + num2 + " = " + divisao.ToString("N2"));







            //fim
        }
    }
}
