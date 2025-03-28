# Exemplo lâmpada
### Classe
    • criando metodos ligar, desligar, estaLigado
``` .cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace aula0601
{
    internal class Lampada
    {
        public bool ligada;
        public double potencia;


        public void ligar()
        {
            if (!ligada)
            {
                ligada = true;
                Console.WriteLine("ligando lampada !!!");
            }
            else
            {
                Console.WriteLine("lampada já esta ligada");
            }
        }

        public void desligar()
        {
            if (ligada)
            {
                Console.WriteLine("desligando lampada !!!");
                ligada = false;
            }
            else
            {
                Console.WriteLine("lampada ja esta desligada");
            }
        }
        public bool estaLigada()
        {
            return ligada;
        }

    }
}

```
### Principal
``` .cs
namespace aula0601
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Lampada l = new Lampada();
            l.ligar();
            l.ligar();
            l.ligar();
            l.desligar();
            l.ligar();
            l.desligar();
            l.desligar();
            bool retorno = l.estaLigada();
            Console.WriteLine("a lampada esta ligada ? "+retorno);
        }
    }
}

```
