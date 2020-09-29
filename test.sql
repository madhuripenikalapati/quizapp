CREATE TABLE IF NOT EXISTS employee ( eid int, name string, \
salary String, destination varchar(100)) \
COMMENT ‘Employee details’ \
ROW FORMAT DELIMITED \
FIELDS TERMINATED BY ‘\t’ \
LINES TERMINATED BY ‘\n’ \
STORED AS TEXTFILE;              
ALTER TABLE employee CHANGE name ename String;
ALTER TABLE foo PARTITION (ds='2008-04-08', hr=11) CHANGE COLUMN dec_column_name dec_column_name DECIMAL(38,18)
ALTER TABLE test_change CHANGE a a1 INT;
ALTER TABLE test_change CHANGE a1 a2 STRING AFTER b;
ALTER TABLE test_change CHANGE c c1 INT FIRST;
ALTER TABLE testchange CHANGE a a INT COMMENT 'this is column a1';
