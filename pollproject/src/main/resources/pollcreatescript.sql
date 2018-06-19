CREATE TABLE poll(
  id INTEGER,
  title VARCHAR(1023)
);
CREATE TABLE option(
  id INTEGER,
  option_text VARCHAR(255),
  poll_id INTEGER
);

INSERT INTO poll (id, title) VALUES (1, 'Ваш возраст?');
INSERT INTO poll (id, title) VALUES (2, 'Ваше образование?');
INSERT INTO poll (id, title) VALUES (3, 'Ваш доход?');

INSERT INTO option(id, option_text, poll_id) VALUES (1, '<18', 1);
INSERT INTO option(id, option_text, poll_id) VALUES (2, '>=18', 1);
INSERT INTO option(id, option_text, poll_id) VALUES (3, 'Неоконченное среднее', 2);
INSERT INTO option(id, option_text, poll_id) VALUES (4, 'Среднее', 2);
INSERT INTO option(id, option_text, poll_id) VALUES (5, 'Неоконченное высшее', 2);

SELECT * FROM option
