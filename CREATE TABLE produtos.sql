-- CRIAR TABELA

CREATE TABLE produtos (
    id_produto INTEGER PRIMARY KEY,
    nome TEXT NOT NULL,
    preco REAL NOT NULL,
    estoque INTEGER NOT NULL,
    perecivel INTEGER NOT NULL,
    marca TEXT,
    nacionalidade TEXT
);

-- POPULAR TABELA

INSERT INTO produtos (nome, preco, estoque, perecivel, marca, nacionalidade)VALUES
('feijao', 5.99, 20, 0, 'feijaozinho', 'Brasil'),
('arroz', 3.40, 50, 0, 'arrozinho', 'Brasil'),
('leite', 8.50, 35, 1, 'leitinho', 'Mexicano'),
('milho', 6.20, 10, 0, 'pipoquinha', 'Alemão'),
('queijo', 20.99, 8, 1, 'queijinho', 'Italiano');


-- SELECTS
SELECT COUNT (*) AS total_produtos FROM produtos;

SELECT AVG(preco) AS preco_medio FROM produtos;

SELECT perecivel, AVG(preco) AS preco_medio
FROM produtos
GROUP BY perecivel;

SELECT nome, AVG(preco) AS preco_medio
FROM produtos
GROUP BY nome;

SELECT AVG(preco) AS preco_medio, SUM(estoque) AS total_estoque
FROM produtos;

SELECT p.nome, p.marca, p.estoque
FROM produtos p
INNER JOIN (
    SELECT MAX(preco) AS max_preco
    FROM produtos
) max_price ON p.preco = max_price.max_preco;

SELECT *
FROM produtos
WHERE preco > (SELECT AVG(preco) FROM produtos);

SELECT nacionalidade, COUNT(*) AS quantidade
FROM produtos
GROUP BY nacionalidade;
