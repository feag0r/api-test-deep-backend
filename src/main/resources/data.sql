INSERT INTO subject (id, subject_name) VALUES ('0660cf42-a3e3-445e-aa7f-9601e44e850d', 'Horns And Hooves');
INSERT INTO subject (id, subject_name) VALUES ('dab21308-f95f-4396-8cb6-aeb134e7876a', 'Сладкий бананчик');
INSERT INTO subject (id, subject_name) VALUES ('25952bee-9b86-45ac-96c2-b7dfcb03cb36', 'Мечты Никитки');

INSERT INTO account_type (id, type_name) VALUES ('a2548ad0-1274-4a6c-b02c-860358294070', 'credit');
INSERT INTO account_type (id, type_name) VALUES ('2a5eebff-56ad-4d28-bb48-173f403bca79', 'debit');

INSERT INTO account (id, account_number, is_open, account_type_id, subject_id) VALUES ('6524e646-0caf-426f-b07e-dc81fba31b79', '1-1', TRUE, 'a2548ad0-1274-4a6c-b02c-860358294070', '0660cf42-a3e3-445e-aa7f-9601e44e850d');
INSERT INTO account (id, account_number, is_open, account_type_id, subject_id) VALUES ('b970f999-4c3d-4f7c-a1cf-75793f2172e0', 'd1-1', FALSE, '2a5eebff-56ad-4d28-bb48-173f403bca79', '0660cf42-a3e3-445e-aa7f-9601e44e850d');
INSERT INTO account (id, account_number, is_open, account_type_id, subject_id) VALUES ('50921a49-db71-4052-9d3a-d5979125cc43', '2-1', TRUE, '2a5eebff-56ad-4d28-bb48-173f403bca79', 'dab21308-f95f-4396-8cb6-aeb134e7876a');

INSERT INTO attribute (id, attribute_name, subject_id) VALUES ('76fc8a9f-f6b1-4cf3-afe9-0305143df314', 'cat 1 loan', '0660cf42-a3e3-445e-aa7f-9601e44e850d');
INSERT INTO attribute (id, attribute_name, subject_id) VALUES ('2b6ca689-47f8-4721-a97a-b88d7a238b29', 'depo 5+ (закрыт)', '0660cf42-a3e3-445e-aa7f-9601e44e850d');
INSERT INTO attribute (id, attribute_name, subject_id) VALUES ('d07b0958-9428-413f-b092-752586e3c90c', 'depo 5+', 'dab21308-f95f-4396-8cb6-aeb134e7876a');
