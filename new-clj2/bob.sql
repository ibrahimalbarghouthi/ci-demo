CREATE ROLE bob_db WITH LOGIN PASSWORD '1234';
ALTER ROLE bob_db CREATEDB;
CREATE DATABASE cards_bob;

CREATE TABLE test_table (bob character varying(50) NOT NULL);

