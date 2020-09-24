CREATE TABLE IF NOT EXISTS employee ( eid int, name string, \
salary String, destination varchar(100)) \
COMMENT ‘Employee details’ \
ROW FORMAT DELIMITED \
FIELDS TERMINATED BY ‘\t’ \
LINES TERMINATED BY ‘\n’ \
STORED AS TEXTFILE;
create table test (col1 varchar(100), col2 char(100), col3 int, col4 int)
partitioned by ( col1 varchar(100), col2 char(100), col4 int);
