/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import paddle.*;



public class TestPaddle {
  @Test public void testSomeLibraryMethod() throws Exception {

    ServerState c = new ServerState();

    Server p1 = new Server( c, Integer.valueOf(8080) );
    Server p2 = new Server( c, Integer.valueOf(8081) );
    Server p3 = new Server( c, Integer.valueOf(8082) );

    // assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());


  }

}
