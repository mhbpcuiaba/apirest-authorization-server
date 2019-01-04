
/*
cira o arquivo de migracao na mao msm!!!
  mvn flyway:baseline
  mvn flyway:info
  mvn flyway:migrate
  mvn flyway:clean
 */

CREATE TABLE IF NOT EXISTS "user_mgmt".users (
  id BIGSERIAL PRIMARY KEY,
	version BIGINT NOT NULL,
	name VARCHAR(50) NOT NULL ,
	login VARCHAR(50) UNIQUE NOT NULL,
	email VARCHAR(70) UNIQUE NOT NULL,
	birthday DATE NOT NULL,
	phone VARCHAR(15),
	password VARCHAR(200) NOT NULL,
	creation_time TIMESTAMP NOT NULL,
	modification_time TIMESTAMP
);