package org.joy.diEx080;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseBall {
	public static void main(String [] args){
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:beanDiEx080.xml");
		Player player1 = ctx.getBean("player1", Player.class);
		System.out.println("선수이름 :"+player1.getName());
		System.out.println("나이 :"+player1.getAge());
		System.out.println("포지션 :"+player1.getPosition());
		System.out.println("신장 :"+player1.getHeight());
		System.out.println("몸무게 :"+player1.getWeight());
		
		System.out.println("=============================");
		
		Player player2 = ctx.getBean("player2", Player.class);
		System.out.println("선수이름 :"+player2.getName());
		System.out.println("나이 :"+player2.getAge());
		System.out.println("포지션 :"+player2.getPosition());
		System.out.println("신장 :"+player2.getHeight());
		System.out.println("몸무게 :"+player2.getWeight());
		
		ctx.close();
	}
}
