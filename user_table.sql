USE bsa;

DROP TABLE users;

CREATE TABLE users (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    email varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    url varchar(255) DEFAULT NULL,
    PRIMARY KEY (id),
    UNIQUE (email, username)
);

INSERT INTO users (email, username, password)
VALUES ('chuck@branch.com','chuckbranch','chuckbranch');
