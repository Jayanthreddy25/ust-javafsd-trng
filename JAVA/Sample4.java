import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Sample4 {

	@Test
	 public void test() {
	//	fail("Not yet implemented");
		
		
		List<String> list = new ArrayList<>();
		List<String> spyOnList = spy(list);
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10, spyOnList.size());
		
		
		spyOnList.add("hamanth");
		spyOnList.add("hanish");
		assertEquals("hamanth", spyOnList.get(0));
		assertEquals("hanish", spyOnList.get(1));
	}

}
