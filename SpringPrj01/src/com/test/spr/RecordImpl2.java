/*==================================================
 	RecordImpl2.java
 	- 클래스
 	- Record 인터페이스를 구현하는 클래스
 	- RecordImpl1 에 적용된 업무와 차별화된 업무 수행
==================================================*/

package com.test.spr;

public class RecordImpl2 implements Record
{
	// 주요 속성 구성
		private int kor, eng, mat;

		// Record 의 메소드 모두 재정의
		@Override
		public void setKor(int kor)
		{
			this.kor = kor;
		}

		@Override
		public int getKor()
		{
			return kor;
		}

		@Override
		public void setEng(int eng)
		{
			this.eng = eng;
		}

		@Override
		public int getEng()
		{
			return eng;
		}

		@Override
		public void setMat(int mat)
		{
			this.mat = mat;
		}

		@Override
		public int getMat()
		{
			return mat;
		}

		@Override
		public int getTotal()
		{
			int result = 0;
			
			// 기본 점수(100) 추가
			result = 100 + this.getKor() + this.getEng() + this.getMat();
			
			return result;
		}

		@Override
		public double getAvg()
		{
			double result = 0;
			
			// 기본 점수(100점)가 포함된 상태에서의 평균 처리
			result = this.getTotal() / 4.0;
			
			return result;
		}
}
