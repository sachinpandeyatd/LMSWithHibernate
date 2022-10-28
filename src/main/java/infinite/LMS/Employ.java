package infinite.LMS;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employ {
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int empId;
	
	@Column(name="EMP_NAME")
	private String name;
	
	@Column(name="EMP_MAIL")
	private String email;
	
	@Column(name="EMP_MOB_NO")
	private String mob;
	
	@Column(name="EMP_DT_JOIN")
	private Date doj;
	
	@Column(name="EMP_DEPT")
	private String dept;
	
	@Column(name="EMP_MANAGER_ID", columnDefinition=" default '0' ")
	private Integer mId;
	
	@Column(name="EMP_AVAIL_LEAVE_BAL")
	private int leaveAvail;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = (mId == null) ? 0 : mId;
	}
	public int getLeaveAvail() {
		return leaveAvail;
	}
	public void setLeaveAvail(int leaveAvail) {
		this.leaveAvail = leaveAvail;
	}
}
