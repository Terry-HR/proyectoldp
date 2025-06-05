class Tarjeta(private var idT: Int, private var tipoTarjeta: Int, private var saldo: Double){

  def getId: Int = idT;
  def setId(n: Int): Unit = idT = n;

  def getTipoTarjeta: Int = tipoTarjeta;
  def setTipoTarjeta(n: Int): Unit = tipoTarjeta = n;

  def getSaldo: Double = saldo;
  def setSaldo(n: Double): Unit = saldo = n;
}