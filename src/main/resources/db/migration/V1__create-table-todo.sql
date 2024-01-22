CREATE TABLE todo(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL,
    description TEXT,
    done BOOLEAN,
    priority INTEGER
);