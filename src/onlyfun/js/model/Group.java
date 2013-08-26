package onlyfun.js.model;

/**
 * @Description : 部门下的“组”
 * @Creator Justin
 * @Create date : 2013-08-23 5:53:19 PM
 */
public class Group {
	private Long id;
	//小组名称
	private String groupName;
	private Long departmentId;
	//经理id
	private Long managerId;
	private String remark;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
}
