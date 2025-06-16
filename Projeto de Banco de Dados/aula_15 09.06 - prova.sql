-- PROVA 2 - PROVA TEÓRICA, ESCRITA, E PARTE PRÁTICA, 5 QUESTÕES ABAIXO
-- FOI UTILIZADO OS SCRIPTS DISPONIBILIZADOS PELA PROFESSOR NO GITHUB
-- https://github.com/alexandrezamberlan/bancoDeDadosUFN/blob/main/bancosDeDados/2%20-%20scriptEditora.sql
-- https://github.com/alexandrezamberlan/bancoDeDadosUFN/blob/main/bancosDeDados/2.2%20-%20scriptEditora_insertsSelects.sql

-- 1)selecione autores (nomes) que escrevem livros do genero ficcao

select autor.nome
from autor, livro, genero,livro_autor
where (genero.descricao ="Ficção") and  genero.idGenero = livro.idGenero and livro_autor.idLivro= livro.idLivro and livro_autor.idAutor=autor.idAutor;

-- 2) nome das editoras que tem autores escrevendo infantil
select editora.nome
from editora, genero, livro
where (genero.descricao ="Infantil") and genero.idGenero = livro.idGenero and livro.idEditora = editora.idEditora;

-- 3) mostre os livros, com seus generos e editora que o autor francisco escreveu 
select livro.titulo, genero.descricao, editora.nome
from livro, genero,editora,livro_autor, autor
where (autor.nome = "Francisco") and autor.idAutor = livro_autor.idAutor and livro_autor.idLivro = livro.idLivro and genero.idGenero = livro.idGenero and editora.idEditora = livro.idEditora;

-- 4) nome do autor que mais escreveu livro 


select autor.nome
from autor, livro_autor
where autor.idAutor = livro_autor.idAutor
group by autor.idAutor
order by count(livro_autor.idLivro) desc
limit 1;



-- 5) genero mais publicado em todas as editora 


select genero.descricao
from genero, livro
where genero.idGenero = livro.idGenero
group by genero.idGenero
order by count(livro.idLivro) desc
limit 1;
