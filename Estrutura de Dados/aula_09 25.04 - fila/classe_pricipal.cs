namespace FILA
{
    internal class Program
    {
        static void GerarProcessoFila(Queue<Processo> filaPrioritaria, Queue<Processo> filaNormal, int QuantiaProcessos)
        {
            Random gera = new Random();
            int nProcessoGerado;

            //GERAR PROCESSOS
            for (int i = 0; i < QuantiaProcessos; i++)
            {
                nProcessoGerado = gera.Next(0, 1001);

                switch (nProcessoGerado)
                {
                    case 0:
                        Console.WriteLine("Atendendo: " + filaPrioritaria.Dequeue());
                        break;
                    case 500:
                        Console.WriteLine("Atendendo: " + filaNormal.Dequeue());
                        break;
                    default:
                        if (nProcessoGerado < 500)
                        {
                            Processo processoTmp = new Processo(nProcessoGerado, "processo prioritario");
                            if (!filaPrioritaria.Contains(processoTmp))
                            {
                                filaPrioritaria.Enqueue(processoTmp);

                            }

                        }
                        break;
                }

            }
            static void Main(string[] args)
            {
                Processo processo = new Processo(100, "alta prioridade");
                Queue<Processo> filaPrioritaria = new Queue<Processo>();
                Queue<Processo> filaNormal = new Queue<Processo>();

                GerarProcessoFila(filaPrioritaria, filaNormal, 5);

            }
        }
    }
}

