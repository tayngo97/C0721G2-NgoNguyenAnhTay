use quanlysinhvien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select sub.subName,sub.credit
from subject sub
where sub.credit >= all (select max(credit) from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sub.subName,max(m.mark)
from `subject` sub
join mark m 
on sub.subid = m.subid
where m.mark >= all(select m.Mark from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.studentID,s.studentName,avg(m.mark) `Điểm trung bình`
from student s
join mark m
on s.StudentId = m.StudentId
group by s.StudentName
order by avg(m.mark) desc;


