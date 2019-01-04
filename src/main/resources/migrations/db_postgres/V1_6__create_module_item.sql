
-- periodo de validade ou uma flag geral
CREATE TABLE IF NOT EXISTS "user_mgmt".module_items (
  id BIGSERIAL PRIMARY KEY,
	version BIGINT NOT NULL,
	label VARCHAR(50) NOT NULL,
	position INT NOT NULL,
	creation_time TIMESTAMP NOT NULL,
	icon VARCHAR(50) NOT NULL,
	parent BIGINT ,

	url VARCHAR(50) NOT NULL,
	is_public BOOLEAN NOT NULL,
	str_key VARCHAR(100),
	is_menu_item BOOLEAN NOT NULL,
	modification_time TIMESTAMP
);