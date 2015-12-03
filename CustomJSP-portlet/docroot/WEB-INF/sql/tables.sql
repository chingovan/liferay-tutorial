create table Author (
	AuthorId LONG not null primary key,
	Name VARCHAR(75) null,
	Institute VARCHAR(75) null,
	URL VARCHAR(75) null
);

create table Book (
	BookId LONG not null primary key,
	Title VARCHAR(75) null,
	Edition VARCHAR(75) null,
	ISBN VARCHAR(75) null,
	cover VARCHAR(75) null,
	NumberOfPage INTEGER,
	PublisherName VARCHAR(75) null,
	PublisherURL VARCHAR(75) null
);

create table Books_Authors (
	AuthorId LONG not null,
	BookId LONG not null,
	primary key (AuthorId, BookId)
);