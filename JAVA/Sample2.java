import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class Sample2 {

	@Mock
	List<String> mockList;
	//@BeforeEach
	public void setup() {
		//fail("Not yet implemented");
		MockitoAnnotations.initMocks(this);
		
	}
	@SuppressWarnings("unchecked")
	@Test
public void test() {
		System.out.println("hi");
		when(mockList.get(0)).thenReturn("Sample");
		assertEquals("Sample", mockList.get(0));
		System.out.println("World");
	}
}
