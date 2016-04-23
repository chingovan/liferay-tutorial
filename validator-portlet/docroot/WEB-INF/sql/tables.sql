create table Validator_Student (
	StudentId LONG not null primary key,
	Code VARCHAR(20) null,
	Fullname VARCHAR(50) null,
	Gender BOOLEAN,
	Birthday DATE null,
	Email VARCHAR(150) null,
	Address VARCHAR(255) null,
	Blog VARCHAR(255) null,
	Mark DOUBLE
);