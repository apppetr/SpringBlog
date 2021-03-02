--liquibase formatted sql
--changeset add_tags:5
insert into tags
(id, name)
values(1, "PHP");

insert into tags
(id, name)
values(2, "Java");

insert into tags
(id, name)
values(3, "Java Spring");

insert into tags
(id, name)
values(4, "Python");

insert into tags
(id, name)
values(5, "Python ML");
