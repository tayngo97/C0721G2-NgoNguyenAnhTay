use quanlysinhvien;

select * from student s
where s.studentName like 'h%';

select * from class 
where month(startdate) = 12;

select * from subject sub
where sub.Credit between 3 and 5;

update student 
set classId = 2
where studentName = 'Hung';

select * from student 
where ClassId = 2 ;

select s.studentName,sub.subName,m.Mark
from student s join mark m on s.studentId = m.studentId
join subject sub on m.subID = sub.subid
order by m.mark desc , m.markid ;