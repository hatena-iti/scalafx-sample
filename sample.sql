DROP TABLE IF EXISTS TABLE1;
CREATE TABLE table1(
  name string primary key,
  age integer
);

insert into table1(name, age) values ('name1', 20);
insert into table1(name, age) values ('name2', 20);
insert into table1(name, age) values ('name3', 20);
insert into table1(name, age) values ('name4', 20);
insert into table1(name, age) values ('name5', 20);

DROP TABLE IF EXISTS TABLE2;
CREATE TABLE TABLE2(
  id integer primary key autoincrement,
  name string,
  age integer
);
insert into table2(name, age) values ('name1', 20);
insert into table2(name, age) values ('name2', 21);
insert into table2(name, age) values ('name3', 22);
insert into table2(name, age) values ('name4', 23);
insert into table2(name, age) values ('name5', 24);
