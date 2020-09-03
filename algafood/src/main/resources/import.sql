insert into cozinha (id, nome) values (1, 'Cozinha Tipo 1');
insert into cozinha (id, nome) values (2, 'Cozinha Tipo 2');
insert into cozinha (id, nome) values (3, 'Cozinha Tipo 3');
insert into cozinha (id, nome) values (4, 'Cozinha Tipo 4');
insert into cozinha (id, nome) values (5, 'Cozinha Tipo 5');

insert into restaurante (id, nome,taxa_frete, cozinha_id) values (1,'Americano', 1, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (2,'Brasileiro', 15, 5);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (3,'Canadense', 100, 3);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (4,'Argélio', 50, 2);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (5,'Marroquense', 10, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (6,'Búlgaro', 20, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (7,'Paquistanense', 10, 3);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (8,'Mexicano', 7, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (9,'Peruano', 75, 4);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (10,'Nigeriano', 25, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (11,'Australiano', 30, 3);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (12,'Europeu', 12, 4);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (13,'Asiático', 3, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (14,'Russo', 80, 5);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (15,'Irlandense', 99, 1);
insert into restaurante (id, nome,taxa_frete, cozinha_id) values (16,'Boliviano', 60, 2);


insert into estado (id, nome) values (1,'Goiás');

insert into cidade (id, nome, estado_id) values (1,'Campos Belos', 1);

insert into forma_pagamento(id, descricao) values (1, 'Boleto');

insert into permissao (id, nome, descricao) values (1,'Consultar Produtos', 'Aqui o usuário tem permissão para consultar produtos');