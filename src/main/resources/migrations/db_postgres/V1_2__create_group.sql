
-- periodo de validade ou uma flag geral
CREATE TABLE IF NOT EXISTS "user_mgmt".groups (
  id BIGSERIAL PRIMARY KEY,
	version BIGINT NOT NULL,
	name VARCHAR(50) NOT NULL,
	creation_time TIMESTAMP NOT NULL,
	modification_time TIMESTAMP
);