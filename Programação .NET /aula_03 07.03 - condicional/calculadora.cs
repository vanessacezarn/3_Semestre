namespace Calcualdora
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int opc;
            Console.WriteLine("\tCALCULADORA");
            do
            {
                Console.WriteLine("1-soma");
                Console.WriteLine("2-subtração");
                Console.WriteLine("3-multiplicação");
                Console.WriteLine("4-divisão");
                Console.Write("Escolha uma  opções acima: ");
                opc = int.Parse(Console.ReadLine());
                if (opc < 1 || opc > 4)
                {
                    Console.WriteLine("OPÇÃO INVALIDA !!!! - escolha uma opção válida");
                    Console.WriteLine();
                }
            } while (opc < 1 || opc > 4);

            double num1;
            Console.Write("valor 1: ");
            num1 = double.Parse(Console.ReadLine());

            double num2;
            Console.Write("valor 2: ");
            num2 = double.Parse(Console.ReadLine());
            Console.WriteLine();

            if (opc == 1)
            {
                double soma ;
                soma = num1 + num2;
                Console.WriteLine("SOMA : " + num1 + " + " + num2 + " = " + soma.ToString("N2"));
            }
            if (opc == 2)
            {
                double diferenca ;
                diferenca = num1 - num2;
                Console.WriteLine("SUBTRAÇÃO : " + num1 + " - " + num2 + " = " + diferenca.ToString("N2"));
            }
            if (opc == 3)
            {
                double multi ;
                multi = num1 * num2;
                Console.WriteLine("MULTIPLICAÇÃO : " + num1 + " * " + num2 + " = " + multi.ToString("N2"));
            }
            if (opc == 4)
            {
                double divisao ;
                if (num2 != 0)
                {
                    divisao = num1 / num2;
                    Console.WriteLine("DIVISÃO : " + num1 + " / " + num2 + " = " + divisao.ToString("N2"));
                }
                else
                {
                    Console.WriteLine("NÃO É POSSÍVEL DIVISÃO POR ZERO !!!!");
                }
            }
        }
    }
}
