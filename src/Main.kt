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
    var edad: Int = 21
    val edadActual = 21//val no permite ser modificado (similar a let)
    var casado = false
    casado = true //duck typing, al omitir el tipo de variable
    //edadActual = 29
    //nombre = null

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
    println(dennis.toString())
    var dennis2 = Persona2(Integer(28), "Dennis")
    println(dennis2.toString())
    var dennis3 = Persona3(Integer(28), "Dennis")
    println(dennis3.toString())

    }
    class Persona {
        lateinit var edadActual: Integer //debe ponerse Integer en vez de int, porque debe ser //primitivo, lateinir sirve para explicar que ya sera inicializada en el algun momento
        var nNombre: String

        //constructor(edad:Any)
        constructor(edad: Integer, nombre: String) {
            edadActual = edad
            nNombre = nombre
        }

        fun iniciar(edad: Integer) {
            edadActual = edad
        }

        override fun toString(): String {
            return "La edad actual es $edadActual y " +
                    "el nombre es $nNombre"

        }
    }
        class Persona2(edad: Integer, nombre: String) {
            var nEdad = edad
            var nNombre = nombre
            var nCedula: String? = null
            var nCasado: Boolean? = true

            constructor(edad2: Integer, nombre2: String, //este constructor hace que cedula no sea obligatoriamente requerido
                        cedula: String) : this(edad2, nombre2) {
                nCedula = cedula
            }

            constructor(edad2: Integer, nombre2: String, //este constructor hace que cedula no sea obligatoriamente requerido
                        cedula2: String, casado1: Boolean) : this(edad2, nombre2) {
                nCedula = cedula2
                nCasado = casado1
            }

            override fun toString(): String {
                return "La edad actual es $nEdad y " +
                        "el nombre es $nNombre"

            }
        }

        class Persona3(edad:Integer, nombre: String) {
            lateinit var nEdad: Integer
            var nNombre = nombre

            init {//Escribir código después del constructor
                iniciar(edad)
            }

            fun iniciar(edad: Integer) {//El constructor se inicia siempre primero, después el init
                nEdad = edad
            }

            override fun toString(): String {
                return "La edad actual es $nEdad y " +
                        "el nombre es $nNombre"

            }

        }

        open class Figura(nombre: String) {
            var nNombre = nombre

             init {
                 iniciar(nombre)
             }
            open fun iniciar(nombre: String) {//El constructor se inicia siempre primero, después el init
                nNombre = nombre
            }
            override fun toString(): String {
                return "La nombre de la figura es $nNombre"

            }
        }

        class Cuadrado(nombre: String, valorLado: Integer)
            : Figura(nombre) { //se llama al primer constructor (herencia)
            var nValorLado = valorLado

            init {
                iniciar(nombre)
            }

            override fun iniciar(nombre: String) {//El constructor se inicia siempre primero, después el init
                nNombre=nombre
            }
            override fun toString(): String {
                return "La valor del lado es $nValorLado y " +
                        "el nombre es $nNombre"

            }
        }
