describe gafanhotos;

alter table gafanhotos
add column cursopreferido int;

alter table gafanhotos
add foreign key (cursopreferido)
references cursos(idcurso);

select * from gafanhotos;
describe gafanhotos;

/*para conectar uma FK com outros atributos da sua tabela de origem, utilizamos estes comandos:
select entidade.atributo from entidade_da_FK join entidade_original*/
select gafanhotos.nome, gafanhotos.cursopreferido, cursos.nome
from gafanhotos join cursos;

/*para selecionar de forma inteligente fazemos um inner join com ON, para mostrar somente o que tem PK e 
FK em comum:*/
select gafanhotos.nome, gafanhotos.cursopreferido, cursos.nome
from gafanhotos join cursos
on cursos.idcurso = gafanhotos.cursopreferido;

/*para focar em um dos lados específicos dos atributos relacionados, usamos right e left (outter) joins,
 isso faz com que todos os dados da tabela sejam mostrados*/
select gafanhotos.nome, gafanhotos.cursopreferido, cursos.nome
from gafanhotos left join cursos
on cursos.idcurso = gafanhotos.cursopreferido;

select gafanhotos.nome, gafanhotos.cursopreferido, cursos.nome
from gafanhotos right join cursos
on cursos.idcurso = gafanhotos.cursopreferido;