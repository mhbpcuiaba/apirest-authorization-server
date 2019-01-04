

CREATE TABLE IF NOT EXISTS "user_mgmt".groups_modules (
	group_id BIGINT NOT NULL,
	module_id BIGINT NOT NULL,
	PRIMARY KEY(group_id, module_id),
	CONSTRAINT fk_groups_modules_to_modules FOREIGN KEY(module_id) REFERENCES "user_mgmt".modules(id),
	CONSTRAINT fk_groups_modules_to_groups  FOREIGN KEY(group_id)  REFERENCES "user_mgmt".groups(id)
);