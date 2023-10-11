create database quanlysinhvien;
use quanlysinhvien;
create table Class(
ClassID int primary key auto_increment,
ClassName varchar(60) not null,
StartDate datetime not null,
`Status` bit
);
create table Student(
StudentID int primary key auto_increment,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(20),
Status bit,
ClassID int,
constraint FK_ClassID foreign key (ClassID) references CLass (ClassID)
);
create table Subject(
SubId int primary key auto_increment,
SubName varchar(30) not null,
Credit tinyint default 1 check (Credit  >= 1),
Status bit default 1
);
create table Mark(
MarkID int primary key auto_increment,
SubID int not null,
StudentID int not null,
Mark float default 0 check (Mark between 0 and 100),
ExamTimes  tinyint default 1,
unique (SubID,StudentID),
constraint FK_SubID foreign key (SubID) references Subject (SubID),
constraint FK_StudentID foreign key (StudentID) references Student(StudentID)
);

