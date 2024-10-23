CREATE TABLE person (
                        id UUID PRIMARY KEY NOT NULL,
                        name VARCHAR(255) NOT NULL,
                        password VARCHAR(255) NOT NULL,
                        online BOOLEAN,
                        email VARCHAR(255) NOT NULL,
                        profile VARCHAR(255)
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
