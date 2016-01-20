create table ExampleBlog_Author (
	AuthorId LONG not null primary key,
	Name VARCHAR(75) null
);

create table ExampleBlog_Post (
	PostId LONG not null primary key,
	Title VARCHAR(75) null,
	Content VARCHAR(75) null,
	AuthorId LONG
);