package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.gui.LoginTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({LoginTest.class
})

public class JUnit4Runner {
}
