insert into cozinha (id, nome) values (1, 'Americana');

insert into restaurante (id, nome,taxa_frete, cozinha_id) values (1,'Cozinha Americada', 10, 1);

insert into estado (id, nome) values (1,'Goiás');

insert into cidade (id, nome, estado_id) values (1,'Campos Belos', 1);

insert into forma_pagamento(id, descricao) values (1, 'Boleto');

insert into permissao (id, nome, descricao) values (1,'Consultar Produtos', 'Aqui o usuário tem permissão para consultar produtos');