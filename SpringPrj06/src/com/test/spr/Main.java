/*======================================
 	Main.java
 	- main() 메소드가 포함된 테스트 클래스
======================================*/

package com.test.spr;

import java.lang.reflect.Proxy;

public class Main
{
	public static void main(String[] args)
	{
		// 주 업무 실행을 할 수 있는 객체 준비
		// 인터페이스 변수 = new 인터페이스구현클래스();
		// List list = new ArrayList(); 	--> (업캐스팅)
		Calculator cal = new CalculatorImpl();
		
		// 주 업무 실행에 대한 테스트
		// ------------------------------------------------ → AOP 기법 적용 전
		/*
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		*/
		
		
		// 주 업무 실행에 대한 테스트
		// ------------------------------------------------ → AOP 기법 적용 후
		
		//Proxy.newProxyInstance	→ static 메소드
		//		( //-- loader 		: 주 업무 실행 클래스에 대한 정보 전달(제공)				→ cal.getClass().getClassLoader()
		//		, //-- interfaces	: 주 업무 실행 클래스의 인터페이스에 대한 정보 전달(제공)	→ cal.getClass().getInterfaces()
		//		, //-- h			: 보조 업무 실행 클래스에 대한 정보 전달(제공);			→ new CalculatorProxy(cal)        → 생성자에게 타겟행세하라
		//												↓
		//Proxy.newProxyInstance(cal.getClass().getClassLoader(), cal.getClass().getInterfaces(), new CalculatorProxy(cal));
		// 가짜인데 진짜 행세하는 구문 → Object 타입
		//												↓
		Calculator proxy = (Calculator)Proxy.newProxyInstance(cal.getClass().getClassLoader(), cal.getClass().getInterfaces(), new CalculatorProxy(cal));
		// Calculator타입으로 다운 캐스팅
		
		int add = proxy.add(10, 20);
		System.out.println(add);
		
		int sub = proxy.sub(10, 20);
		System.out.println(sub);
		
		int multi = proxy.multi(10, 20);
		System.out.println(multi);
		
		int div = proxy.div(10, 20);
		System.out.println(div);
	}
}
