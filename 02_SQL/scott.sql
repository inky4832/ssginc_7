use testdb;

-- 1. 모든 컬럼 보기
SELECT * FROM dept;
select * from dept;
select * 
from dept;
select * 
from emp;
-- 2. 특정 컬럼만 보기. 지정된 순서로 출력됨.
SELECT empno, ename, job, hiredate
FROM emp;

SELECT hiredate, empno, ename, job 
FROM emp;

-- 3. 연산가능 및 함수 사용 가능
SELECT empno, ename, sal,  sal * 1.1, ROUND(sal * 1.1)
FROM emp;

-- 4. 컬럼헤더 별칭 ( as 는 생략 가능 , "별칭" 가능 )
SELECT empno AS "사번" , ename AS 성명, sal 급여
FROM emp;

SELECT empno AS "사원 번호" , ename AS 성명, sal 급여
FROM emp;

desc emp;
DESC information_schema.table_constraints;

select *
from information_schema.table_constraints;

-- 5. null 값 처리
select empno, ename, sal , (sal*12) + comm   as 연봉
from emp;

select empno, ename, sal , (sal*12) + comm   as 연봉,   
   (sal*12) +  ifnull(comm, 0) as 연봉2   
from emp;

-- 6. 중복행제거
SELECT distinct job
FROM emp;


-- 7. where 절- 비교연산자
 SELECT empno, ename, job, deptno
 FROM emp
 WHERE deptno = 30;
 
 SELECT empno, ename, job, deptno
 FROM emp
 WHERE job = 'salesman'; -- mysql은 리터럴값도 대소문자 구별 안함
 
SELECT empno, ename, job, deptno
 FROM emp
 WHERE HIREDATE = '1980-12-17'; 
 
 SELECT empno, ename, job, deptno, sal 
 FROM emp
 WHERE sal <= 1000;
 
 SELECT empno, ename, job, deptno, sal
 FROM emp
 WHERE sal BETWEEN 800 AND 2000;  -- 800과 2000 포함
 
 SELECT empno, ename, job, deptno
 FROM emp
 WHERE HIREDATE BETWEEN '1980-12-17' AND '1981-5-17'; -- 날짜 데이터 가능 
 
 SELECT empno, ename, sal
 FROM emp
 WHERE empno IN (7369,7566,7698);
 
  SELECT empno, ename, sal
 FROM emp
 WHERE ename IN ('SMITH','jones');
 
 SELECT empno, ename, job, deptno, HIREDATE
 FROM emp
 WHERE HIREDATE IN ('1980-12-17','1981-12-17');
 
 SELECT empno, ename, sal, comm, job
 FROM emp
 WHERE comm IS NULL;
 
  SELECT empno, ename, sal, comm, job
 FROM emp
 WHERE comm IS NOT NULL;
 
 select sal, sal % 3 , mod(sal , 3)
 from emp;
 
-- 8. like 연산자
use testdb;
 SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE 'A%';
 
 SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE '%T%';
 
SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE '_L%';
 
 SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE '____N';  -- 이름이 5글자이고 N으로 끝남
 
SELECT empno, ename, sal
 FROM emp
 WHERE ename LIKE '%E_%' ESCAPE 'E';
 
 -- 9. 논리 연산자
 SELECT empno, ename, job, deptno, hiredate, sal
 FROM emp
 WHERE job = 'salesman'AND sal >= 1500;
 
  SELECT empno, ename, job, deptno, hiredate, sal
 FROM emp
 WHERE job = 'salesman' OR sal >= 1500;
 
  SELECT empno, ename, sal, comm, job
 FROM emp
 WHERE comm IS NOT NULL;
 
  SELECT empno, ename, sal
 FROM emp
 WHERE ename NOT LIKE 'A%';
 
  SELECT empno, ename, job, deptno, sal
 FROM emp
 WHERE sal NOT BETWEEN 800 AND 2000; 
 
 -- 10. 정렬
 SELECT empno, ename, hiredate
 FROM emp
 ORDER BY hiredate;  -- 컬럼명 지정
 
 SELECT empno, ename, hiredate
 FROM emp
 ORDER BY hiredate  desc ;
 
  SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY Annual;  -- 별칭 지정 
 
SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY 1;   -- select절에 지정된 컬럼 순서값 지정
 
 -- 다중 정렬
 SELECT empno, ename, sal * 12 AS Annual
 FROM emp
 ORDER BY 3, 1 DESC;
 
 
 -- 11. 단일행 함수 - 문자데이터
 SELECT empno, lower(ename), LOWER('HeLLO')
 FROM emp;
 
