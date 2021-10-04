package com.lti;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dao.UserDao;
import com.lti.dao.VehicleDao;

@SpringBootTest
class GeneralInsuranceIiApplicationTests {
	@Autowired
	VehicleDao vehicledao;
	
	@Autowired
	UserDao userdao;
	
	@Test
	public void isVehiclePresent() {
		boolean res=vehicledao.isVehiclePresent("MH 05 AD 4269");
		assertEquals(res, true);
	}
	
	@Test
	public void isUserPresent() {
		boolean res=userdao.isUserPresent("madypharande@gmail.com");
		assertEquals(res, true);
	}
	@Test
	public void isVehiclePresent1() {
		boolean res=vehicledao.isVehiclePresent("MH 07 AD 9645");
		assertEquals(res, true);
	}
	
	@Test
	public void isUserPresent1() {
		boolean res=userdao.isUserPresent("mad@gmail.com");
		assertEquals(res, true);
	}
	@Test
	public void isVehiclePresent2() {
		boolean res=vehicledao.isVehiclePresent("MH 05 AD 5689");
		assertEquals(res, true);
	}
	
	@Test
	public void isUserPresent2() {
		boolean res=userdao.isUserPresent("gulabk@gmail.com");
		assertEquals(res, true);
	}
	@Test
	public void isVehiclePresent3() {
		boolean res=vehicledao.isVehiclePresent("MH 00 AD 4206");
		assertEquals(res, true);
	}
	
	@Test
	public void isUserPresent3() {
		boolean res=userdao.isUserPresent("tipendrag@gmail.com");
		assertEquals(res, true);
	}
	@Test
	public void isVehiclePresent4() {
		boolean res=vehicledao.isVehiclePresent("MH 00 AD 5978");
		assertEquals(res, true);
	}
	
	@Test
	public void isUserPresent4() {
		boolean res=userdao.isUserPresent("sonalikabhd@gmail.com");
		assertEquals(res, true);
	}
	
}
