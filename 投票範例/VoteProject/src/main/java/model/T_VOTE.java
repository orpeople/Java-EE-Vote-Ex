package model;

public class T_VOTE {
	private Integer id;
	private String teacherNo;
	private String teacherName;
	private Integer vote;
	public T_VOTE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_VOTE(String teacherNo, String teacherName, Integer vote) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.vote = vote;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Integer getVote() {
		return vote;
	}
	public void setVote(Integer vote) {
		this.vote = vote;
	}
	

}
