-- =========================
-- AUTORIAI
-- =========================
INSERT INTO autoriai (id, vardas) VALUES (1, 'Kristina Sabaliauskaitė');
INSERT INTO autoriai (id, vardas) VALUES (2, 'Ričardas Gavelis');
INSERT INTO autoriai (id, vardas) VALUES (3, 'Jurgis Kunčinas');
INSERT INTO autoriai (id, vardas) VALUES (4, 'Balys Sruoga');
INSERT INTO autoriai (id, vardas) VALUES (5, 'Vincas Mykolaitis-Putinas');
INSERT INTO autoriai (id, vardas) VALUES (6, 'Julius Kaupas');
INSERT INTO autoriai (id, vardas) VALUES (7, 'Saulius Šaltenis');
INSERT INTO autoriai (id, vardas) VALUES (8, 'Antanas Škėma');
INSERT INTO autoriai (id, vardas) VALUES (9, 'Marius Ivaškevičius');
INSERT INTO autoriai (id, vardas) VALUES (10, 'Gintaras Grajauskas');
INSERT INTO autoriai (id, vardas) VALUES (11, 'Herkus Kunčius');
INSERT INTO autoriai (id, vardas) VALUES (12, 'Alvydas Šlepikas');
INSERT INTO autoriai (id, vardas) VALUES (13, 'Undinė Radzevičiūtė');
INSERT INTO autoriai (id, vardas) VALUES (14, 'Sigitas Parulskis');
INSERT INTO autoriai (id, vardas) VALUES (15, 'Valdas Papievis');

-- =========================
-- KNYGOS (35)
-- =========================
INSERT INTO knygos (id, pavadinimas, virselio_adresas, aprasymas, zanrai, metai, leidejas, puslapiu_skaicius, formato_informacija, kalba)
VALUES
(1, 'Silva Rerum', '/images/silva_rerum.jpg', 'Istorinis romanas apie XVII a. Lietuvos bajorų gyvenimą.', 'istorinis, romanas', 2008, 'Baltos lankos', 400, 'kietas viršelis', 'lietuvių'),
(2, 'Vilniaus pokeris', '/images/vilniaus_pokeris.jpg', 'Sudėtingas romanas apie sovietinį Vilnių.', 'romanas, psichologinis', 1989, 'Vaga', 500, 'minkštas viršelis', 'lietuvių'),
(3, 'Tūla', '/images/tula.jpg', 'Meilės istorija Vilniuje.', 'romanas, meilės', 1993, 'Tyto alba', 200, 'minkštas viršelis', 'lietuvių'),
(4, 'Dievų miškas', '/images/dievu_miskas.jpg', 'Atsiminimai apie lagerį.', 'atsiminimai, istorinis', 1945, 'Vaga', 300, 'kietas viršelis', 'lietuvių'),
(5, 'Altorių šešėly', '/images/altoriu_sesely.jpg', 'Kunigo vidiniai išgyvenimai.', 'romanas, psichologinis', 1933, 'Sakalas', 350, 'kietas viršelis', 'lietuvių'),

(6, 'Ragana ir lietus', '/images/ragana_lietus.jpg', 'Magiška Lietuva.', 'fantastika, romanas', 1993, 'Vaga', 280, 'minkštas viršelis', 'lietuvių'),
(7, 'Parduotos vasaros', '/images/parduotos_vasaros.jpg', 'Brendimo istorija.', 'romanas', 1965, 'Vaga', 220, 'minkštas viršelis', 'lietuvių'),
(8, 'Balta drobulė', '/images/balta_drobule.jpg', 'Emigracijos egzistencija.', 'romanas, modernizmas', 1958, 'Vaga', 260, 'kietas viršelis', 'lietuvių'),
(9, 'Žali', '/images/zali.jpg', 'Partizaninis karas.', 'istorinis, romanas', 2002, 'Tyto alba', 450, 'kietas viršelis', 'lietuvių'),
(10, 'Vėjas nuo jūros', '/images/vejas_jura.jpg', 'Poetinė kelionė.', 'romanas', 1999, 'Alma littera', 310, 'minkštas viršelis', 'lietuvių'),

(11, 'Šiaurės kronikos', '/images/siaures_kronikos.jpg', 'Istorija.', 'istorinis', 2010, 'Baltos lankos', 420, 'kietas viršelis', 'lietuvių'),
(12, 'Mėnulio vaikai', '/images/menulio_vaikai.jpg', 'Fantastinė Lietuva.', 'fantastika', 2015, 'Tyto alba', 380, 'kietas viršelis', 'lietuvių'),
(13, 'Vilkų valanda', '/images/vilku_valanda.jpg', 'Trileris.', 'trileris', 2012, 'Alma littera', 290, 'minkštas viršelis', 'lietuvių'),
(14, 'Upės sapnai', '/images/upes_sapnai.jpg', 'Poetinė drama.', 'romanas', 2008, 'Vaga', 240, 'minkštas viršelis', 'lietuvių'),
(15, 'Sielos kelias', '/images/sielos_kelias.jpg', 'Filosofija.', 'romanas', 2005, 'Tyto alba', 270, 'kietas viršelis', 'lietuvių'),

