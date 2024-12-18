-- Tabela Perfil
create table Perfil (
    id_perf integer,
    nome_perf varchar(30),
    email varchar(30),
    senha varchar(10) not null,
    Primary Key (id_perf)
);

-- Tabela Tag
create table Tag (
    id_tag integer Primary Key,
    nome_tag varchar(8)
);

-- Tabela Evento
create table Evento (
    id_event integer Primary Key,
    id_tag integer,
    nome_event varchar(20) not null,
    data Date not null,
    preco decimal(10,2),
    Foreign Key (id_tag) references Tag(id_tag)
);

-- Tabela perfil_evento (Associação entre Perfil e Evento)
create table perfil_evento (
    id_event integer,
    id_perf integer,
    Primary Key (id_event, id_perf),
    Foreign Key (id_event) references Evento(id_event),
    Foreign Key (id_perf) references Perfil(id_perf)
);

-- Tabela Cidade
create table Cidade (
    id_cid integer,
    nome_cid varchar(20),
    estado varchar(2),
    Primary Key (id_cid)
);

-- Tabela cidade_evento (Associação entre Cidade e Evento)
create table cidade_evento (
    id_cid integer,
    id_event integer,
    Primary Key (id_cid, id_event),
    Foreign Key (id_cid) references Cidade(id_cid),
    Foreign Key (id_event) references Evento(id_event)
);

-- Tabela Categoria
create table Categoria (
    id_cat integer Primary Key,
    nome_cat varchar(10)
);

-- Tabela tag_categoria (Associação entre Tag e Categoria)
create table tag_categoria (
    id_tag integer,
    id_cat integer,
    Primary Key (id_tag, id_cat),
    Foreign Key (id_tag) references Tag(id_tag),
    Foreign Key (id_cat) references Categoria(id_cat)
);
