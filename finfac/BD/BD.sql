CREATE TABLE tbeventos (
    id_evento INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    dataevento DATE NOT NULL,
    horario TIME NOT NULL,
    localevento VARCHAR(255) NOT NULL,
    validado BOOLEAN DEFAULT FALSE,
    categoria VARCHAR(100) NOT NULL
);
CREATE TABLE tbgastosevento (
    idgasto INT PRIMARY KEY AUTO_INCREMENT,
    datagasto DATE NOT NULL,
    horagasto TIME NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    descricao TEXT NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    meiopagamento VARCHAR(50) NOT NULL,
    observacoes TEXT,
    id_evento INT NOT NULL,
    FOREIGN KEY (id_evento) REFERENCES tbeventos(id_evento)
);
ALTER TABLE tbgastosevento ADD COLUMN situacao VARCHAR(50) NOT NULL;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    datanascimento DATE NOT NULL,
    parentesco VARCHAR(50),
    cpf VARCHAR(14) UNIQUE NOT NULL,
    fone VARCHAR(20),
    login VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    perfil ENUM('admin', 'usuario', 'convidado') NOT NULL
);
CREATE TABLE tbreceitasevento (
    idreceita INT PRIMARY KEY AUTO_INCREMENT,
    datareceita DATE NOT NULL,
    horario TIME NOT NULL,usuarios
    categoria VARCHAR(50) NOT NULL,
    descricao TEXT NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    meiopagamento VARCHAR(50) NOT NULL,
    observacoes TEXT,
    id_evento INT NOT NULL,
    situacao VARCHAR(50) NOT NULL,  -- Campo de situação da receita
    FOREIGN KEY (id_evento) REFERENCES tbeventos(id_evento)
);