SELECT empno, UPPER(ename), UPPER('HeLLO')
 FROM emp;
 
SELECT empno, CONCAT(ename, ' 과 ', sal) as "ename sal"
 FROM emp;
 
 SELECT empno, CONCAT_WS(',', ename, sal)
 FROM emp;
 
 SELECT empno, LPAD(ename,10, '*'), LPAD(sal, 10, '*')
 FROM emp;

 SELECT empno, RPAD(ename,10, '*'), RPAD(sal, 10, '*')
 FROM emp;
 
  SELECT empno, ename, SUBSTR(ename,1,2), SUBSTR(ename,3),
 SUBSTR(ename,-1)
 FROM emp;
 
 SELECT empno, ename, LENGTH(ename)
 FROM emp;

 SELECT empno, ename, sal, REPLACE(sal, '0','o')
 FROM emp;

SELECT INSTR('foobarbar', 'bar'), INSTR('foobarbar', 'xbar')
from dual;

SELECT LTRIM('     bar     '), LENGTH(LTRIM('     bar     '));

SELECT RTRIM('     bar     '), LENGTH(RTRIM('     bar     '));

SELECT TRIM('     bar     '),
 TRIM(BOTH FROM '     bar     '),
 TRIM(LEADING FROM '     bar     '),
 TRIM(TRAILING FROM '     bar     ');
 
 SELECT TRIM('xxxbarxxx'),
 TRIM(BOTH 'x' FROM 'xxxbarxxx'),
 TRIM(LEADING 'x' FROM 'xxxbarxxx'),
 TRIM(TRAILING 'x' FROM 'xxxbarxxx');
 
SELECT ename, REVERSE(ename)
 FROM emp;

SELECT FORMAT(9876543.2195, 2);  -- 반올림해서 소수점 2자리까지 표현
-- insert(str,pos,len,newstr)
select insert('abcdefg',3, 4, '####');

SELECT LEFT('foobarbar', 4), RIGHT('foobarbar', 4);

SELECT REPEAT('MySQL', 3);

SELECT empno, CONCAT(ename, '     ', sal) as "ename sal"
 FROM emp;
SELECT empno, CONCAT(ename, space(5), sal) as "ename sal"
 FROM emp;
 
-- 12. 단일행함수 - 수치 함수
SELECT ROUND(45.678), ROUND(45.678, 2) , ROUND(45.678,-1) FROM DUAL;

 SELECT TRUNCATE(45.678, 0), TRUNCATE(45.678, 2) ,
 TRUNCATE(45.678,-1)
 FROM DUAL;

 SELECT CEIL(45.178), CEIL(-45.178);
  SELECT FLOOR(45.178), FLOOR(-45.178);
  
  SELECT MOD(10, 3), 10%3 , 10 MOD 3 FROM DUAL;
SELECT SIGN(-1.200), SIGN(34.3), SIGN(0) FROM DUAL;  

SELECT abs(-1.200), abs(34.3), abs(0) FROM DUAL;  

-- 12. 단일행 함수 - 날짜 함수
 -- 현재 날짜 구하기 :  'yyyy-MM-dd'
 SELECT CURDATE(), CURRENT_DATE(), CURRENT_DATE FROM DUAL;
 
 -- 현재 시간 구하기 : 'hh:mm:ss'
  SELECT CURTIME(), CURRENT_TIME(), CURRENT_TIME FROM DUAL;
  
-- 현재날짜 및 시간 구하기 : 'YYYY-MM-DD hh:mm:ss' 
 SELECT SYSDATE(), NOW();
 SELECT SYSDATE(), NOW() FROM DUAL;
 
 -- NOW()는 select 문이 실행될때 시간을 반환
SELECT NOW(), sleep(2), NOW() FROM DUAL;
 -- SYSDATE()는 SYSDATE()함수가 호출되어 실행될 때의 시간을 반환.
SELECT SYSDATE(), sleep(2), SYSDATE() FROM DUAL;
 
SELECT ADDDATE('2008-01-02', 30), ADDDATE('2008-01-02',-30);
SELECT ADDDATE( NOW(), 30), ADDDATE(NOW(), -30);

