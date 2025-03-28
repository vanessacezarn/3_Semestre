## Exercicio

### classe - pessoa 
```.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exercicio01
{
    internal class Pessoa
    {
        public String nome;
        public DateTime data_nascimento;
        public int rg;
        public String cpf;

        public Pessoa(string nome, DateTime data_nascimento, int rg, string cpf)
        {
            this.nome = nome;
            this.data_nascimento = data_nascimento;
            this.rg = rg;
            this.cpf = cpf;
        }

        

        public void exibir()
        {
            Console.WriteLine("\n EXIBINDO DADOS");
            Console.WriteLine("Nome: "+this.nome);
            Console.WriteLine("CPF: " + this.cpf);
            Console.WriteLine("Data de nascimento: " + this.data_nascimento.ToString("d"));
            Console.WriteLine("RG: " + this.rg);
        }
    }
}

```
### principal 
```.cs
namespace exercicio01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String nome;
            DateTime data_nascimento = new DateTime();
            int rg;
            String cpf;
            
            Console.WriteLine(" Digite os dados:");
            Console.WriteLine("nome: ");
            nome = Console.ReadLine();
            Console.WriteLine("cpf: ");
            cpf = Console.ReadLine();
            Console.WriteLine("data de nascimento: ");
            data_nascimento = DateTime.Parse(Console.ReadLine());// DESSA FORMA TER QUE DAR ESPAÇO AO DIGITAR A DATA DIA ESPAÇO MES ESPAÇO ANO
            // OU CRIAR VARIAVEL ANO, MES, DIA E LER UMA POR UMA 
            Console.WriteLine("rg: ");
            rg = int.Parse(Console.ReadLine());

            Pessoa p = new Pessoa(nome,data_nascimento,rg,cpf);

            p.exibir();
        }
    }
}
```
