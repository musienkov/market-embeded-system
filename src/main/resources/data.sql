INSERT INTO bill (id, number, date_created, total_cost, payed, cc_number) VALUES (1, 271320540, '2021-05-16', 8527, true, '1111222233334444');

INSERT INTO cart (id, total_items, products_cost, delivery_included) VALUES (5, 0, 0, true);
INSERT INTO cart (id, total_items, products_cost, delivery_included) VALUES (6, 0, 0, true);
INSERT INTO cart (id, total_items, products_cost, delivery_included) VALUES (7, 0, 0, true);
INSERT INTO cart (id, total_items, products_cost, delivery_included) VALUES (4, 1, 6517, true);


INSERT INTO contacts (phone, address, id, city_region) VALUES ('+1 111 111 11 11', 'Міщенка 18', 4, '13');
INSERT INTO contacts (phone, address, id, city_region) VALUES ('+79211234567', 'sdf', 7, '13');


INSERT INTO distillery (id, title, region_id, description) VALUES (1, 'Планшет', 1, 'Планшет');
INSERT INTO distillery (id, title, region_id, description) VALUES (2, 'Ноутбук', 4, 'Ноутбук');
INSERT INTO distillery (id, title, region_id, description) VALUES (3, 'Монітор', 2, 'Монітор');
INSERT INTO distillery (id, title, region_id, description) VALUES (4, 'Клавіатура', 5, 'Клавіатура');
INSERT INTO distillery (id, title, region_id, description) VALUES (5, 'Смартфон', 3, 'Смартфон');


INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (2, 'Samsung Galaxy Tab A 8.0', 1, 0, 54.200000762939453, 700, 7020, 'OLED Display / USB Type-C / Nvidia Pascal Graphics', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (10, 'Asus vivobook', 2, 10, 45.799999237060547, 750, 4683, 'Опис ноутбука...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (4, 'DELL D2664E', 3, 12, 43, 700, 4913, 'Опис монітора...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (3, 'Volcano G360', 4, 12, 40, 700, 5403, 'Опис клавіатури...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (7, 'Samsung Galaxy S10', 5, 0, 48, 700, 5100, 'Опис смартфона...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (6, 'Apple iPad 10.2', 1, 16, 43, 750, 6620, 'Опис планшета...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (5, 'Acer TI 84', 2, 15, 43, 750, 6517, ' Опис ноутбука', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (1, 'Samsung Odyssey G5', 3, 10, 46, 700, 4420, 'Опис монітора...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (11, 'Logitech I280', 4, 12, 43, 700, 4547, 'Опис клавіатури...', true);
INSERT INTO product (id, name, distillery_id, age, alcohol, volume, price, description, available) VALUES (9, 'Apple iPhone SE', 5, 18, 46, 700, 14490, 'Опис смартфона', true);

INSERT INTO region (id, name, subtitle, color, description) VALUES (3, 'Смартфони', '', 'blue', 'Смартфони');
INSERT INTO region (id, name, subtitle, color, description) VALUES (4, 'Ноутбуки', '', 'black', 'Ноутбуки');
INSERT INTO region (id, name, subtitle, color, description) VALUES (1, 'Планшети', '', 'purple', 'Планшети');
INSERT INTO region (id, name, subtitle, color, description) VALUES (5, 'Клавіатури', '', 'green', 'Клавіатури');
INSERT INTO region (id, name, subtitle, color, description) VALUES (2, 'Монітори', '', 'brown', 'Монітори');

INSERT INTO role (id, title) VALUES (0, 'ROLE_ADMIN');
INSERT INTO role (id, title) VALUES (1, 'ROLE_STAFF');
INSERT INTO role (id, title) VALUES (2, 'ROLE_USER');

INSERT INTO storage (id, available) VALUES (1, true);
INSERT INTO storage (id, available) VALUES (2, true);
INSERT INTO storage (id, available) VALUES (3, true);
INSERT INTO storage (id, available) VALUES (4, true);
INSERT INTO storage (id, available) VALUES (5, true);
INSERT INTO storage (id, available) VALUES (6, true);
INSERT INTO storage (id, available) VALUES (7, true);
INSERT INTO storage (id, available) VALUES (8, true);
INSERT INTO storage (id, available) VALUES (9, true);
INSERT INTO storage (id, available) VALUES (10, true);
INSERT INTO storage (id, available) VALUES (11, true);

INSERT INTO user_account (id, email, customerInfo, password, name, active) VALUES (4, 'user@mail.com', '', '$2a$10$Cmwx2Xr/PVpkibiiDz0s7eaVGZHPUvAu5ivdVC5BJgSYbp3c06FY6', 'Vitalii Musiienko', true);

INSERT INTO user_role (user_id, role_id) VALUES (1, 0);

