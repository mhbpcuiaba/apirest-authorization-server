

CREATE TABLE IF NOT EXISTS "user_mgmt".users_groups (
	user_id BIGINT NOT NULL,
	group_id BIGINT NOT NULL,
	PRIMARY KEY(user_id, group_id),
	CONSTRAINT fk_users_groups_to_users FOREIGN KEY(user_id) REFERENCES "user_mgmt".users(id),
	CONSTRAINT fk_users_groups_to_groups FOREIGN KEY(group_id) REFERENCES "user_mgmt".groups(id)
);