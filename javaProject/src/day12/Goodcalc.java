package day12;

import review_day2.ArrayFunc;

public class Goodcalc extends Calculator{

	@Override //오버라이딩으로 구현함
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		return ArrayFunc.avg(a);
	}

}
