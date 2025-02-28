namespace PrimeiroProjeto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            double nota1, nota2, nota3,media;
            Console.WriteLine("ATRIBUINDO 3 NOTAS PARRA O ALUNO");
            nota1 = 7.5;
            Console.WriteLine("nota 1 = "+nota1);
            nota2 = 9.9;
            Console.WriteLine("nota 2 = "+nota2);
            nota3 =0.7;
            Console.WriteLine("nota 3 = "+nota3);
            media = (nota1 + nota2 + nota3) / 3;
            Console.WriteLine("MEDIA DO ALUNO = "+media.ToString("N2"));

            int i = 0;
            Console.WriteLine("i= "+i);
            i += 1;
            Console.WriteLine("i= " + i);
            i = i + 1;
            Console.WriteLine("i= " + i);
            i++;
            Console.WriteLine("i= " + i);
            i += 2;
            Console.WriteLine("i= " + i);
            i = i + 3;
            Console.WriteLine("i= " + i);

           



        }
    }
}
