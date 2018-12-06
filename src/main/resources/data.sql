INSERT INTO product (name, price) VALUES
  ('Test1', 2.5),
  ('test2', 22);
INSERT INTO basket (id) VALUES
  (null),
  (null);
INSERT INTO product_in_basket (basket_id, product_id) VALUES
  (1, 1),
  (1, 2),
  (1, 5);
