-- Conta quantas tuplas/linhas há na tabela Ranking_Semanal
select count(*)
from Ranking_Semanal;

-- i.Mostre todos (*) os autores cadastrados; 
select *
from autor;

-- ii.Mostre apenas os nomes dos autores;
select nome
from autor;

-- iii.Mostre o nome e a identificação do autor, nesta ordem;
select nome, idAutor
from autor;

-- iv.Mostre o nome dos autores que aparecem na tabela Livro_Autor;
select Autor.nome
from Autor, Livro_Autor
where Autor.idAutor = Livro_Autor.idAutor;
-- ESTA ORDENADO PELO ID

-- v.Mostre o nome dos autores, sem repetição - distinct , presentes na tabela Livro_Autor; 
select distinct Autor.nome
from Autor, Livro_Autor
where Autor.idAutor = Livro_Autor.idAutor;

-- vi.Mostre os autores em ordem alfabética;
select nome
from autor
order by autor.nome;

-- vii.Mostre o título dos livros que são da editora Rocco ou da editora Scipione; 
select Livro.titulo, Editora.nome
from Livro, Editora
where (Editora.nome = "Rocco" or Editora.nome = "Scipione") and Livro.idEditora = Editora.idEditora;

-- viii.Mostre, em ordem alfabética, os autores que começam com M;
select nome
from autor
where nome like "M%"
order by nome;

-- ix.Mostre, em ordem alfabética, os autores que começam com L;
select nome
from autor
where nome like "L%"
order by nome;

-- x.Mostre, em ordem alfabética, os autores que NÃO começam com L; 
select nome
from autor
where nome not like "L%"
order by nome;

-- xi.Mostre, em qualquer ordem, os autores que não começam com M;
select nome
from autor
where nome not like "M%";

-- xii.Liste apenas os livros das editoras 1 OU 5;
select titulo
from livro
where idEditora = 1 or idEditora = 5;

-- xiii.Mostre os livros infantis das editoras 1 e 5;
select livro.titulo, livro.idEditora
from  livro
where livro.idGenero = 1 and (livro.idEditora = 1 or livro.idEditora = 5);

      
-- xiv.Mostre os códigos e os títulos dos livros, com seus respectivos preços;
select idLivro, titulo, preco
from livro;

-- xv.Mostre os autores em ordem contrária à alfabética;
select nome
from autor
order by nome desc;

-- xvi.Liste os livros, na ordem de preços do mais caro ao mais barato; 
select preco
from livro
order by preco desc;

-- xvii.Liste os livros, na ordem de preços do mais barato ao mais caro;
select preco
from livro
order by preco ;

-- xviii.Mostre apenas os livros de auto-ajuda, na ordem crescente de preço; 
select titulo, idGenero, preco
from livro
where idGenero = 4
order by preco;

select livro.titulo, genero.descricao, livro.preco
from livro, genero
where genero.descricao = "Auto-ajuda" and livro.idGenero = genero.idGenero
order by preco asc;

-- xix.Mostre quantos autores estão cadastros;
select count(nome)
from autor;

-- xx.Mostre os preços dos livros mais baratos e mais caros da editora 1; 
select max(livro.preco) as livroCaro, min(livro.preco) as livroBarato, editora.nome                                               
from livro, editora
where (livro.idEditora = editora.idEditora and livro.idEditora = 1);
 
-- xxi.Liste a média de preços dos livros da editora 2;
select avg(preco) as precoMedio
from livro
where idEditora=2;

-- xxii.Mostre os livros com seus respectivos nomes de editoras e gêneros;
select livro.titulo, editora.nome, genero.descricao
from livro, editora, genero
where livro.idEditora = editora.idEditora and livro.idGenero = genero.idGenero;


-- xxiii.Liste os livros, mostrando o titulo de cada um bem como o nome do autor;
select livro.titulo, autor.nome
from livro, autor, livro_autor
where livro.idLivro = livro_autor.idLivro and autor.idAutor = livro_autor.idAutor;


-- xxiv.Mostre o título do livro que ficou o maior número de semanas consecutivas em 1o lugar;
select livro.titulo, ranking_semanal.posicao, max(ranking_semanal.semanasConsecutivas) as SemanasConsecutivas
from livro, ranking_semanal
where (livro.idLivro = ranking_semanal.idLivro) and (ranking_semanal.posicao = 1);

-- xxv.Mostre o nome dos autores dos livros que estavam no ranking da semana de 24/08/2003 a 30/08/2003;
select distinct autor.nome
from autor,livro, ranking_semanal, ranking, livro_autor
where (livro.idLivro = ranking_semanal.idLivro) and (livro_autor.idAutor = autor.idAutor) 
and livro_autor.idLivro = livro.idLivro
and (ranking.dataInicial = 20250824 and ranking.dataFinal = 20030830) 
and (ranking.idRanking = ranking_semanal.idRanking);


