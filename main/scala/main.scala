import scala.io.StdIn._

object PagoJustoPasaje {
  def main(args: Array[String]): Unit = {
    println("=== Cálculo del Pago Justo del Pasaje ===")

    print("Ingrese la distancia a recorrer (en km): ")
    val distancia = readDouble()

    val tarifaBase = 1.50
    val kmBase = 5
    val costoPorKmExtra = 0.30

    val pago = if (distancia <= kmBase) {
      tarifaBase
    } else {
      val kmExtra = distancia - kmBase
      tarifaBase + (kmExtra * costoPorKmExtra)
    }

    println(f"Distancia: $distancia%.2f km")
    println(f"Total a pagar: S/. $pago%.2f")
  }
}