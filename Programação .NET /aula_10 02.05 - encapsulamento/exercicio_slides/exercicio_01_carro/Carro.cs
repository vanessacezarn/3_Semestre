//Crie uma classe Carro com três propriedades: Marca, Modelo e Ano.
//Use o encapsulamento adequado para garantir que:
//a) A Marca e o Modelo possam ser lidos e escritos externamente.
//b) O Ano só possa ser definido no construtor e acessado (mas não modificado) depois disso.
namespace exercicio01
{
    class Carro
    {
        private String _modelo;
        private String _marca;
        private int _Ano;

        public Carro(String _modelo, String _marca, int _Ano)
        {
            this._modelo = _modelo;
            this._marca = _marca;
            this._Ano = _Ano;
        }
        public String Modelo
        {
            get{
                return _modelo;
            }
            set
            {
                _modelo = value;
            }
        }

        public String Marca
        {
            get
            {
                return _marca;
            }
            set
            {
                _marca = value;
            }
        }

        public int Ano
        {
            get
            {
                return _Ano;
            }
        }

    }
}
