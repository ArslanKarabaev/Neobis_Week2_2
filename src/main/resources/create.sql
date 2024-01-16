CREATE TABLE Users
(
    user_id    BIGINT PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY (INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1),
    firstName  VARCHAR(64)        NOT NULL,
    secondName VARCHAR(64)        NOT NULL,
    age        INT                NOT NULL,
    email      VARCHAR(128)       NOT NULL,
    mobNum     VARCHAR(64)        NOT NULL,
    password   VARCHAR(128)       NOT NULL
);

CREATE TABLE Coffee(
    coffee_id BIGINT NOT NULL UNIQUE GENERATED ALWAYS AS IDENTITY (INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1),
    coffee_name VARCHAR(64) NOT NULL,
    amount INT NOT NULL,
    price INT NOT NULL
);

INSERT INTO coffee(coffee_name, amount, price) VALUES('Latte',250,220);
INSERT INTO coffee(coffee_name, amount, price) VALUES('Cappuccino',180,200);
INSERT INTO coffee(coffee_name, amount, price) VALUES('Mocha',220,280);
INSERT INTO coffee(coffee_name, amount, price) VALUES('Americano',180,160);

INSERT INTO users(firstname, secondname, age, email, mobnum, password)
VALUES('Arslan','Karabaev',20,'karabaevarslan8@gmail.com','0552020803','123');
INSERT INTO users(firstname, secondname, age, email, mobnum, password)
VALUES('Aktilek','Kamilov',20,'kamilovaktilek@gmail.com','0123456789','456');
INSERT INTO users(firstname, secondname, age, email, mobnum, password)
VALUES('Rustam','Kasymov',21,'kasymovrustam@gmail.com','0123456789','789');


