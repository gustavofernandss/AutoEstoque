ALTER TABLE produtos ADD CHECK(preco > 0);

ALTER TABLE produtos_vendas ADD CHECK (quantidade > 0);