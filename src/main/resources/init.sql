create table account_0
(
    id   bigint      not null primary key,
    name varchar(32) not null default '',
    age  int         null
);

create table account_1
(
    id   bigint      not null primary key,
    name varchar(32) not null default '',
    age  int         null
);


insert into account_0
values (1, 'asia', 20);
insert into account_0
values (2, 'xiu', 20);
insert into account_1
values (3, 'bingo', 30);