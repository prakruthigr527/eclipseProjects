create table everyday
(
  id INT auto_increment PRIMARY KEY,
  date DATE not null,
  activity varchar(255) not null,
  duration int
);

insert into everyday(date, activity, duration) values(TO_DATE('04/26/2020', 'MM/DD/YYYY'),  'Play', 20);
insert into everyday(date, activity, duration) values(TO_DATE('04/26/2020', 'MM/DD/YYYY'),  'Eat', 30);
insert into everyday(date, activity, duration) values(TO_DATE('04/26/2020', 'MM/DD/YYYY'),  'Sleep', 20);
