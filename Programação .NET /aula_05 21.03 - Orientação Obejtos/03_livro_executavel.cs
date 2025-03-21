namespace exercicio04
{
    internal class Program
    {
        static void Main(string[] args)
        {
           
            Console.WriteLine("LIvro 1");
            Livro l = new Livro();
            Console.Write("Digite a titulo:");
            l.titulo = Console.ReadLine();
            Console.Write("Digite o autor:");
            l.autor = Console.ReadLine();
            Console.Write("Digite o ano de publicação:");
            l.ano_publicacao = int.Parse(Console.ReadLine());

           
            Console.WriteLine("LIvro 2");
            Livro l2 = new Livro();
            Console.Write("Digite a titulo:");
            l2.titulo = Console.ReadLine();
            Console.Write("Digite o autor:");
            l2.autor = Console.ReadLine();
            Console.Write("Digite o ano de publicação:");
            l2.ano_publicacao = int.Parse(Console.ReadLine());

            Console.WriteLine("LIvro 3");
            Livro l3 = new Livro();
            Console.Write("Digite a titulo:");
            l3.titulo = Console.ReadLine();
            Console.Write("Digite o autor:");
            l3.autor = Console.ReadLine();
            Console.Write("Digite o ano de publicação:");
            l3.ano_publicacao = int.Parse(Console.ReadLine());

            Console.WriteLine();
            Console.WriteLine("Informações digitadas");
            Console.WriteLine("Livro 1 ");
            Console.WriteLine("Titulo: "+l.titulo);
            Console.WriteLine("autor: " + l.autor);
            Console.WriteLine("ano publicação: " + l.ano_publicacao);
            Console.WriteLine();
            Console.WriteLine("Informações digitadas");
            Console.WriteLine("Livro 2 ");
            Console.WriteLine("Titulo: " + l2.titulo);
            Console.WriteLine("autor: " + l2.autor);
            Console.WriteLine("ano publicação: " + l2.ano_publicacao);
            Console.WriteLine();
            Console.WriteLine("Informações digitadas");
            Console.WriteLine("Livro 3 ");
            Console.WriteLine("Titulo: " + l3.titulo);
            Console.WriteLine("autor: " + l3.autor);
            Console.WriteLine("ano publicação: " + l3.ano_publicacao);
            Console.WriteLine();

        }
    }
}
