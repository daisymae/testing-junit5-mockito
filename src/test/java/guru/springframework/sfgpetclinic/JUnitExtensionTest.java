package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * uses a JUnit5 extension for Mockito
 * With the extension, don't need the @BeforeEach to initialize the mocks
 */
@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
  @Mock
  Map<String, Object> mapMock;

  @Test
  void testMock() {
    mapMock.put("keyvalue", "foo");
  }
}
