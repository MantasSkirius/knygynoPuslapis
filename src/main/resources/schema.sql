DROP TABLE IF EXISTS knygos_autoriai CASCADE;
DROP TABLE IF EXISTS knygos CASCADE;
DROP TABLE IF EXISTS autoriai CASCADE;

CREATE TABLE knygos (
    id BIGSERIAL PRIMARY KEY,
    pavadinimas VARCHAR(255) NOT NULL,
    autoriai TEXT,
    virselio_adresas VARCHAR(255) NOT NULL,
    aprasymas TEXT NOT NULL,
    zanrai TEXT NOT NULL,
    metai INT NOT NULL,
    leidejas VARCHAR(255) NOT NULL,
    puslapiu_skaicius INT,
    formato_informacija VARCHAR(255),
    kalba VARCHAR(255)
);

CREATE TABLE autoriai (
    id BIGSERIAL PRIMARY KEY,
    vardas VARCHAR(255) NOT NULL
);

CREATE TABLE knygos_autoriai (
    knygos_id BIGINT REFERENCES knygos(id) ON DELETE CASCADE,
    autoriaus_id BIGINT REFERENCES autoriai(id) ON DELETE CASCADE,
    PRIMARY KEY (knygos_id, autoriaus_id)
);