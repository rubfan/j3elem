/* Создание таблиц */

create table Address ( 
 Id int not null auto_increment,
 Country text not null,
 City text not null,
 PostIndex int unsigned not null,
 Price double not null,
 IdOwner int,
 Primary key (Id),
 Foreign key (IdOwner) references People(Id)
);

create table People ( 
 Id int not null auto_increment,
 Age int not null,
 FirstName text not null,
 LastName text not null,
 Salary double,
 Address int,		
 Primary key (Id),
 Foreign key (Address) references Address(Id)
);

create table PeopleAddress (
Id int not null auto_increment,
IdUser int not null,
Address int not null,
Primary key (Id),
Foreign key (IdUser) references People(Id),
Foreign key (Address) references Address(Id)
);

/* Заполнение таблицы Address*/

insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Ukraine','Odessa',12345,600.00,1);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Ukraine','Kiev',12347,500.00,2);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Ukraine','Kiev',12348,900.00,3);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','New-York',12348,3200.00,4);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','Los Angeles',12349,2200.00,5);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','Miami',12310,10200.00,6);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Germany','Berlin',12311,8200.00,7);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Great Britain','London',12312,3200.00,8);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Italy','Rome',12314,7200.00,9);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Italy','Rome',12315,8200.00,10);

/* Заполнение таблицы People*/

insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Иван','Сидоров',12000.00,1);
insert into People(Age, FirstName, LastName, Salary, Address)
values (40,'Елена','Петрова',50000.00,2);
insert into People(Age, FirstName, LastName, Salary, Address)
values (25,'Артур','Виноградов',19000.00,3);
insert into People(Age, FirstName, LastName, Salary, Address)
values (60,'Владимир','Вишневский',10000.00,4);
insert into People(Age, FirstName, LastName, Salary, Address)
values (32,'Роман','Сидоренко',15000.00,5);
insert into People(Age, FirstName, LastName, Salary, Address)
values (27,'Ольга','Никулина',18000.00,6);
insert into People(Age, FirstName, LastName, Salary, Address)
values (54,'Никита','Карапетян',16500.00,7);
insert into People(Age, FirstName, LastName, Salary, Address)
values (38,'Андрей','Иванов',23000.00,8);
insert into People(Age, FirstName, LastName, Salary, Address)
values (36,'Марина','Нестерова',42000.00,9);
insert into People(Age, FirstName, LastName, Salary, Address)
values (76,'Павел','Дрозд',55000.00,10);

/* Добавление людей без квартир*/

insert into People(Age, FirstName, LastName, Salary)
values (25,'Павел','Кучерявый',500.00);
insert into People(Age, FirstName, LastName, Salary)
values (20,'Иван','Виноградов',10000.00);
insert into People(Age, FirstName, LastName, Salary)
values (27,'Вольдемар','Некрасов',25000.00);
insert into People(Age, FirstName, LastName, Salary)
values (30,'Сергей','Блок',8000.50);
insert into People(Age, FirstName, LastName, Salary)
values (35,'Генадий','Федоренко',12000.00);

/* Добавление квартир не имеющих владельцев */

insert into Address(Country, City, PostIndex, Price)
values ('Greece','Athens',78543,8000.00);
insert into Address(Country, City, PostIndex, Price)
values ('France','Paris',78544,14200.00);
insert into Address(Country, City, PostIndex, Price)
values ('Turkey','Stambul',78545,5200.00);
insert into Address(Country, City, PostIndex, Price)
values ('Mexico','Mexico',78546,10000.00);
insert into Address(Country, City, PostIndex, Price)
values ('Australia','Singapour',78547,128200.00);


/* Запрос на вывод информации о человеке и квартире если имеется*/
/*Нет квартиры*/
select * from
(select a.FirstName, a.LastName, a.Age, a.Salary, b.Country, b.City, b.PostIndex, b.Price
from People a
left outer join Address b
on a.Address = b.id) as t
where t.FirstName = 'Иван' and t.LastName = 'Виноградов';

/*Есть квартира*/
select * from
(select a.FirstName, a.LastName, a.Age, a.Salary, b.Country, b.City, b.PostIndex, b.Price
from People a
left outer join Address b
on a.Address = b.id) as t
where t.FirstName = 'Роман' and t.LastName = 'Сидоренко';


/* Запрос на вывод информации о квартире и собственнике если имеется*/
/*Нет собственника*/
select * from
(select a.Country, a.City, a.PostIndex, a.Price, b.FirstName, b.LastName, b.Age, b.Salary
from Address a
left outer join People b
on a.IdOwner = b.id) as t
where t.PostIndex = 78545;

/*Есть собственник*/
select * from
(select a.Country, a.City, a.PostIndex, a.Price, b.FirstName, b.LastName, b.Age, b.Salary
from Address a
left outer join People b
on a.IdOwner = b.id) as t
where t.PostIndex = 12310;



/*Запрос возвращающий список людей у которых есть квартира*/

select FirstName, LastName
from People 
where Address is not NULL;

/*Запрос возвращающий список людей у которых нет квартиры*/

select FirstName, LastName
from People 
where Address is NULL;

/*Запрос возвращающий список не проданых квартир*/

select Country, City, PostIndex, Price
from Address 
where IdOwner is NULL;

/*Запрос возвращающий количество не проданых квартир*/

select count(id)
from Address 
where IdOwner is NULL;

/*Запрос возвращающий количество людей без квартир*/

select count(id)
from People 
where Address is NULL;

