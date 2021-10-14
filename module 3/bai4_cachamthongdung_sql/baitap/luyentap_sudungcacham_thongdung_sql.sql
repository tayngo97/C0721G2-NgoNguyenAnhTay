use quanlysinhvien;

select sub.subName,sub.credit
from subject sub
where sub.credit >= all (select max(credit) from `subject`);

select sub.subName,max(m.mark)
from `subject` sub
join mark m 
on sub.subid = m.subid
where m.mark >= all(select m.Mark from mark);

select s.studentID,s.studentName,avg(m.mark) `Điểm trung bình`
from student s
join mark m
on s.StudentId = m.StudentId
group by s.StudentName
order by avg(m.mark) desc;


