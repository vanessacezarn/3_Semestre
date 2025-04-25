using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FILA
{
    internal class Processo
    {
        /// <summary>
        /// identificador do processo
        /// </summary>
        public int Id { set; get; }

        /// <summary>
        /// texto que classifica um processo
        /// </summary>
        public String Descricao { set; get; }
        
        /// <summary>
        /// construtor vazio
        /// </summary>
        /// 

       /* public Processo() { }

        /// <summary>
        /// construtor que recebe um identificador e uma descrição
        /// </summary>
        /// <param name="id">um numero entre 1 a 1000</param>
        /// <param name="descricao">um texto que classifica o processo</param>*/
        /// 
        public Processo(int id, String descricao)
        {
            Id = id;
            Descricao = descricao;
        }

        public override bool Equals(object? obj)
        {
            return obj is Processo processo &&
                   Id == processo.Id &&
                   Descricao == processo.Descricao;
        }

       
    }
}
