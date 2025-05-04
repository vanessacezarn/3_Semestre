namespace aula_02._05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Pessoa p = new Pessoa();
            p.Nome = "VANESSA";

            try
            {
                p.Nome = ""; // CHAMANDO O SETTER DA PROPIEDADE
            }catch(Exception ex)
            {
                Console.WriteLine("Exceção lançada: "+ex.Message);
            }
            //CHAMANDO O GETTER DA PROPIEDADE

            Console.WriteLine("nome da pessoa: " + p.Nome);

            try
            {
                p.Idade = -1;
            }
            catch (Exception ex)
            {
                Console.WriteLine("eXCEÇÃO LANÇADA: " +ex.Message);
            }

            Console.WriteLine("idade: " + p.Idade);


            Produto produto = new Produto();
            produto.Nome = "PRODUTO 1";
            produto.Preco = 10.50;
            produto.Imposto = 0.7;
            Console.WriteLine("Produto: "+produto.Nome);
            Console.WriteLine("Preço: " +produto.Preco);
            Console.WriteLine("Imposto: "+produto.Imposto);
            Console.WriteLine("Preço final: " + produto.PrecoFinal);
        }
    }
}
