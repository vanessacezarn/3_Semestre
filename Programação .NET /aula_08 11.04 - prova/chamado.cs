using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exercicio01
{
    abstract class Chamado
    {
        public String titulo;
        public String descricao;
        public String status;

        
        public Chamado(String titulo, String descricao)
        {
            this.titulo = titulo;
            this.descricao = descricao;
            this.status = "Aberto";
        }

        public abstract void Executar();

        public void Exibir()
        {
            Console.WriteLine("\nExibindo informações sobre o chamado");
            Console.WriteLine("Titulo: "+titulo);
            Console.WriteLine("Descrição: " + descricao);
            Console.WriteLine("Status: " + status);




        }

    }
}
