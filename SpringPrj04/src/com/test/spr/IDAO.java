/*================
 	IDAO.java
 	- 인터페이스
================*/

package com.test.spr;

import java.sql.SQLException;
import java.util.List;

public interface IDAO
{
	// (추상메소드 형태로) 메소드 선언
	public List<MemberDTO> list() throws ClassNotFoundException, SQLException;
}
