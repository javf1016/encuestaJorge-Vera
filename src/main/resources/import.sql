/* Populate tables */
INSERT INTO marcas (id, nombre) VALUES(1, 'ASUS');
INSERT INTO marcas (id, nombre) VALUES(2, 'HP');

INSERT INTO encuestas (id, numero_documento, email, comentarios, fecha_respuesta, marca_id) VALUES(1, 123456789, 'prueba1@superintendencia.com', 'comentarios', '2017-08-28 12:00:00', 1);
INSERT INTO encuestas (id, numero_documento, email, comentarios, fecha_respuesta, marca_id) VALUES(2, 987654321, 'prueba2@superintendencia.com', 'comentarios', '2017-08-28 12:00:00', 2);

/* Creamos algunos usuarios */
/*  admin pass = admin, user pass = user */
INSERT INTO usuarios (username, password, enabled, rol) VALUES ('admin', '$2a$10$5Wwzdrr4m6bKbSuiPRVIUOhdNyUNY.fU5aX/IHhx.sumAd3AbYAsK', 1, 'ROLE_USER');
INSERT INTO usuarios (username, password, enabled, rol) VALUES ('user', '$2a$10$plrCf4vExyWxIAY6hNpWN.McGpAox4GYM68Xe15hVOqf28WX8Fvay', 1, 'ROLE_ADMIN');
