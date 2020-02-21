package com.taehwan.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component //개발자가 직접 클래스를 등록할 때 @Component 어노테이션을 사용한다.
@Scope("prototype")
//VO, DTO part.
//Must matching with field variable and Column Name
public class JdbcBean {
	private String team_name;
	private int play_total;
	private int win;
	private int lose;
	private int same;
	private int playwinpoint;
	private int difference;
	private String recentten;
	private String conti;
	private String home;
	private String visit;
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getPlay_total() {
		return play_total;
	}
	public void setPlay_total(int play_total) {
		this.play_total = play_total;
	}

	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getSame() {
		return same;
	}
	public void setSame(int same) {
		this.same = same;
	}
	public int getPlaywinpoint() {
		return playwinpoint;
	}
	public void setPlaywinpoint(int playwinpoint) {
		this.playwinpoint = playwinpoint;
	}
	public int getDifference() {
		return difference;
	}
	public void setDifference(int difference) {
		this.difference = difference;
	}
	public String getRecentten() {
		return recentten;
	}
	public void setRecentten(String recentten) {
		this.recentten = recentten;
	}
	public String getConti() {
		return conti;
	}
	public void setConti(String conti) {
		this.conti = conti;
	}

	public String getVisit() {
		return visit;
	}
	public void setVisit(String visit) {
		this.visit = visit;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	

}
