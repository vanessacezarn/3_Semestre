namespace primeiroProjeto
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" bom dia!!!!!!!!");
            int n1, n2,n3;
            n1 = 5;
            n2 = 54;
            n3 = n2 + n1;
            Console.WriteLine("N1 = " + n1);//atalho cw+tab+tab
            Console.WriteLine("N2 = " + n2);
            Console.WriteLine("N1 + N2 ="+n3);

            var dt = new DateTime();
            
            dt = DateTime.Now;
            Console.WriteLine(dt);

            Console.WriteLine("DIA = " + dt.Day);
            Console.WriteLine("MÊS= " + dt.Month);
            Console.WriteLine("ANO =" + dt.Year);
            Console.WriteLine("HORA = "+ dt.Hour);
            Console.WriteLine("MINUTO = "+ dt.Minute);
            



        }
    }
}
