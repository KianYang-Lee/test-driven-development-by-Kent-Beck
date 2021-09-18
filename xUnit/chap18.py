"""
============================= NOTE: FIRST STEPS TO xUNIT =======================
* invoke testMethod

At the end of this chapter, the following are accomplished:
- Implemented functionality, by first hardwiring it, then making it more general
    by replacing constants with variables
- Used Pluggable Selector, which we promise not to use again because it makes
    code hard to analyze statically
- Bootstrapped our testing framework, all in tiny steps 
"""
class TestCase:
    def __init__(self, name) -> None:
        self.name = name

    # General pattern of refactoring: take code that works in one instance and 
    #   generalize it to work in many by replacing constants with variables
    def run(self):
        method = getattr(self, self.name)
        method()



# Subclass of TestCase (inheritance)
class WasRun(TestCase):
    # Constructor
    def __init__(self, name) -> None:
        self.wasRun = None
        TestCase.__init__(self, name)
        # super().__init__(name) # Python 3.X syntax

    def testMethod(self):
        self.wasRun = 1

class TestCaseTest(TestCase):
    def testRunning(self):
        test = WasRun("testMethod")
        assert(not test.wasRun)
        test.run()
        assert(test.wasRun)
        

# ============================= TEST CASE =====================================
# # Invoke test method manually as Python executes statements as it reads a file
# test = WasRun("testMethod")
# print(test.wasRun)
# test.run()
# print(test.wasRun)

# # Use real interface, run() instead of calling test method directly
# test = WasRun("testMethod")
# print(test.wasRun)
# test.run()
# print(test.wasRun)

# Even simpler
TestCaseTest("testRunning").run()
