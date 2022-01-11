DROP DATABASE IF EXISTS beersinventoryervice;
DROP USER IF EXISTS `beer_inventory_service`@`%`;
CREATE DATABASE IF NOT EXISTS beerinventoryservice CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `beer_inventory_service`@`%` IDENTIFIED WITH authentication_plugin BY 'Todoroki@162';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
    CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `beerinventoryservice`.* TO `beer_inventory_service`@`%`
    IDENTIFIED BY 'Todoroki@162' WITH GRANT OPTION;
FLUSH PRIVILEGES;
