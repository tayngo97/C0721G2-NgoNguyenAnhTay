use quanlysinhvien;

select * from student;

select * from student as s where  s.status = true;

select * from subject as sub where sub.credit <10;

select s.studentId, s.studentName,c.className
from student s join class c 
on s.classid = c.classid
where c.className = 'A1';

select s.studentId,s.studentName,sub.subName,m.mark
from mark m join subject sub on m.subid = sub.subid
join student s on s.studentId = m.studentID
where sub.subName = 'CF';
