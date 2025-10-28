package k12

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test

private lateinit var main: TestScope

class CoroutinesUt {

  //private lateinit var testDispatcher: StandardTestDispatcher
  // private lateinit var testScope: TestScope

//   @Before
//   fun setup() {
//      // created per-test in setup to keep isolation
//      val testDispatcher = StandardTestDispatcher()
//      val testScope = TestScope()
//      Dispatchers.setMain(dispatcher = testDispatcher)
//      // note: do not call setMain here if you want to use the test scheduler from runTest;
//      // alternatively setMain inside runTest using the same testScheduler (shown below)
//   }

//   @After
//   fun tearDown() {
//      // ensure main is reset after test (safe even if not set)
//      Dispatchers.resetMain()
//   }

   @Test
   fun testCoroutineLaunch() = runTest {
      val testDispatcher = StandardTestDispatcher()
      val testScope = TestScope()

      // Act
      val job = coroutineLaunch(scope = testScope)
      job.join()
      // Assert
      val x = 42

      Dispatchers.resetMain()
   }

}