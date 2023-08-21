--DROP TABLE if EXISTS student;

CREATE TABLE student (
	id INT PRIMARY KEY NOT NULL,
	name VARCHAR(100),
	email VARCHAR(50),
    dob DATETIME,
  	age INT
);