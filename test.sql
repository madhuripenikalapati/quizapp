CREATE TABLE IF NOT EXISTS employee ( eid int, name string, \
salary String, destination varchar(100)) \
COMMENT ‘Employee details’ \
ROW FORMAT DELIMITED \
FIELDS TERMINATED BY ‘\t’ \
LINES TERMINATED BY ‘\n’ \
STORED AS TEXTFILE;
create table test (col1 varchar(100), col2 char(100), col3 int, col4 int)
partitioned by ( col1 varchar(100), col2 char(100), col4 int);
ALTER TABLE employee CHANGE name ename String;
ALTER TABLE foo PARTITION (ds='2008-04-08', hr=11) CHANGE COLUMN dec_column_name dec_column_name DECIMAL(38,18)
ALTER TABLE test_change CHANGE a a1 INT;
ALTER TABLE test_change CHANGE a1 a2 STRING AFTER b;
ALTER TABLE test_change CHANGE c c1 INT FIRST;
ALTER TABLE testchange CHANGE a a INT COMMENT 'this is column a1';

ALTER TABLE test ADD COLUMNS ( a STRING COMMENT 'First column', b varchar(100));

ALTER TABLE test REPLACE COLUMNS ( a INT a1 Int, b STRING b1 String, c Varchar(100) c1 varchar(100));
                                                                                               
Select * from table where table.col1 is not true and table.col2 is true;
Select * from table where table.col1 is not false and table.col2 is false;
Select * from table where table.col1 is not true and table.col2 is not 1;
