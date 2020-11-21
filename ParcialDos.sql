create database Examen;
use Examen;

create table Motocicletas (
motocicletas_id int primary key not null auto_increment,
codigo_barras varchar(30) not null
);

insert into Motocicletas (codigo_barras) values 
(1),
(2),
(3);

create table Proveedor(
proveedor_id int primary key not null auto_increment,
nit varchar(30) not null,
nombre varchar(50) not null,
direccion varchar(50) not null
);

insert into Motocicletas_Proveedor (motocicletas_id, proveedor_id, nit, nombre, direccion) values 
("1", "123", "Motorama", "Mixco"),
("2", "456", "Heromotos", "Cayala"),
("3", "789", "Motofastgt", "Vista Hermosa");

create table Motocicletas_Proveedor(
motocicletas_id int not null,
proveedor_id int not null,
foreign key (motocicletas_id) references Motocicletas (motocicletas_id),
foreign key (proveedor_id) references Proveedor (proveedor_id)
);

create table Modelo(
modelo_id int primary key not null auto_increment,
decada varchar(40) not null,
modelo_inconveniente varchar(80) not null
);

insert into Modelo(modelo_id, decada, modelo_inconveniente) values 
(1, "noventas", "ninguno"),
(2, "dos_mil", "ninguno"),
(3, "dos_mil_diez", "ninguno")
;

create table Marca(
marca_id int primary key not null auto_increment,
nombre varchar(50) not null,
pais varchar(30) not null,
marca_inconveniente varchar(80) not null
);

insert into Marca(nombre, pais, marca_inconveniente) values 
("Honda", "Japon", "ninguno"),
("Suzuki", "Japon", "ninguno"),
("bmw", "alemania", "ninguno");