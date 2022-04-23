 -- script de povoamento básico para bom funcionamento do BD
 insert into TIPO_QUARTO values
 ('1', 'apartamento', '1500'),
 ('2', 'quartos duplos', '800'),
 ('3', 'enfermaria', '500');
 
  insert into CONVENIO values
 ('10', 'Unimed', '87096616000196', '6 meses'),
 ('20', 'Agemed', '02933220000101', 'sem carência'),
 ('30', 'Cassi', '33719485000399', '3 meses'),
 ('40', 'Ipê', '12132095000186', '4 meses');
 
  insert into CATEGORIA values
 ('1','pediatria'),
 ('2','clínica geral'),
 ('3','gastroenterologia'),
 ('4','dermatologia'),
 ('5','oncologia'),
 ('6','traumatologia'),
 ('7','residente');