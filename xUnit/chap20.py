"""
============================= NOTE: CLEANING UP AFTER =======================
* invoke tearDown afterwards

For TDD, there are three As for writing tests (by Bill Wake):
- Arrange: create some objects
- Act: stimulate them
- Assert: check the results

At the end of this chapter, the following are accomplished:
- 
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