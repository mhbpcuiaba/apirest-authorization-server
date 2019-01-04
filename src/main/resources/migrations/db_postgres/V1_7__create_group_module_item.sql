

CREATE TABLE IF NOT EXISTS "user_mgmt".groups_modules_module_items (
	group_id BIGINT NOT NULL,
	module_id BIGINT NOT NULL,
	module_item_id BIGINT NOT NULL,
	PRIMARY KEY(group_id, module_id),
	CONSTRAINT fk_groups_modules_items_to_groups_modules FOREIGN KEY(group_id, module_id) REFERENCES "user_mgmt".groups_modules(group_id, module_id),
	CONSTRAINT fk_groups_modules_items_to_module_items   FOREIGN KEY(module_item_id)      REFERENCES "user_mgmt".module_items(id)
);