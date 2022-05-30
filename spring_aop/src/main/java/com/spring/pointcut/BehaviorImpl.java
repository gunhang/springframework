package com.spring.pointcut;

public class BehaviorImpl implements Behavior {
	@Override
	public void 잠자기() {
		String 오 = "잠자기";
		System.out.println(오);
	}
	@Override
	public void 공부하기() {
		String a = "공부하기";
		System.out.println(a);
	}
	@Override
	public void 밥먹기() {
		String a = "밥먹기";
		System.out.println(a);
	}
	@Override
	public void 데이트() {
		String a = "데이트";
		System.out.println(a);
	}
	@Override
	public void 운동() {
		String a = "운동";
		System.out.println(a);
	}
	@Override
	public void 놀기() {
		String a = "놀기";
		System.out.println(a);
	}
	@Override
	public void 정신수양() {
		String a = "정신수양";
		System.out.println(a);
	}
}
