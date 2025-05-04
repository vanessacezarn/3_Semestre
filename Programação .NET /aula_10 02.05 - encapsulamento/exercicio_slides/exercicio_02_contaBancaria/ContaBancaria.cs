using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*2) Crie uma classe ContaBancaria com os seguintes atributos: NumeroConta, Saldo e Titular.
Criar propriedades para acesso (get e set) aos dados.
Analise as necessidades de encapsulamento.
Crie os métodos construtor, public bool Depositar(double valor), public bool Sacar(double valor) e public void ExibirSaldo()*/
namespace exercicio02
{
    class ContaBancaria
    {
        private String _numeroConta;
        private String _titular;
        private double _saldo;

        //NUMERO CONTASÓ PODE SER OBTIDOS, POIS NÃO SE PODE MUDAR O Nº DA CONTA DEPOIS DE ABERTA UMA CONTA
        public String NumeroConta
        {
            get { return _numeroConta; }
        }
        public String Titular
        {
            get { return _titular; }
            set { _titular = value; }
        }

        public double Saldo
        {
            get { return _saldo; }
            set { _saldo = value; }
        }

        public ContaBancaria(String numeroConta, string nome, double saldo)
        {
            _numeroConta = numeroConta;
            _titular = nome;
            Saldo = saldo;
        }
        public bool Depositar(double valor)
        {
            if (valor > 0)
            {
                Saldo = Saldo + valor;
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool Sacar(double valor)
        {
            if(_saldo < valor)
            {
                return false;
            }
            else {
                Saldo = Saldo - valor;
                return true;
            }
        }
        public void ExibirSaldo()
        {
            Console.WriteLine("saldo = "+Saldo);
        }
    }
}
