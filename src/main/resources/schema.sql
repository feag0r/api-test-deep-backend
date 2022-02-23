drop table if exists test_table1;
create table test_table1(id uuid primary key, test_value1 nvarchar2, test_table2_id uuid);
drop table if exists test_table2;
create table test_table2(id uuid primary key, test_value2 nvarchar2);