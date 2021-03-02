--liquibase formatted sql
--changeset init:1
alter table post_comments add constraint fk_post_comments_parent_id foreign key (parent_id) references post_comments (id);
alter table post_comments add constraint fk_post_comments_post_id foreign key (post_id) references posts (id);
alter table post_comments add constraint fk_post_comments_user_id foreign key (user_id) references users (id);
alter table post_votes add constraint fk_post_votes_post_id foreign key (post_id) references posts (id);
alter table post_votes add constraint fk_post_votes_user_id foreign key (user_id) references users (id);
alter table posts add constraint fk_posts_user_id foreign key (user_id) references users (id);
alter table posts add constraint fk_posts_moderator_id foreign key (moderator_id) references users (id);
alter table tag2post add constraint fk_tag2post_post_id foreign key (post_id) references posts (id);
alter table tag2post add constraint fk_tag2post_tag_id foreign key (tag_id) references tags (id);