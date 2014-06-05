package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Resta;

public class PruebaResta {
	//Instanciar la clase resta:
	Resta res=new Resta();
	

	@Before
	public void setUp() throws Exception {
		//configuro las variables de resta:
		res.setA(20);
		res.setB(8);
		
	}

	@Test
	public void test() {
		assertEquals(12,res.resta());
		
	}

}
