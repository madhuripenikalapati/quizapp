CREATE TABLE employee_test_1 (id int, name string, salary int)
STORED AS ORC TBLPROPERTIES ('transactional' = "true");
