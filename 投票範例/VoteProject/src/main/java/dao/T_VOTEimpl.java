package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.T_VOTE;

public class T_VOTEimpl implements T_VoteDao{

	public static void main(String[] args) {
		List<T_VOTE> l=new T_VOTEimpl().queryAll();
		
		for(T_VOTE t:l)
		{
			System.out.println("id:"+t.getId()+
					"\tno"+t.getTeacherNo()+
					"\tname:"+t.getTeacherName()+
					"\tvote:"+t.getVote());
		}

	}

	@Override
	public List<T_VOTE> queryAll() {
		Connection conn=DbConnection.getDb();
		String SQL="select * from T_VOTE";
		List<T_VOTE> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				T_VOTE t=new T_VOTE();
				t.setId(rs.getInt("id"));
				t.setTeacherNo(rs.getString("teacherNo"));
				t.setTeacherName(rs.getString("teacherName"));
				t.setVote(rs.getInt("vote"));
				
				l.add(t);
			}
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public void update(String teacherNo) {
		Connection conn=DbConnection.getDb();
		String SQL="update T_VOTE set vote=vote+1 where teacherNo=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,teacherNo);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
