SELECT student.id, student_name
FROM Student INNER JOIN class 
ON class.class_title = student.student_title
WHERE class.teach_name = 'Ms. Lovelace';