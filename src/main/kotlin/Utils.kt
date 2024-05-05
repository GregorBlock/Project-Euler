import kotlin.io.path.Path
import kotlin.io.path.readLines

fun readInput(name: String) = Path("src/main/resources/input/$name.txt").readLines()