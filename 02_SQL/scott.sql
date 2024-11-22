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