/*Список людей живущих в Одном городе*/

select a.City, b.FirstName, b.LastName
from Address a
inner join People b
on a.IdOwner = b.id
group by a.City, b.FirstName,b.LastName ASC;

/*Квартиры которые не проданы с ценами от 30 тысяч до 200 тысяч*/

select Country, City, PostIndex, Price
from Address
where Price > 30000 and Price < 200000 and IdOwner is null;

/*Список всех пользоватей которые способны оплатить квартиру*/

select FirstName, LastName, Salary
from People
where Salary * 120 >= ( select price from Address where id = 15);

/*Список всех квартир, которые может оплатить человек*/

select Country, City, PostIndex, Price
from Address
where Price < (select Salary from People where id = 12) * 120 and IdOwner is null;


/* Добавление Васи у которого 3 квартиры*/

insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Василий','Петров',12000,16);
insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Василий','Петров',12000,17);
insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Василий','Петров',12000,18);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','Los Angeles',12354,2200.00,16);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','Miami',123143,10200.00,17);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Germany','Berlin',1231341,8200.00,18);

/*Добавление жены Васи у которой теже 3 квартиры*/

insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Оксана','Петрова',10000,19);
insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Оксана','Петрова',10000,20);
insert into People(Age, FirstName, LastName, Salary, Address)
values (35,'Оксана','Петрова',10000,21);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','Los Angeles',12354,2200.00,19);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('USA','Miami',123143,10200.00,20);
insert into Address(Country, City, PostIndex, Price, IdOwner)
values ('Germany','Berlin',1231341,8200.00,21);

/*Заполнение таблицы PeopleAddress и модификация таблиц People и Address*/

insert into PeopleAddress( IdUser, Address)
select IdOwner,Id from Address where IdOwner is not null and Id < 16;
delete from Address where id > 15;
delete from People where id > 15;

alter table Address 
drop column IdOwner;

alter table People 
drop column Address;

/*Добавление Васи и его жены с 3 общими квартирами*/

insert into People(Age, FirstName, LastName, Salary)
values (35,'Василий','Петров',12000);
insert into People(Age, FirstName, LastName, Salary)
values (35,'Оксана','Петрова',10000);

insert into Address(Country, City, PostIndex, Price)
values ('USA','Los Angeles',12354,2200.00);
insert into Address(Country, City, PostIndex, Price)
values ('USA','Miami',123143,10200.00);
insert into Address(Country, City, PostIndex, Price)
values ('Germany','Berlin',1231341,8200.00);

insert into PeopleAddress(IdUser, Address)
values (22,22);
insert into PeopleAddress(IdUser, Address)
values (22,23);
insert into PeopleAddress(IdUser, Address)
values (22,24);
insert into PeopleAddress(IdUser, Address)
values (23,22);
insert into PeopleAddress(IdUser, Address)
values (23,23);
insert into PeopleAddress(IdUser, Address)
values (23,24);

/*Добавление Васе и его жене по личной квартире*/

insert into Address(Country, City, PostIndex, Price)
values ('Ukraine','Dnepr',1534231341,148200.00);
insert into Address(Country, City, PostIndex, Price)
values ('Ukraine','Dnepr',123134341,108200.00);
insert into PeopleAddress(IdUser, Address)
values (22,25);
insert into PeopleAddress(IdUser, Address)
values (23,26);

/*Добавление пользователей с несколькими квартирами*/

insert into PeopleAddress(IdUser, Address)
values (1,3);
insert into PeopleAddress(IdUser, Address)
values (2,5);
insert into PeopleAddress(IdUser, Address)
values (2,7);
insert into PeopleAddress(IdUser, Address)
values (2,11);
insert into PeopleAddress(IdUser, Address)
values (3,2);
insert into PeopleAddress(IdUser, Address)
values (4,8);
insert into PeopleAddress(IdUser, Address)
values (5,9);
insert into PeopleAddress(IdUser, Address)
values (11,14);
insert into PeopleAddress(IdUser, Address)
values (12,1);
insert into PeopleAddress(IdUser, Address)
values (12,5);
insert into PeopleAddress(IdUser, Address)
values (11,8);

/*Список пользователей у которых больше 1 квартиры*/

select a.FirstName, a.LastName, t.count from
(select count(id) as count , IdUser  from PeopleAddress group by IdUser) as t
inner join People a
on a.id = t.IdUser and t.count > 1;

/*Список пользователей у которых больше 1 квартиры, но нет собственной*/

select distinct a.FirstName, a.LastName from People a 
inner join 
(select t.IdUser from (select Address, IdUser, count(id)  as count  from PeopleAddress group by Address) as t where t.count = 1) as b
on a.id = b.IdUser;

/*Список городов  в которых владельцы имеют больше  1 квартиры*/

select t.City, t.count from
(select a.City,count(a.City) as count from Address a 
inner join PeopleAddress b 
on a.id = b.Address group by a.City ) as t
where t.count > 1;

/*Список пользователей у которых больше одной квартиры, но при условии что хотябы одна квартира в другом городе */

select a.FirstName, a.LastName from People a
inner join
 (select count(a.City) as count1,(select count(id) from PeopleAddress where IdUser = a.IdUser) as count2, a.IdUser from  
  (select a.IdUser,b.City from PeopleAddress a
  inner join Address b  
  on a.Address = b.Id  
  group by a.IduSer,b.City) as a  
 group by a.IdUser) as b
on a.id = b.IdUser and b.count1 > 1 and b.count2 > 1;
