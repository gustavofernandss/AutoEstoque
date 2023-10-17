-- Criando a trigger
CREATE OR REPLACE FUNCTION atualizar_faturamento()
RETURNS TRIGGER AS
$$
BEGIN
    -- Atualiza o faturamento do operador ao inserir uma nova venda
    UPDATE Operador
    SET Faturamento = Faturamento + NEW.valor
    WHERE CPF = NEW.CPF;
    RETURN NEW;
END;
$$
LANGUAGE plpgsql;

-- Associa a trigger à tabela "vendas"
CREATE TRIGGER atualizar_faturamento_trigger
AFTER INSERT ON vendas
FOR EACH ROW
EXECUTE FUNCTION atualizar_faturamento();
