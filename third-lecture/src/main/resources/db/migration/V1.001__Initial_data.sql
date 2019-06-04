CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    birthday DATE NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE
);

INSERT INTO users (first_name, last_name, birthday)
VALUES ('Robert', 'Koch', '1889-02-01'),
    ('Max', 'Planck', '1900-10-04'),
    ('Albert', 'Einstein', '1882-03-15'),
    ('Thomas', 'Mann', '1900-06-26');
