DROP TABLE IF EXISTS pedidos;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS users;

create table users (
    name varchar(255) not null, 
    email varchar(255) not null,
    primary key (name)
);


create table products (
    name varchar(255) not null, 
    price DOUBLE not null,
    primary key (name)
);


create table pedidos (
    ord_id bigint generated by default as identity, 
    ord_user varchar(255), 
    ord_product varchar(255), 
    primary key (ord_id)
);

alter table pedidos 
    add constraint users 
    foreign key (ord_user) references users (name);

insert into 
    users (name, email) 
    values 
        ('John Doe', 'john.doe@example.com'),
        ('Pepe', 'pepe1@example.com'),
        ('Rosa', 'rosa1@example.com');

UPDATE users
SET email = 'rosita@example.com'
WHERE name = 'Rosa';     

DELETE FROM users 
WHERE name = 'John Doe';

 insert into
    pedidos (ord_user, ord_product)
    values 
        ('Pepe', 'Arroz'),
        ('Pepe', 'Sal');   







      


