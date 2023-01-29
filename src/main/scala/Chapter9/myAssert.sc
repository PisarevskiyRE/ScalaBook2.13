val assertionsEnabled = true

def myAssert(predicate: => Boolean) = {
  if (assertionsEnabled && !predicate)
    throw new AssertionError()
}

myAssert(5 < 3)