package com.taehwan.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.taehwan.beans.JdbcBean;
import com.taehwan.config.BeanConfigClass;
import com.taehwan.mapper.MapperInterface;

public class MainClass {

	public static Scanner sc = new Scanner(System.in);
	public static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			BeanConfigClass.class);
	public static MapperInterface mapper = context.getBean("test_mapper", MapperInterface.class);

	public static String ranking() {
		//JdbcBean rank = new JdbcBean();
		List<JdbcBean> list1 = mapper.select_data();
		int RANK = 0;
		
		String winner = null;
		
		for (JdbcBean bean1 : list1) {
			if(bean1.getWin() >= RANK) {
				RANK = bean1.getWin();
				winner=bean1.getTeam_name();
			}
		}
		return winner;
	}
	
	public static void SELECT() {
		// SELECT
		List<JdbcBean> list1 = mapper.select_data();
		for (JdbcBean bean1 : list1) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■ @ 순위          : " + ranking());
			System.out.println("■ @ 팀이름       : " + bean1.getTeam_name());
			System.out.println("■ @ 총경기       : " + bean1.getPlay_total());
			System.out.println("■ @ 승             : " + bean1.getWin());
			System.out.println("■ @ 패             : " + bean1.getLose());
			System.out.println("■ @ 무             : " + bean1.getSame());
			System.out.println("■ @ 승점          : " + bean1.getPlaywinpoint());
			System.out.println("■ @ 차이          : " + bean1.getDifference());
			System.out.println("■ @ 전적          : " + bean1.getRecentten());
			System.out.println("■■■■■■■■■■■■■■■■■■■■");
		}
	}

	public static void INSERT() {
		// INSERT
		JdbcBean bean2 = new JdbcBean();
		bean2.setTeam_name(sc.next());
		mapper.insert_data(bean2);
	}

	public static void UPDATE() {
		// UPDATE
		JdbcBean bean3 = new JdbcBean();
		bean3.setTeam_name(sc.next());
		bean3.setTeam_name("TTTTT");
		mapper.update_data(bean3);
	}

	public static void DELETE() {
		// DELETE
		mapper.delete_data(sc.next());
	}

	public static void main(String[] args) {
		System.out.println("■■■■■■■■■■■■■■■■■■■");
		System.out.println("■야구 팀 순위 관리 프로그램 ■");
		System.out.println("■     1. 조회              ■");
		System.out.println("■     2. 삽입              ■");
		System.out.println("■     3. 수정              ■");
		System.out.println("■     4. 삭제              ■");
		System.out.println("■■■■■■■■■■■■■■■■■■■");

		int JOYSTICK;
		JOYSTICK = sc.nextInt();

		switch (JOYSTICK) {
		case 1:
			SELECT();
			break;
		case 2:
			INSERT();
			break;
		case 3:
			UPDATE();
			break;
		case 4:
			DELETE();
			break;
		}
		context.close();
	}
}
