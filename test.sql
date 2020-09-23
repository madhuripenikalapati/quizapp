CREATE TABLE IF NOT EXISTS employee ( eid int, name string, \
salary String, destination String) \
COMMENT ‘Employee details’ \
ROW FORMAT DELIMITED \
FIELDS TERMINATED BY ‘\t’ \
LINES TERMINATED BY ‘\n’ \
STORED AS TEXTFILE;
