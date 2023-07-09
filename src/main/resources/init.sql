create table account_202301
(
    id          bigint      not null primary key,
    name        varchar(32) not null default '',
    age         int         null,
    create_date datetime             default CURRENT_TIMESTAMP,
    update_date datetime             default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);

create table account_202307
(
    id          bigint      not null primary key,
    name        varchar(32) not null default '',
    age         int         null,
    create_date datetime             default CURRENT_TIMESTAMP,
    update_date datetime             default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
);