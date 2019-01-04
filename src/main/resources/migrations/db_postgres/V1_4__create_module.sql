
-- periodo de validade ou uma flag geral
CREATE TABLE IF NOT EXISTS "user_mgmt".modules (
  id BIGSERIAL PRIMARY KEY,
	version BIGINT NOT NULL,
	name VARCHAR(50) NOT NULL,
	creation_time TIMESTAMP NOT NULL,
	icon VARCHAR(50) NOT NULL,
	theme VARCHAR(50) NOT NULL,
	url VARCHAR(50) NOT NULL,
	is_public BOOLEAN NOT NULL,
	str_key VARCHAR(100),
	is_menu_item BOOLEAN NOT NULL,
	modification_time TIMESTAMP
);