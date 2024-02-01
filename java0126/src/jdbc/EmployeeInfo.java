package jdbc;

import java.io.Serializable;

public class EmployeeInfo implements Serializable{
	int empno;
	String ename;
	double sal;
	
	public EmployeeInfo(int empno, String ename, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}
