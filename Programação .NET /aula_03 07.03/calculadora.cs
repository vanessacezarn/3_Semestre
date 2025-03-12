namespace aula
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int opc;
            Console.Write("CALCULADORA");
            do{
                Console.WriteLine("1-soma");
                Console.WriteLine("2-subtração");
                Console.WriteLine("3-multiplicação");
                Console.WriteLine("4-divisão");
                Console.Write("Escolha uma  opções acima: ");
                opc=int.Parse(Console.ReadLine());
                if(opc1<1 || opc >4){
                    Console.Write("OPÇÃO INVALIDA");
                }
            }while(opc1<1 || opc >4);

            double num1;
            Console.Write("Digite os valores para realizar as operações:");
            Console.Write("valor 1: ");
            num1 = double.Parse(Console.ReadLine());

            double num2;
            Console.Write("valor 2: ");
            num2 = double.Parse(Console.ReadLine());

            if(opc == 1){
                double soma;
                soma = num1 + num2;
                Console.WriteLine("SOMA dos valores digitado: "+num1+" + "+num2 +" = "+ soma.ToString("N2"));
            }
            if(opc==2){    
                double diferenca;
                diferenca = num1 - num2;
                Console.WriteLine("SUBTRAÇÃO dos valores digitado = " + num1 + " - " + num2 + " = " + diferenca.ToString("N2"));
            }
            if(opc==3){
                double multi;
                multi = num1 * num2;
                Console.WriteLine("MULTIPLICAÇÃO dos valores digitado = " + num1 + " * " + num2 + " = " + multi.ToString("N2"));
            }
            if(opc==4){
                double divisao;
                divisao = num1 / num2;
                Console.WriteLine("DIVISÃO dos valores digitado = " + num1 + " / " + num2 + " = " + divisao.ToString("N2"));
            }






            //fim
        }
    }
}
