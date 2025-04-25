//VANESSA CEZAR DO NASCIMENTO
//11_04_2025 - PROVA

namespace exercicio01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String titulo;
            String descricao;
            int tipo=0;

            
            Console.Write("Digite o titulo do chamado: ");
            titulo = Console.ReadLine();
            Console.Write("Digite a descrição do chamado: ");
            descricao = Console.ReadLine();
            

            do
            {
                Console.WriteLine("Qual o tipo do chamado?");
                Console.WriteLine(" 1 - chamado de Hardware");
                Console.WriteLine(" 2 - chamado de Software ");
                tipo = int.Parse(Console.ReadLine());
                if (tipo != 1 && tipo != 2)
                {
                    Console.WriteLine("OPÇÃO INVALIDA");
                }
            } while (tipo != 1 && tipo != 2);

            if (tipo == 1)
            {
             
                ChamadoHardware ch = new ChamadoHardware(titulo,descricao);
                
                ch.Exibir();
                ch.Executar();
                ch.Exibir();
               
            }
            else
            {
                
                ChamadoSoftware cs = new ChamadoSoftware(titulo, descricao);
                cs.Exibir();
                cs.Executar();
                cs.Exibir();
                
            }


            
        }
    }
}
