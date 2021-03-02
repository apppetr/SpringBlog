--liquibase formatted sql
--changeset post_index:8
create index active_post_idx on posts (moderation_status, is_active, time);
