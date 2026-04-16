INSERT INTO autoriai (id, vardas) VALUES (1, 'Kristina Sabaliauskaitė');
INSERT INTO autoriai (id, vardas) VALUES (2, 'Ričardas Gavelis');
INSERT INTO autoriai (id, vardas) VALUES (3, 'Jurgis Kunčinas');
INSERT INTO autoriai (id, vardas) VALUES (4, 'Balys Sruoga');
INSERT INTO autoriai (id, vardas) VALUES (5, 'Vincas Mykolaitis-Putinas');

INSERT INTO knygos (id, pavadinimas, virselio_adresas, aprasymas, zanrai, metai, leidiejas, puslapiu_skaicius, formato_informacija, kalba)
VALUES 
(1, 'Silva Rerum', '/images/silva_rerum.jpg', 'Istorinis romanas apie XVII a. Lietuvos bajorų gyvenimą.', 'istorinis, romanas', 2008, 'Baltos lankos', 400, 'kietas viršelis', 'lietuvių'),

(2, 'Vilniaus pokeris', '/images/vilniaus_pokeris.jpg', 'Sudėtingas ir daugiasluoksnis romanas apie sovietmečio Vilnių.', 'romanas, psichologinis', 1989, 'Vaga', 500, 'minkštas viršelis', 'lietuvių'),

(3, 'Tūla', '/images/tula.jpg', 'Poetiškas pasakojimas apie meilę ir gyvenimą Vilniuje.', 'romanas, meilės', 1993, 'Tyto alba', 200, 'minkštas viršelis', 'lietuvių'),

(4, 'Dievų miškas', '/images/dievu_miskas.jpg', 'Atsiminimai apie gyvenimą koncentracijos stovykloje.', 'atsiminimai, istorinis', 1945, 'Vaga', 300, 'kietas viršelis', 'lietuvių'),

(5, 'Altorių šešėly', '/images/altoriu_sesely.jpg', 'Romanas apie kunigo vidinius išgyvenimus ir pašaukimą.', 'romanas, psichologinis', 1933, 'Sakalas', 350, 'kietas viršelis', 'lietuvių');

INSERT INTO knygos_autoriai (knygos_id, autoriaus_id) VALUES (1, 1);
INSERT INTO knygos_autoriai (knygos_id, autoriaus_id) VALUES (2, 2);
INSERT INTO knygos_autoriai (knygos_id, autoriaus_id) VALUES (3, 3);
INSERT INTO knygos_autoriai (knygos_id, autoriaus_id) VALUES (4, 4);
INSERT INTO knygos_autoriai (knygos_id, autoriaus_id) VALUES (5, 5);