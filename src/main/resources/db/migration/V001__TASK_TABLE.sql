CREATE TABLE tasks (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    title VARCHAR NOT NULL,
    description VARCHAR,
    status VARCHAR NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP
);