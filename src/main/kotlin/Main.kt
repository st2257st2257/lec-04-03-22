package demos

import java.nio.file.Files
import java.nio.file.Path
import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.PI

// import kotlin.io.path.Path

fun integrate(f:(Double)->Double, range: ClosedRange<Double>, npoint: Int = 100): Double {
    val points: DoubleArray = DoubleArray(npoint) { i ->
        range.start + i *(range.endInclusive - range.start)/(npoint-1)
    }
    return points.sumOf{f(it)}*(range.endInclusive - range.start)/(npoint)
}


fun main(args: Array<String>) {
    val res = integrate({x -> sin(x) }, 0.0..PI)
    println("Res_int: $res")

    val myFile: Path = Files.createTempFile("ks_demo", ".txt")


    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

