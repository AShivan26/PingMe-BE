create table person (
                       id uuid not null,
                       name varchar(255),
                       password varchar(255),
                       online boolean, primary key (id)
);

-- Table for chats
CREATE TABLE chats (
                       id UUID PRIMARY KEY not null,
                       chat_name VARCHAR(255),
                       chat_image VARCHAR(255),
                       is_group BOOLEAN NOT NULL,
                       created_by_user_id UUID NOT NULL,
                       FOREIGN KEY (created_by_user_id) REFERENCES person(id) ON DELETE CASCADE
);

-- Table for linking chat users (Many-to-Many relationship between chats and users)
CREATE TABLE chat_users (
                            chat_id UUID NOT NULL,
                            user_id UUID NOT NULL,
                            PRIMARY KEY (chat_id, user_id),
                            FOREIGN KEY (chat_id) REFERENCES chats(id) ON DELETE CASCADE,
                            FOREIGN KEY (user_id) REFERENCES person(id) ON DELETE CASCADE
);

-- Table for linking chat admins (Many-to-Many relationship between chats and users)
CREATE TABLE chat_admins (
                             chat_id UUID NOT NULL,
                             user_id UUID NOT NULL,
                             PRIMARY KEY (chat_id, user_id),
                             FOREIGN KEY (chat_id) REFERENCES chats(id) ON DELETE CASCADE,
                             FOREIGN KEY (user_id) REFERENCES person(id) ON DELETE CASCADE
);

-- Table for messages
CREATE TABLE messages (
                          id UUID PRIMARY KEY not null,
                          content TEXT NOT NULL,
                          timestamp TIMESTAMP NOT NULL,
                          chat_id UUID NOT NULL,
                          user_id UUID NOT NULL,
                          FOREIGN KEY (chat_id) REFERENCES chats(id) ON DELETE CASCADE,
                          FOREIGN KEY (user_id) REFERENCES person(id) ON DELETE CASCADE
);
