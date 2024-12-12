# PingMe Messaging System
![Java](https://img.shields.io/badge/language-Java%2022-blue)
![License](https://img.shields.io/badge/license-Apache%202.0-red)
![Platform](https://img.shields.io/badge/platform-Mac%20OS%20X-brightgreen)
![Framework](https://img.shields.io/badge/framework-Spring%20Framework-brightgreen)
![REST](https://img.shields.io/badge/architecture-REST-purple)
![Postman](https://img.shields.io/badge/tool-Postman-orange)
![Database](https://img.shields.io/badge/database-H2%20Database-blue)
![Build](https://img.shields.io/badge/build-Gradle-23B5D3)
![Static Analysis](https://img.shields.io/badge/static_analysis-SpotBugs-red)

# PingMe
The project focuses on having a user interface for chatting system PingMe

# PingMe Service # 

`#JAVA` `#SPRING`

- [Aniruddha Shivananda](mailto:aniruddhams2023@gmail.com)
- [Surya Sukumar](mailto:Suryasukumar0911@gmail.com)

This project provides the backend service necessary for the PingMe API.

# Java Version

Default Java Version -  **22**.

# API Documentation

This document provides an overview of the available API endpoints, including their HTTP methods, status codes, and descriptions.

## REST Endpoints

### Authentication Endpoints

| HTTP Method | API Endpoint           | Response Status | Description                                         |
|:------------|:-----------------------|:----------------|:----------------------------------------------------|
| `POST`      | `/auth/register`       | 201 (CREATED)   | Registers a new user in the system.Return JWT token |
| `POST`      | `/pingme/login`        | 201 (CREATED)   | Authenticates and logs in a user.                   |

### Chat Endpoints

| HTTP Method | API Endpoint           | Response Status | Description                                         |
|:------------|:-----------------------|:----------------|:----------------------------------------------------|
| `POST`      | `/pingme/chats/logout` | 200 (OK)        | Logs out the user, Need to pass Bearer token.       |
| `GET`       | `/pingme/chats/single` | 201 (OK)        | Creates a single chat between two users.       |
| `DELETE`    | `/pingme/chats/delete/{chatId}`          | 200 (OK)        | Deletes the specified chat by `chatId`.              |
| `POST`      | `/pingme/chats/group`                    | 201 (Created)   | Creates a group chat with a list of users.           |
| `GET`       | `/pingme/chats/{chatId}`                 | 200 (OK)        | Retrieves a chat by `chatId`.                        |
| `GET`       | `/pingme/chats/user`                     | 200 (OK)        | Retrieves all chats for the authenticated user.      |
| `PUT`       | `/pingme/chats/{chatId}/add/{userId}`    | 200 (OK)        | Adds a user to a group chat.                         |
| `PUT`       | `/pingme/chats/{chatId}/remove/{userId}` | 200 (OK)        | Removes a user from a group chat.                    |
| `GET`       | `/pingme/chats/users`                    | 200 (OK)        | Retrieves all users in the system.                   |

### Message Endpoints

| HTTP Method | API Endpoint                             | Response Status  | Description                                          |
|:------------|:-----------------------------------------|:-----------------|:-----------------------------------------------------|
| `POST`      | `/pingme/messages/create`                | 200 (OK)         | Sends a message to a chat.                           |
| `GET`       | `/pingme/messages/{chatId}`              | 200 (OK)         | Retrieves all messages for a given chat.             |
| `DELETE`    | `/pingme/messages/{messageId}`           | 200 (OK)         | Deletes a message by `messageId`.                    |
                                                                                                                                                  |
## Who do I talk to? ###
- [Aniruddha Shivananda](mailto:aniruddhams2023@gmail.com)
- [Surya Sukumar](mailto:Suryasukumar0911@gmail.com)