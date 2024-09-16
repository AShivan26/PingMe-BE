insert into person values('50b35861-d3cd-40b2-8c3b-606b673e1e50','Jack','secret', false);
insert into person values('50b35861-d3cd-40b2-8c3b-606b673e1e51','Jason','secret', false);

INSERT INTO conversation (id, fromId, toId, messages, lastModified, messageStatus)
VALUES (
           'e23b75a6-4a07-4d5d-8c4e-d8bce67654f2',
           '50b35861-d3cd-40b2-8c3b-606b673e1e50',
           '50b35861-d3cd-40b2-8c3b-606b673e1e51',
           'Hello, how are you?',
           '2024-09-16 10:00:00',
           'SENT'
       );
INSERT INTO conversation (id, fromId, toId, messages, lastModified, messageStatus)
VALUES (
           'c31d74a4-8c4f-41b2-86f6-13b7e731a8b0',
           '50b35861-d3cd-40b2-8c3b-606b673e1e51',
           '50b35861-d3cd-40b2-8c3b-606b673e1e50',
           'Meeting at 3 PM tomorrow?',
           '2024-09-16 11:30:00',
           'SENDING'
       );