SELECT DATE_ADD('2008-01-02', INTERVAL 1 DAY) as A1,
 DATE_ADD('2008-01-02', INTERVAL 1 MONTH) as A2,
 DATE_ADD('2008-01-02', INTERVAL 1 YEAR) as A3,
 NOW() as A4,
 DATE_ADD(NOW(), INTERVAL -10 MINUTE) as A5,
 DATE_ADD(NOW(), INTERVAL 2 HOUR) as A6;
 
  SELECT DATE_SUB('2008-01-02', INTERVAL 1 DAY) as B1,
 DATE_SUB('2008-01-02', INTERVAL 1 MONTH) as B2,
 DATE_SUB('2008-01-02', INTERVAL 1 YEAR) as B3,
 NOW() as B4,
 DATE_SUB(NOW(), INTERVAL 10 MINUTE) as B5,
 DATE_SUB(NOW(), INTERVAL 2 HOUR) as B6;
 
 SELECT DATEDIFF('2023-01-04', '2022-01-04');
 
 SELECT TIMESTAMPDIFF(HOUR, '2020-3-1', '2020-3-3') AS C1,
 TIMESTAMPDIFF(DAY, '2020-3-1', '2020-3-3') AS C2,
 TIMESTAMPDIFF(MONTH, '2020-2-1', '2020-6-3') AS C3,
 TIMESTAMPDIFF(YEAR, '2020-3-1', '2022-3-3') AS C4;
 
 SELECT LAST_DAY('2003-02-05'),LAST_DAY(NOW());
 
SELECT NOW(),
 EXTRACT(SECOND FROM NOW()),
 EXTRACT(MINUTE FROM NOW()),
 EXTRACT(HOUR FROM NOW()),
 EXTRACT(DAY FROM NOW()),
 EXTRACT(MONTH FROM NOW()),
 EXTRACT(YEAR FROM NOW()),
 EXTRACT(YEAR_MONTH FROM NOW());
 
 SELECT NOW(),
 DATE_FORMAT(NOW(),'%Y%m%d'),
 DATE_FORMAT(NOW(),'%Y/%m/%d'),
 DATE_FORMAT(NOW(),'%Y년%m월 %d일'),
 DATE_FORMAT(NOW(),'%H:%i:%S'),
 DATE_FORMAT(NOW(),'%Y');
 
 SELECT STR_TO_DATE('2020-03-04','%Y-%m-%d'),
 STR_TO_DATE('01,5,2013','%d,%m,%Y'),
 STR_TO_DATE('2020년03월05일','%Y년%m월%d일'),
 STR_TO_DATE('2020-03-04 12:23:32','%Y-%m-%d %H:%i:%S');
 
 -- 13. 단일행 함수 - 조건 함수
 -- case 문- 동등비교
 select empno, ename, sal, job , CASE job WHEN 'ANALYST' THEN sal * 1.1 
                                          WHEN 'CLERK' THEN sal * 1.2
                                          WHEN 'MANAGER' THEN sal * 1.3
                                          WHEN 'PRESIDENT' THEN sal * 1.4
                                          WHEN 'SALESMAN' THEN sal * 1.5
										  ELSE sal
								 END  as 실수령 
 from emp;
 
  SELECT empno, ename, sal,
						 CASE WHEN sal > 3500 THEN '이사급'
							  WHEN sal > 2500 THEN '과장급'
						      ELSE '사원급' 
                         END AS직급연봉
FROM emp;

 SELECT sal, IF(sal > 2500 , '과장이상급', '사원급')
 FROM emp;
 
 -- 14. 단일행 함수 - 변환함수
 select cast(10 as char), cast('10' as SIGNED INTEGER), cast(10 as float),
		cast('2024-11-25' as Date);
        
        
-- 15. 그룹함수
SELECT AVG(sal), MAX(sal), MIN(sal), SUM(sal)
 FROM emp
 WHERE job = 'SALESMAN';
 
  SELECT COUNT(*), COUNT(comm),
 AVG(comm), AVG(IFNULL(comm,0)),
 COUNT(deptno), COUNT(DISTINCT deptno)
 FROM emp;
 
  -- group by 컬럼명
  SELECT deptno as no, COUNT(*), 
          ROUND(AVG(sal)), 
          MIN(sal), 
          MAX(sal), 
          SUM(sal)
 FROM emp
 GROUP BY deptno;
 -- group by 별칭
   SELECT deptno as no, COUNT(*), 
          ROUND(AVG(sal)), 
          MIN(sal), 
          MAX(sal), 
          SUM(sal)
 FROM emp
 GROUP BY no;
 
  -- group by 컬럼순서
   SELECT deptno as no, COUNT(*), 
          ROUND(AVG(sal)), 
          MIN(sal), 
          MAX(sal), 
          SUM(sal)
 FROM emp
 GROUP BY 1;
 
  SELECT deptno, COUNT(*), ROUND(AVG(sal)), MIN(sal), MAX(sal), SUM(sal)
 FROM emp
 GROUP BY deptno
 ORDER BY SUM(sal) DESC;
 
  SELECT deptno, SUM(sal)
 FROM emp
 GROUP BY deptno
 HAVING SUM(sal) > 7000;
 
 SELECT deptno, SUM(sal)
 FROM emp
 WHERE sal > 1500
 GROUP BY deptno
 HAVING SUM(sal) > 7000;
 
 use testdb;
 desc dept;
 
