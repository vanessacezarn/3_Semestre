using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exercicio01
{
    internal class ChamadoHardware : Chamado
    {
        public ChamadoHardware(string titulo, string descricao) : base(titulo, descricao)
        {
        }

        public override void Executar()
        {
            status = "Em atendimento";
            Console.WriteLine("\nAnalisando componentes de hardware");
        }
    }
}
