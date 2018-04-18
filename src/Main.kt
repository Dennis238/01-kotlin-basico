import javax.print.attribute.IntegerSyntax

fun sumarDosNumeros(numeroUno: Int, numeroDos: Int):
        Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hello, world!")
    println(sumarDosNumeros(1, 2)) //no hace falta poner los nombres de las
    //variables, solo los números
    var nombre: String? = "Dennis"
    var edad: Int = 28
    val edadActual = 28 //val no permite ser modificado (similar a let)
    var casado = false
    casado = true //duck typing, al omitir el tipo de variable
    //edadActual = 29
    nombre = null

    when (casado) {
        true -> {
            println("Está casado")
        }
        null -> {
            println("Aún no está asignado")
        }
        else -> {
            print("No está casado")
        }
    }
    val superHeroe = if (casado) {
        "SuperMandarina"
    } else {
        "Superman"
    }
    //template strings
    println("SuperHeroe:${superHeroe}")

    var dennis = Persona(Integer(28), "Dennis")
    println(adrian.toString())

    }
    class Persona {
        lateinit var edadActual: Integer //debe ponerse Integer en vez de int, porque debe ser //primitivo, lateinir sirve para explicar que ya sera inicializada en el algun momento
        var nNombre: String

        //constructor(edad:Any)
        constructor(edad: Int, nombre: String) {
            nNombre = nombre
        }

        fun iniciar(edad: Int) {
            edadActual = edad
        }

        override fun toString(): String {
            return "La edad actual es $edadActual y " +
                    "el nombre es $nombre"

        }
    }
        class Persona2(edad: Int, nombre: String) {
            var nEdad = edad
            var nNombre = nombre
            var nCedula: String? = null
            var nCasado: Boolean? = null

            constructor(edad2: Integer, nombre: String, //este constructor hace que cedula no sea obligatoriamente requerido
                        cedula: String) : this(edad2, nombre2) {
                nCedula = cedula
            }

            constructor(edad2: Integer, nombre: String, //este constructor hace que cedula no sea obligatoriamente requerido
                        cedula2: String, casado: Boolean) : this(edad3, nombre3) {
                nCedula = cedula2
                nCasado = casado
            }

            fun iniciar(edad: Int, nombre: String) {
                edadActual = edad
            }
            override fun toString(): String {
                return "La edad actual es $nEdad y " +
                        "el nombre es $nNombre"

            }
        }

        class Persona3(edad:Int nombre: String) {
            lateinit var nEdad: Integer
            var nNombre = nombre

            init {//Escribir código después del constructor
                iniciar(edad)
            }
            fun iniciar(edad: Int, nombre: String) {//El constructor se inicia siempre primero, después el init
                nEdad = edad
            }

            override fun toString(): String {
                return "La edad actual es $nEdad y " +
                        "el nombre es $nNombre"

            }

        }

        open class Figura(nombre: String) {
            val nNombre = nombre

            fun iniciar(nombre: String) {//El constructor se inicia siempre primero, después el init
                nombre=nombre
            }
            override fun toString(): String {
                return "La nombre es $nNombre"

            }
        }

        class Cuadrado(nombre: String, valorLado: Integer)
            : Figura(nombre) { //se llama al primer constructor (herencia)
            var nValorLado = valorLado

            fun iniciar(nombre: String) {//El constructor se inicia siempre primero, después el init
                nombre=nombre
            }
            override fun toString(): String {
                return "La valor del lado es $nValorLado y " +
                        "el nombre es $nombre"

            }
        }
