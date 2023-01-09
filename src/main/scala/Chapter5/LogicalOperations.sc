1 > 2
1 < 2
'a' == 'A'

val toBe = true
val question = toBe || !toBe
val paradox = toBe && !toBe
toBe | !toBe
toBe & !toBe

def salt() = { println("salt"); false}
def papper() = {println("papper"); true}

papper() && salt()
salt() && papper()

// обе части вызываются
papper() & salt()
salt() & papper()