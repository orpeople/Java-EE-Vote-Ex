package dao;

import java.util.List;

import model.T_VOTE;

public interface T_VoteDao {
	//create
	
	
	//read
	List<T_VOTE> queryAll();
	
	
	//update
	void update(String teacherNo);
	
	
	
	//delete

}
