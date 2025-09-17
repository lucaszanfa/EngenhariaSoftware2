INSERT INTO usuario (nome, email, telefone, senha, tipo)
VALUES ('Lucas', 'lucas@email.com', '31999999999', '123456', 'ADMIN');

INSERT INTO sala (nome, capacidade)
VALUES ('Auditório', 50);

INSERT INTO reserva (usuario_id, sala_id, data_reserva)
VALUES (1, 1, '2025-09-20 10:00:00');

INSERT INTO bloqueio (sala_id, inicio, fim)
VALUES (1, '2025-09-21 08:00:00', '2025-09-21 18:00:00');

