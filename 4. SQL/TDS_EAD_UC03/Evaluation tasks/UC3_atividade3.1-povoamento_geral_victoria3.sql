-- Script para -- script de povoamento geral do BD

insert into MEDICO values
 ('16', 'Maria Andrade', '1970/07/01', '87936245714', '7845632198', 'RS', '9', '51998745632', 'Rua Casemiro de Abreu 453'),
 ('17', 'Emanuela Silva', '1989/08/18', '77795188645', '1457485236', 'RS', '10', '51998720632', 'Rua Anita Garibaldi 600'),
 ('18', 'Karen Cardoso', '1982/11/22', '32565899655', '4863245879', 'RS', '11', '51996574748', 'Avenida Bagé 1230/ ap 808'),
 ('19', 'Guilherme Conçalves', '1999/06/15', '44865936971', '5847696641', 'SC', '15', '51936587455', 'Rua São Manoel 285/ap 912'),
 ('20', 'Marcelo Rigon', '2000/12/31', '33694785261', '1026985563', 'PR', '13', '51996554410', 'Rua Sete de Abril 567/ap 807'),
 ('21', 'Caroline Fontana', '1969/04/28', '59645781562', '7418529632', 'RS', '14', '51996588521', 'Avenida Paraná 270/ap 606'),
 ('22', 'Geraldo Pozebon', '1978/08/05', '96498594478', '1254698563', 'RS', '13', '51994587215', 'Avenida Oswaldo Aranha 4000'),
 ('23', 'Gilberto Gama', '1985/07/14', '78945612352', '8547963250', 'RS', '10', '51915847663', 'Travessa da liberdade 150'),
 ('24', 'Lucas Vargas', '1966/03/09', '99565425899', '5540036908', 'RS', '11', '51923955968', 'Rua Nova York 563/ap 505'),
 ('25', 'Juliana Lima', '1990/06/03', '99945063500', '4893265415', 'RS', '12', '51978654111', 'Avenida Cristóvão Colombo 1356');
 
 insert into PACIENTE values
 ('26', 'Salete Maria Domingo', '1988/01/29', 'Rua Professor Álvaro Alvim 405', '51999810836', 'saletemd@gmail.com', '26560847098', '234745782', '8'),
 ('27', 'Michele Maia', '1960/06/24', 'Rua Miguel Teixeira 797', '51992730921', 'mm1960@gmail.com', '72664320068', '181884367', '4'),
 ('28', 'Vinicius da Silva', '1991/03/10', 'Praça Ruben Santos Noronha 702', '51991918276', 'viniciusds@gmail.com', '81586293001', '8158629300', '5'),
 ('29', 'Jeison Knuck', '1992/05/26', 'Praça Professor Ernani Maria Fiori 979', '51989159560', 'jeisonk@outlook.com', '91240520000', '115834953', '6'),
 ('30', 'Heitor Schimidt', '1975/07/30', 'Rua Marechal Francisco Bitencourt 251','51985951225', 'hschimidt@yahoo.com.br', '68733165041', '4447636489', '7'),
 ('31', 'Claudia Macedo', '1980/09/15', 'Rua Quintino Bocaiuva 974', '51982556782', 'clau.macedo@maceng.com.br', '66075435026', '202662469', '8'),
 ('32', 'Cecília Correia', '1982/12/14', 'Rua Cinco Mil Setecentos e Dois 665', '51985835161', 'cecicorreia@gmail.com', '94484743000', '320802085', '4'),
 ('33', 'Miguel de Jesus', '1990/10/25', 'Rua Ponciano Pacheco da Silveira 555', '51982537379', 'miguel.dj@hotmail.com', '17039080079', '147224639', '5'),
 ('34', 'Terezinha Machado', '1978/09/03', 'Rua Juvenal Cruz 348', '51981309031', 'tt.machado@hotmail.com', '11177870010', '229004039', '6'),
 ('35', 'Gabriela Domingues', '1977/04/19', 'Rua Artur Rocha 595', '51466023015', 'gabydomi@gmail.com', '41882187032', '179284927', '7'),
 ('36', 'Amanda de Oliveira', '1978/10/24', 'Beco Dois 360', '51998999650', 'mandyoliv@hotmail.com', '95326032040', '232965584', '7'),
 ('37', 'Graça Dorival', '1995/05/06', 'Acesso E Dois 500', '51984815631', 'graca.dori@gmail.com', '94233381000', '153052508', '5'),
 ('38', 'Ananda Klein', '1986/03/25', 'Rua G 540', '51985425782', 'nanda.k@gmail.com', '32058024036', '502666882', '8'),
 ('39', 'Larissa Passos', '2010/09/11', 'Rua Santa Cecília 197', '51981551423', 'larissa.passos@marista.com', '24520753023', '225850448', '8'),
 ('40', 'Thiago de Matos', '2010/03/28', 'Rua Sepé Tiaraju 534', '51998879861', 'martadmatos@outlook.com', '60878334041', '440748793', '8');
 
  insert into consulta values
 ('41', '2015/01/05', '08:30', '250', '40', '8', '16'),
 ('42', '2015/01/07', '17:00', '250', '27', '4', '25'),
 ('43', '2015/01/07', '14:00', '250', '26', '8', '20'),
 ('44', '2015/01/07', '7:00', '150', '40', '8', '16'),
 ('45', '2015/01/10', '10:00', '250', '28', '5', '18'),
 ('46', '2015/02/10', '15:00', '250', '40', '8', '16'),
 ('47', '2015/03/16', '16:30', '250', '27', '4', '25'),
 ('48', '2015/04/02', '10:00', '250', '26', '8', '20'),
 ('49', '2016/05/18', '20:00', '250', '34', '6', '22'),
 ('50', '2016/12/16', '13:45', '250', '32', '4', '21'),
 ('51', '2016/09/03', '14:20', '250', '33', '5', '22'),
 ('52', '2016/07/22', '22:00', '250', '28', '5', '17'),
 ('53', '2017/03/31', '11:00', '250', '35', '7', '24'),
 ('54', '2017/04/17', '12:45', '250', '36', '7', '25'),
 ('55', '2018/10/30', '16:40', '250', '37', '5', '16'),
 ('56', '2018/11/28', '17:00', '250', '38', '8', '19'),
 ('57', '2020/01/09', '18:30', '150', '39', '8', '21'),
 ('58', '2020/03/04', '19:00', '150', '30', '7', '23'),
 ('59', '2020/06/10', '09:45','150', '31', '8', '23'),
 ('60', '2020/10/06', '10:00', '150', '29', '6', '17');
 
 insert into RECEITUARIO values
 ('61', 'amoxicilina, benaleti', '5mg, 1 pastilha', 'Administar de 8 em 8 horas. Retornar em 15 dias ou antes se houver piora.,Administrar a cada 8 horas.', '16', '41'),
 ('62', 'aldactone, gel de limpeza profuse', '25mg, 1 bombeada', 'Administrar 1 comprimido 1x/dia., Lavar o rosto 2x/dia', '25', '42'),
 ('63', 'internação', '1', 'Paciente com dores fortíssimas no abdômen, possível remissão de câncer de estômago. Apresenta febre alta.', '20', '43'),
 ('64', 'sulfato de morfina, dipirona', '1gm/mL, 1g', 'Administrar via intravenosa a cada 10 minutos.,Administrar a cada 6 horas.', '20', '43'),
 ('65', 'internação', '1', 'Paciente com amigdalite não responde ao tratamento com amoxicilina', '16', '44'),
 ('66', 'exame microbiológico', '1', '-', '16', '44'),
 ('67', 'sal de frutas, floratil', '1 pastilha, 1 sachê', 'Administrar 30 minutos antes das refeições por 5 dias. Após a interrupção observar se a queimação retorna, Administrar dose única.', '18', '45'),
 ('68', 'internação', '1', 'Paciente com amigdalite crônica, encaminhamento para cirurgia (remoção)', '16', '46'),
 ('69', 'aldactone, ácido glicólico', '50mg, -', 'Administar 1 comprimido 1x/dia., Aplicar no rosto à noite. Lavar para retirar o produto pela manhã. Fazer uso de protetor solar.', '25', '47'),
 ('70', 'internação', '1', 'Paciente remissivo de câncer de estômago sob cuidados paliativos domiciliares apresenta piora.', '20', '48'),
 ('71', 'quimioterapia, paracetamol', '-, 1 comprimido', 'Realizar quimio a cada 3 meses. Marcar na recepção.,Administrar o paracetamol quando houver dor, no máximo 3x ao dia', '22','49'),
 ('72', 'diclofenaco de sódio, salompas', 'spray,11 adesivo', 'Aplicar no músculo 3x/dia.,Aplicar no local dolorido antes de dormir por 5 dias', '21', '50'),
 ('73', 'radioterapia, paracetamol', '-, 1 comprimido', 'Realizar rádio a cada 3 meses. Marcar na recepção.,Administrar o paracetamol quando houver dor, no máximo 3x ao dia', '22','51'),
 ('74', 'sal de frutas, magnésia bisurada', '1 pastilha, 1 pastilha', 'Administrar 30 minutos antes das refeições por 5 dias., Administrar quando houver queimação leve.', '17', '52'),
 ('75', 'sal de frutas, floratil', '1 pastilha, 1 sachê', 'Administrar 30 minutos antes das refeições por 5 dias. Após a interrupção observar se a queimação retorna, Administrar dose única.', '24', '53'),
 ('76', 'internação', '-', 'paciente apresenta queimaduras de 3 grau nos braços e tronco', '25', '54'),
 ('77', 'internação', '-', 'paciente apresenta pneumonia aguda e dificuldade para respirar', '16', '55'),
 ('78', 'internação', '-', 'paciente apresenta dificuldade respiratória', '19', '56');
 
 insert into ENFERMEIRO values
 ('79', 'Bárbara da Mota', '90146838041', '887478370RS'),
 ('80', 'Luan Pinto', '61400135001', '515482570RS'),
 ('81', 'Caleb Pires', '84607282006', '534308360RS'),
 ('82', 'Ryan Brito', '54538925012', '875078290RS'),
 ('83', 'Nina Campos', '53187332048', '301731410RS'),
 ('84', 'Louise Souza', '65935117061', '986887340RS'),
 ('85', 'Melissa Castro', '16827943003', '826798050RS'),
 ('86', 'Isac da Rocha', '40534436013', '381938810RS'),
 ('87', 'Breno Galvão', '38089114091', '631254420RS'),
 ('88', 'Patrícia Lopes', '08456841080', '239326350RS');
 
 insert into quarto values
 ('89', '101', '3'),
 ('90', '201', '2'),
 ('91', '301', '1');
 
 insert into INTERNACAO values
 ('92', '2015/01/07', '2015/01/14', '2015/01/12', 'Paciente foi medicado para o controle da febre e dor. Após laudo de exame microbiológico recebeu antibiótico de alto espectro.', '89', '16', '40', '79', '80'),
 ('93', '2015/01/10', '2015/01/25', '2015/01/22', 'Paciente medicado para dor, remissão de câncer de estômago confirmada após investigações. O paciente recebeu alta para cuidados paliativos residenciais', '90', '20', '28', '80', '81'),
 ('94', '2015/02/10', '2015/02/20', '2015/02/18', 'Paciente com amigdalite crônica foi internado para remoção das amigdalas.', '90', '16', '40', '81', '82'),
 ('95', '2015/04/02', '2015/04/30', '2015/04/10', 'Paciente veio a óbito no dia 10/04/2015.', '90', '20', '26', '82', '83'),
 ('96', '2017/04/17', '2017/04/30', '2015/05/05', 'Paciente recebeu tratamento para as queimaduras, precisou ficar mais tempo internado por conta de uma infecção na pele', '91', '25', '36', '83', '84'),
 ('97', '2018/10/30', '2018/11/15', '2018/11/20', 'Paciente teve piora aguda no quadro de dificuldade respiratória.', '89', '16', '37', '85', '86'),
 ('98', '2018/11/28', '2018/12/20', '2018/12/18', 'Paciente reagiu bem ao tratamento com oxixenio e antibióticos e recebeu alta antes do previsto.', '90', '19', '38', '87', '88');