(16, 'Juodoji dėžė', '/images/juodoji_deze.jpg', 'Trileris.', 'trileris', 2011, 'Baltos lankos', 320, 'kietas viršelis', 'lietuvių'),
(17, 'Miesto šešėliai', '/images/miesto_seseliai.jpg', 'Vilniaus kriminalai.', 'detektyvas', 2018, 'Alma littera', 350, 'minkštas viršelis', 'lietuvių'),
(18, 'Paskutinis vakaras', '/images/paskutinis_vakaras.jpg', 'Drama.', 'romanas', 2003, 'Vaga', 210, 'minkštas viršelis', 'lietuvių'),
(19, 'Tylos forma', '/images/tylos_forma.jpg', 'Eksperimentas.', 'modernizmas', 2016, 'Tyto alba', 260, 'kietas viršelis', 'lietuvių'),
(20, 'Kraujo medis', '/images/kraujo_medis.jpg', 'Istorija.', 'istorinis', 2009, 'Baltos lankos', 410, 'kietas viršelis', 'lietuvių'),

(21, 'Vasaros kronika', '/images/vasaros_kronika.jpg', 'Vasara.', 'romanas', 1998, 'Vaga', 200, 'minkštas viršelis', 'lietuvių'),
(22, 'Nakties kelias', '/images/nakties_kelias.jpg', 'Psichologija.', 'psichologinis', 2013, 'Alma littera', 300, 'kietas viršelis', 'lietuvių'),
(23, 'Rytas be vėjo', '/images/rytas_be_vejo.jpg', 'Kaimas.', 'romanas', 2007, 'Tyto alba', 230, 'minkštas viršelis', 'lietuvių'),
(24, 'Žiemos tyluma', '/images/ziemos_tyluma.jpg', 'Egzistencija.', 'romanas', 2014, 'Vaga', 280, 'kietas viršelis', 'lietuvių'),
(25, 'Šviesos nešėjai', '/images/sviesos_nesejai.jpg', 'Epas.', 'istorinis', 2019, 'Baltos lankos', 500, 'kietas viršelis', 'lietuvių'),

(26, 'Laiko ženklai', '/images/laiko_zenklai.jpg', 'Filosofija.', 'filosofinis', 2011, 'Alma littera', 310, 'minkštas viršelis', 'lietuvių'),
(27, 'Vėjų miestas', '/images/veju_miestas.jpg', 'Vilnius.', 'romanas', 2006, 'Tyto alba', 340, 'kietas viršelis', 'lietuvių'),
(28, 'Paskutinė sala', '/images/paskutine_sala.jpg', 'Izoliacija.', 'romanas', 2017, 'Vaga', 290, 'minkštas viršelis', 'lietuvių'),
(29, 'Nematomi žmonės', '/images/nematomi_zmones.jpg', 'Soc. drama.', 'romanas', 2018, 'Alma littera', 330, 'kietas viršelis', 'lietuvių'),
(30, 'Sniego tyla', '/images/sniego_tyla.jpg', 'Žiema.', 'romanas', 2010, 'Tyto alba', 250, 'minkštas viršelis', 'lietuvių'),

(31, 'Atminties keliai', '/images/atminties_keliai.jpg', 'Istorija.', 'istorinis', 2012, 'Baltos lankos', 400, 'kietas viršelis', 'lietuvių'),
(32, 'Paslėptas laikas', '/images/pasleptas_laikas.jpg', 'Paslaptis.', 'trileris', 2015, 'Vaga', 360, 'kietas viršelis', 'lietuvių'),
(33, 'Tamsos sodas', '/images/tamsos_sodas.jpg', 'Drama.', 'romanas', 2016, 'Alma littera', 280, 'minkštas viršelis', 'lietuvių'),
(34, 'Amžinas miestas', '/images/amzinas_miestas.jpg', 'Mitologija.', 'fantastika', 2020, 'Tyto alba', 450, 'kietas viršelis', 'lietuvių'),
(35, 'Pabaigos pradžia', '/images/pabaigos_pradzia.jpg', 'Egzistencija.', 'filosofinis', 2021, 'Baltos lankos', 370, 'kietas viršelis', 'lietuvių');

-- =========================
-- JUNCTION TABLE
-- =========================
INSERT INTO knygos_autoriai (knygos_id, autoriaus_id) VALUES
(1,1),(2,2),(3,3),(4,4),(5,5),
(6,6),(7,7),(8,8),(9,9),(10,10),
(11,11),(12,12),(13,13),(14,14),(15,15),
(16,1),(17,2),(18,3),(19,4),(20,5),
(21,6),(22,7),(23,8),(24,9),(25,10),
(26,11),(27,12),(28,13),(29,14),(30,15),
(31,1),(32,2),(33,3),(34,4),(35,5);