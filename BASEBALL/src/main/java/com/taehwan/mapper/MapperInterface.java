package com.taehwan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.taehwan.beans.JdbcBean;

public interface MapperInterface {
	
	@Insert("INSERT INTO baseball(team_name) VALUES (#{team_name})")
	public void insert_data(JdbcBean bean);
	
	@Select("SELECT team_name, play_total, win, lose, same, winpoint, difference, recentten, conti, home, visit FROM baseball")
	List<JdbcBean> select_data();
	
	@Delete("DELETE FROM baseball WHERE team_name= #{team_name}")
	void delete_data(String team_name);
	
	@Update("UPDATE baseball SET team_name = #{team_name} WHERE team_name=#{team_name}")
	public void update_data(JdbcBean bean);
}
