package Testing1;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mockito2 {
	
	@Mock
	List<String> mockList;
	
	@Before
	public void initialize() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		when(mockList.get(0)).thenReturn("vishnu");
		assertEquals("vishnu",mockList.get(0));
		
	}

}
