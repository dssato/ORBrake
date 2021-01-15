package net.sf.openrocket.ORBrake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ORBrakeTest {
	
	static ORBrakeSimulationListener listener;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		listener = new ORBrakeSimulationListener();
	}

//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}

	@BeforeEach
	void setUp() throws Exception {
		listener.velocity = 300;
		listener.altitude = 3000;
	}

//	@AfterEach
//	void tearDown() throws Exception {
//	}

	@Test
	void dragSurfaceTest() {
		assertEquals(listener.dragSurface(5), 5555, .0001);
	}
}