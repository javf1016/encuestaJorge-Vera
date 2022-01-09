/* Populate tables */
INSERT INTO marcas (id, nombre) VALUES(1, 'ASUS');
INSERT INTO marcas (id, nombre) VALUES(2, 'HP');

/* Creamos algunos usuarios */
/*  admin pass = admin, user pass = user */
INSERT INTO usuarios (username, password, enabled, rol) VALUES ('admin', '$2a$10$5Wwzdrr4m6bKbSuiPRVIUOhdNyUNY.fU5aX/IHhx.sumAd3AbYAsK', true, 'ROLE_USER');
INSERT INTO usuarios (username, password, enabled, rol) VALUES ('user', '$2a$10$plrCf4vExyWxIAY6hNpWN.McGpAox4GYM68Xe15hVOqf28WX8Fvay', true, 'ROLE_ADMIN');
