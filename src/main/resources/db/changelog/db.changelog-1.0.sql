--liquibase formatted sql

--changeset Vitali Labatsevich (vitaly.lobatsevich@gmail.com):create_courses_table context:default
CREATE TABLE courses (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    user_id TEXT NOT NULL
);
--rollback DROP TABLE courses;

--changeset Vitali Labatsevich (vitaly.lobatsevich@gmail.com):insert_test_courses context:test
INSERT INTO courses (name, user_id) VALUES
    ('Test Course 1', '5f5c6283-1898-4066-9fe6-10ef07ca6ccf'),
    ('Test Course 2', '5f5c6283-1898-4066-9fe6-10ef07ca6ccf'),
    ('Test Course 3', '5f5c6283-1898-4066-9fe6-10ef07ca6ccf');

--changeset Vitali Labatsevich (vitaly.lobatsevich@gmail.com):create_users_table context:default
CREATE TABLE users (
    id BIGSERIAL NOT
);