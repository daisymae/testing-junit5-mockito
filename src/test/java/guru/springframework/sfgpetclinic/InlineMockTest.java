package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * creates a mock using the Mockito static 'mock' method
 */
public class InlineMockTest {

  @Test
  void testInlineMock() {
    // this is creating a mock of Map class
    Map mapMock = mock(Map.class);

    assertEquals(mapMock.size(), 0);
  }
}
