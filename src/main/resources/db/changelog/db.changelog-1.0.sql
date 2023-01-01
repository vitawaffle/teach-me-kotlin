--liquibase formatted sql

--changeset Vitali Labatsevich (vitaly.lobatsevich@gmail.com):create_courses_table context:default
CREATE TABLE courses (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    name TEXT NOT NULL
);
--rollback DROP TABLE courses;

--changeset Vitali Labatsevich (vitaly.lobatsevich@gmail.com):insert_test_courses context:test
INSERT INTO courses (name) VALUES
    ('Test Course 1'),
    ('Test Course 2'),
    ('Test Course 3');
