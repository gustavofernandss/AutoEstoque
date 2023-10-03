CREATE TABLE Usuarios (
	CPF varchar(11) primary key,
	Nome varchar(70),
	Senha varchar(30)
);

CREATE TABLE Vendas (
	Id_Venda serial primary key,
	Valor int,
	Data_Venda date DEFAULT CURRENT_DATE,
	Hora_Venda time DEFAULT CURRENT_TIME,
	CPF_Usuario varchar(11) REFERENCES Usuarios(CPF)
);

CREATE TABLE Tipo (
	Id_Tipo smallserial primary key,
	Nome varchar(20),
	FormaVenda varchar(100)
);

CREATE TABLE Produtos (
	Cod_Barras varchar(12) primary key,
	Nome varchar(50),
	Marca varchar(50),
	Categoria varchar(20),
	Id_Tipo smallint REFERENCES Tipo(Id_Tipo),
	Preco int,
	Estoque int
);

CREATE TABLE Produtos_Vendas (
	Cod_Barras varchar(12) REFERENCES Produtos(Cod_Barras)
	ON UPDATE CASCADE,
	CPF_Usuario varchar(11) REFERENCES Usuarios(CPF),
	Quantidade int,
	primary key (Cod_Barras, CPF_Usuario)
)