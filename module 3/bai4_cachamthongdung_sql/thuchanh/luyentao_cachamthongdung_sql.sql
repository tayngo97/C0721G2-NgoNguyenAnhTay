use quanlysinhvien;

select s.address,count(s.address) as `Số lượng sinh viên`
from student s
group by s.address;

select s.studentID ,s.studentName,avg(m.mark) as `Điểm trung bình`
from student s
join mark m
on s.studentID = m.studentID
join subject sub
on m.subID = sub.subID
group by s.studentName;

-- SELECT S.StudentId,S.StudentName, AVG(Mark)
-- FROM Student S join Mark M on S.StudentId = M.StudentId
-- GROUP BY S.StudentId, S.StudentName

select s.studentID ,s.studentName,avg(m.mark) as `Điểm trung bình`
from student s
join mark m
on s.studentID = m.studentID
join subject sub
on m.subID = sub.subID
group by s.studentName
having avg(m.mark) >15;


select s.studentID ,s.studentName,avg(m.mark) as `Điểm trung bình`
from student s
join mark m
on s.studentID = m.studentID
join subject sub
on m.subID = sub.subID
group by s.studentName
having avg(mark) >= all (select avg(mark) from mark group by mark.studentID);


