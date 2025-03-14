//Lista 1 - com n números aleatórios tamanho n - números de 0 a 100 e sem repetições
//Lista 2 - com n números aleatórios tamanho n - números de 0 a 100 e sem repetições
//Lista 3 - números comuns nas 2 listas

using System.Net.Mime;

Random random = new Random();   

//LISTA 1
int l1 = random.Next(1,10);
Console.WriteLine("LISTA 1: "+l1);

List<int> lista1 = new List<int>();
int numeros_l1;
for (int i = 0; i < l1; i++)
{
    numeros_l1 = random.Next(0, 20);
    lista1.Add(numeros_l1);
    
}
foreach (var i in lista1)
{
    Console.WriteLine(i);
}
//LISTA 2
int l2 = random.Next(1, 10);
Console.WriteLine( );
Console.WriteLine("LISTA 2 :"+l2);

List<int> lista2 = new List<int>();
int numeros_L2;

for (int i = 0; i < l2; i++)
{
    numeros_L2 = random.Next(0, 20);
    lista2.Add(numeros_L2);

}
foreach (var i in lista2)
{
    Console.WriteLine(i);
}

List<int> lista3 = lista1.Intersect(lista2).ToList();
Console.WriteLine("lista 3 ");

if (lista3.Count > 0)
{
    foreach (var i in lista3)
    {
        Console.WriteLine(i);
    }
}
else
{
    Console.WriteLine("Não há números em comum.");
}