-- 조인
-- 1. cross 조인
SELECT empno, ename, dname
 FROM emp CROSS JOIN dept;

-- 2. natural 조인
SELECT empno, ename, dname
 FROM emp NATURAL JOIN dept;

-- 일치하지 않은 40 부서는 누락됨
 SELECT empno, ename, dname, deptno
 FROM emp NATURAL JOIN dept;
 
 -- 별칭 사용
  SELECT empno, ename, dname, deptno
 FROM emp e NATURAL JOIN dept d;
 
  SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e NATURAL JOIN dept d;
 
 -- 검색조건 : where 절
SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e NATURAL JOIN dept d  -- 조인조건
 where dname = 'RESEARCH';       -- 검색조건  
 
 
-- using(공통컬럼)
SELECT empno, ename, dname, deptno
 FROM emp JOIN dept USING(deptno);
 
 SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e INNER JOIN dept d USING(deptno);
 
  SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e JOIN dept d USING(deptno)  -- 조인조건
 where dname = 'RESEARCH';       -- 검색조건 
 
 
 -- on 절
 select *
from emp e  join dept d ON e.deptno  =  d.deptno;

select empno, ename, dname, loc, e.deptno  -- on절에서는 공통컬럼 사용시 별칭 필수
from emp e  join dept d ON e.deptno  =  d.deptno;  -- 조인조건 명시

 SELECT empno, ename, dname, loc , sal, e.deptno
 FROM emp e JOIN dept d ON e.deptno = d.deptno -- 조인조건 명시
 WHERE sal > 2500;                             -- 검색조건 

-- 부등 
 select *
	 from emp e join salgrade s 
	      ON e.sal BETWEEN s.losal AND s.hisal;
          
 select empno, ename, sal, deptno, grade
	 from emp e join salgrade s 
	      ON e.sal BETWEEN s.losal AND s.hisal;
          
 select empno, ename, sal, deptno, grade
 from emp e join salgrade s 
 ON e.sal BETWEEN s.losal AND s.hisal  -- 조인 조건
 where sal > 2500;                     -- 검색 조건
	
-- emp와 dept 와 salgrade 조인
      select *
	  from emp e join dept d using(deptno) -- equi 조인
	           join salgrade s on e.sal BETWEEN s.losal AND s.hisal; -- non-equi조인
               
  select *
	  from emp e join dept d ON e.deptno  =  d.deptno  -- equi 조인
	           join salgrade s on e.sal BETWEEN s.losal AND s.hisal;
               
-- self 조인
SELECT e.ename 사원, m.ename 관리자
FROM emp e JOIN emp m ON e.mgr = m.empno;

-- outer 조인
 SELECT empno, ename, dname, d.deptno
 FROM emp e RIGHT OUTER JOIN dept d ON e.deptno = d.deptno;
 
SELECT empno, ename, dname, d.deptno
 FROM emp e LEFT OUTER JOIN dept d ON e.deptno = d.deptno;
 
 --  신입사원
 insert into emp (empno, ename,job,mgr,hiredate,sal,comm,deptno)
 values ( 9000, '홍길동', 'SALESMAN', 7499, NOW(), 700, 0, null );
 commit;
  -- inner 조인이기 때문에 각각 하나씩 누락됨.
  SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e INNER JOIN dept d USING(deptno);
  -- 누락된 홍길동 포함
 SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e LEFT OUTER JOIN dept d USING(deptno);
 
  -- 누락된 40 포함
   SELECT e.empno, e.ename, d.dname, e.deptno
 FROM emp e RIGHT OUTER JOIN dept d USING(deptno);
 
 -- 서브쿼리
 -- 서브쿼리 적용전
 use testdb;
    select sal
	 from emp
	 where ename='SCOTT';
     
  select *
	 from emp
	 where sal > 3000;
     
