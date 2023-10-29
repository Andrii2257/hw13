INSERT
INTO
  client
  (name)
VALUES
  ('John Dow'),
  ('Alan Powell'),
  ('Fidel Hughes'),
  ('Valentine Gray'),
  ('Josue Barnes'),
  ('Vladimir Torres'),
  ('Den Wood'),
  ('Gage Campbell'),
  ('Ricardo Morgan'),
  ('Pierre Jenkins'),
  ('Collin Scott');
INSERT
INTO
  planet
  (id, name)
VALUES
  ('EARTH', 'Earth'),
  ('MARS', 'Mars'),
  ('VEN', 'Venera'),
  ('SAT', 'Saturn'),
  ('URN', 'Uran'),
  ('JUP', 'Jupiter');

  INSERT
INTO
  ticket
  (client_id, from_planet_id, to_planet_id)
VALUES
  (1, 'EARTH', 'MARS'),
  (1, 'MARS', 'URN'),
  (2, 'EARTH', 'SAT'),
  (3, 'JUP', 'VEN'),
  (4, 'URN', 'EARTH'),
  (5, 'URN', 'JUP'),
  (6, 'VEN', 'MARS'),
  (7, 'EARTH', 'VEN'),
  (9, 'EARTH', 'JUP'),
  (8, 'SAT', 'VEN');