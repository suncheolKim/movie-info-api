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