-- 서브쿼리 적용후
     select *
	 from emp
	 where sal > ( select sal
	               from emp
	               where ename='SCOTT');
     

SELECT empno, ename, job, sal
 FROM emp
 WHERE job = ( SELECT job
 FROM emp
 WHERE empno = 7521 )
 AND
 sal > ( SELECT sal
 FROM emp
 WHERE empno = 7934 );
 


SELECT deptno, MIN(sal)
 FROM emp
 GROUP BY deptno
 HAVING MIN(sal) > ( SELECT MIN(sal)
 FROM emp
 WHERE deptno = 20 );
 
 -- 복수행
  SELECT empno, ename, job, hiredate, sal, deptno
 FROM emp
 WHERE sal IN ( SELECT MIN(sal)
               FROM emp
               GROUP BY job );
               
select avg(sal)
	                  from emp
			  group by deptno;
              
SELECT empno
 FROM emp
 WHERE comm IS NOT NULL;
 
 SELECT empno, ename, job, hiredate, sal, deptno
 FROM emp
 WHERE EXISTS ( SELECT empno
			    FROM emp
                WHERE sal > 10000 );
                
SELECT empno
			    FROM emp
                WHERE sal > 10000;
                
-- 다중 컬럼
SELECT deptno, empno, ename, sal
 FROM emp
 WHERE (deptno, sal ) IN ( SELECT deptno, MAX(sal)
                          FROM emp
                          GROUP BY deptno);
                          
-- 인라인 뷰
   select e.deptno, sum(sal), round(avg(sal)), count(*)
	  from emp e join dept d ON e.deptno = d.deptno
	  group by deptno
	order by 1;
    
 SELECT deptno, SUM(sal) total_sum, ROUND(AVG(sal)) total_avg,COUNT(*) cnt
 FROM emp
 GROUP BY deptno;
 
  SELECT e.deptno, total_sum, total_avg, cnt
 FROM ( SELECT deptno, SUM(sal) total_sum, ROUND(AVG(sal)) total_avg,
 COUNT(*) cnt
 FROM emp
 GROUP BY deptno) e JOIN dept d ON e.deptno = d.deptno
 order by 1;
 
 
 
 -- mysql 트랜잭션 처리 여부
 show variables like 'autocommit%';
 set Autocommit = false;
 
 INSERT INTO dept (deptno, dname, loc )
 VALUES (90, '인사과','서울');
 INSERT INTO dept (deptno, dname ) # loc 컬럼에 null 저장
VALUES (91, '인사과');
 INSERT INTO dept (loc, dname, deptno )
 VALUES ('서울', '인사과', 80);
  INSERT INTO dept
 VALUES (70, '인사과','서울');
 rollback; -- 취소
 commit; -- DB 반영
 select * from dept;
 
 SELECT empno, ename, sal FROM emp
 WHERE 1=1;
 
 -- 레코드 포함한 형태의 새로운 테이블 생성
 CREATE TABLE copy_emp2
 AS
 SELECT empno, ename, sal FROM emp;
 
 -- 레코드 포함하지 않은 형태의 새로운 테이블 생성
 CREATE TABLE copy_emp
 AS
 SELECT empno, ename, sal FROM emp
 WHERE 1=2;
 -- 다중행 생성1- subquery 이용
  INSERT INTO copy_emp (empno, ename, sal)
 SELECT empno, ename, sal
 FROM emp;
 commit;
 select * from copy_emp;
 
 -- 다중행 생성2 - value list 이용
 INSERT INTO copy_emp (empno, ename, sal)
values ( 100,'홍길동1',400),( 101,'홍길동2',400),( 102,'홍길동3',400);
commit;

-- update
UPDATE dept
SET dname='경리과', loc='부산';
rollback;

 UPDATE dept
 SET dname='경리과', loc='부산'
 WHERE deptno=90;
 commit;
select * from dept;
select dname from dept where deptno=20;

-- 에러
 UPDATE dept
    SET dname=(select dname from dept where deptno=20), 
        loc=(select loc from dept where deptno=20)
    WHERE deptno=90;
    
-- 해결
      UPDATE  dept , 
             (select dname from dept where deptno=20) as x ,
             (select loc from dept where deptno=20) as x2
    SET dept.dname= x.dname, 
        dept.loc= x2.loc
    WHERE deptno=90;
 commit;