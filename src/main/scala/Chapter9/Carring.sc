def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1,2)

def carriedSum(x: Int)(y: Int) = x + y
carriedSum(1)(2)
def test = carriedSum(1)(_)

test(2)

def first(x: Int) = (y: Int) => x + y
val second = first(1)
second(2)