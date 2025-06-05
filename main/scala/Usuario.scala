class Usuario(private var dni: Int, private var nombre: String) {
  def getDni: Int = dni;
  def setDni(n: Int): Unit = dni = n;

  def getNombre: String = nombre;
  def setDni(n: String): Unit = nombre = n;
}