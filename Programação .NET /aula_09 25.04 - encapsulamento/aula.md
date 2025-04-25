# ENCAPSULAMENTO
## campo
     • se é campo é private
         exemplo: int _numero;
      • 
**CLASSE - produto**
```.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace encapsulamento
{
    internal class Produto
    {
        private int _codigo;
        private string _nome;
        private string _valor;

        //PROPRIEDADE -> privado
        public int Quantidade { get; set; } //atalho prop
       

        public void exibir()
        {
            Console.WriteLine("Codigo: "+_codigo);
            Console.WriteLine("nome: " + _nome);
            Console.WriteLine("valor: " + _valor);
            Console.WriteLine("quantidade: "+Quantidade);

        }
    }
}

```

**CLASSE - principal**
```.cs

```
