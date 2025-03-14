//Exercicio - 1) c# exercicio dos nomes
//             2) java e c# - gerar valores(n valores) de glicemia aleatórios entre 50 e 240.
//                A)aplicar a média B) aplicar a mediana - ordenar - capturar o valor do meio C) aplicar a moda

using System.Net.Mime;

Console.WriteLine("GLICEMIA");

Random random = new Random();
//GERAR QUANTOS VALORES DE GLICEMIA SERAM GERADOS
int ninteiro = random.Next(1, 15);
Console.WriteLine("Número gerado: " + ninteiro);

//GERAR VALORES DE GLICEMIA E ADICIONA-LOS NA LISTA numeros
int glicemia;

List<int> numeros = new List<int>();

for (int i = 0; i < ninteiro; i++)
{
    glicemia = random.Next(50, 240);
    numeros.Add(glicemia);
    /* if (!numeros.Contains(glicemia))
     {
         numeros.Add(glicemia);
     }*/

}
//MOSTRAR OS VALORES DE GLICEMIA
foreach (var i in numeros)
{
    Console.WriteLine(i);
}

//CALCULO DA MÉDIA
double media, soma = 0;
foreach (var i in numeros)  //percorre a lista
{
    soma = soma + i;

}
media = soma / ninteiro;
Console.WriteLine("MEDIA: " + media.ToString("N2"));

//calculo da mediana
double mediana;
numeros.Sort();
/*Console.WriteLine("A lista contem " + numeros.Count());
foreach (var i in numeros)
{
    Console.WriteLine(i);
}*/
if (ninteiro % 2 == 0)
{
    int meio = ninteiro / 2;
    int meio2 = ninteiro / 2 - 1;

    mediana = (double)(numeros[meio] + numeros[meio2]) / 2;
}
else
{
    int meioo = ninteiro / 2;
    mediana = (double)numeros[meioo];
}
Console.WriteLine("MEDIANA : " + mediana);

//calculo da moda - zamberlan
int valorAvaliado, ocorrenciaAvaliado, moda = 0, ocorrenciaModa = 0;
foreach (var i in numeros)
{
    valorAvaliado = i;
    ocorrenciaAvaliado = 0;
    foreach (var j in numeros)
    {
        if (valorAvaliado == j)
        {
            ocorrenciaAvaliado++;
        }

    }
    if (ocorrenciaAvaliado > ocorrenciaModa)
    {
        moda = valorAvaliado;
        ocorrenciaModa = ocorrenciaAvaliado;
    }
}

if (ocorrenciaModa > 1)
{
    Console.WriteLine("MODA = " + moda);
}
else
{
    Console.WriteLine("NÃO HÁ MODA");
}
