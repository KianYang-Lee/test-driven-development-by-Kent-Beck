"""
============================= NOTE: SET THE TABLE =======================
* invoke setUp first

For TDD, there are three As for writing tests (by Bill Wake):
- Arrange: create some objects
- Act: stimulate them
- Assert: check the results

Arrange is often the same from test to test, while act and assert are unique.
Eg. 7 and 9 (ARRANGE). We can add, subtract, multiply (ACT) and
each operation would result in different results (ASSERT)

There exists constraints between:
- Performance : the more objects are created, the poorer the code performance
- Isolation : the more objects are shared among test cases, it is more
    difficult to isolate them

Avoid test coupling at all cost, as breaking one test causes the next
ten to fail even though the code is correct.

At the end of this chapter, the following are accomplished:
- Simplicity of test writing was more important than performance
    for the moment
- Tested and implemented setUp()
- Used setUp() to simplify the example test case
- Used setUp() to simplify the test cases checking the example
    test case
"""
class TestCase:
    def __init__(self, name) -> None:
        self.name = name

    def setUp(self):
        pass

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()


class WasRun(TestCase):
    def __init__(self, name) -> None:
        self.wasRun = None
        super().__init__(name) # Python 3.X syntax

    def testMethod(self):
        self.wasRun = 1

    def setUp(self):
        self.wasRun = None
        self.wasSetUp = 1

class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")
    def testRunning(self):
        self.test.run()
        assert(self.test.wasRun)
        
    def testSetUp(self):
        self.test.run()
        assert(self.test.wasSetUp)

# ============================= TEST CASE =====================================
TestCaseTest("testRunning").run()
TestCaseTest("testSetUp").run()