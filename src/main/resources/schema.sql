CREATE TABLE IF NOT EXISTS movie_info (
    id bigint auto_increment primary key,
    title VARCHAR(255) NOT NULL,
    original_title VARCHAR(255) NOT NULL,
    year int(4) NOT NULL,
    country VARCHAR(50) NOT NULL,
    age_ratings VARCHAR(20) NOT NULL,
    genre VARCHAR(50) NOT NULL,
    runtime int(3) NOT NULL,
    release_date DATE,
    director VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    actors VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
      id bigint auto_increment primary key,
      name VARCHAR(255) NOT NULL,
      password VARCHAR(255) NOT NULL,
      roles VARCHAR(255)
);

DROP TABLE IF EXISTS `users`;
create table users
(
    id       bigint auto_increment primary key,
    email    varchar(255)           not null,
    password varchar(255)           not null,
    role     enum ('ADMIN', 'USER') not null,
    username varchar(255)           not null,
    constraint UK6dotkott2kjsp8vw4d0m25fb7
        unique (email),
    constraint UKr43af9ap4edm43mmtq01oddj6
        unique (username)
);
