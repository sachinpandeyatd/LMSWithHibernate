package infinite.LMS;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_history")
public class Leave {
	@Id
	@Column(name="LEAVE_ID")
	private int leaveId;
	
	@Column(name="LEAVE_NO_OF_DAYS")
	private Integer noOfDays;
	
	@Column(name="LEAVE_MNGR_COMMENTS")
	private String mgrCmt;
	
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="LEAVE_START_DATE")
	private Date leaveStartDate;
	
	@Column(name="LEAVE_END_DATE")
	private Date leaveEndDate;
	
	@Column(name="LEAVE_STATUS")
	private String leaveStatus;
	
	@Column(name="LEAVE_TYPE")
	private String leaveType;
	
	@Column(name="LEAVE_REASON")
	private String leaveReason;
	
	
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public Integer getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getMgrCmt() {
		return mgrCmt;
	}
	public void setMgrCmt(String mgrCmt) {
		this.mgrCmt = mgrCmt;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
}
