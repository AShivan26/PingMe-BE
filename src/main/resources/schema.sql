create table person (id uuid not null, name varchar(255), password varchar(255), online boolean, primary key (id));
CREATE TYPE message_status AS ENUM ('SENDING', 'SENT');
CREATE TABLE conversation (id UUID NOT NULL,
                           fromId UUID,
                           toId UUID,
                           messages JSONB,,
                           createdAt TIMESTAMP,
                           lastModifiedAt TIMESTAMP,
                           messageStatus message_status,
                           FOREIGN KEY (fromId) REFERENCES person(id),
                           FOREIGN KEY (toId) REFERENCES person(id),
                           PRIMARY KEY (id));