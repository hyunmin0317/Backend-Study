insert into member (id, name, password, email, create_date, modify_date) values ( 1, '강경미', '$2a$10$G/ADAGLU3vKBd62E6GbrgetQpEKu2ukKgiDR5TWHYwrem0cSv6Z8m', 'carami@example.com', now(), now());
insert into member (id, name, password, email, create_date, modify_date) values ( 2, '이정주', '$2a$10$G/ADAGLU3vKBd62E6GbrgetQpEKu2ukKgiDR5TWHYwrem0cSv6Z8m', 'toto@example.com', now(), now());

insert into member_role (id, member_id, role_name) values (1, 1, 'ROLE_USER');
insert into member_role (id, member_id, role_name) values (2, 1, 'ROLE_ADMIN');
insert into member_role (id, member_id, role_name) values (3, 2, 'ROLE_USER');