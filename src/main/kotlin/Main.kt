import java.sql.SQLOutput

fun main(args: Array<String>) {

    //Juan Camilo Garzon Capador
    //700935

    println("Quiz 1")
    println("\n1. Ejercicio Transporte")
    println("2. Ejecicio Notas")

    println("\nDigite opcion: ")

    var salir = false

    while (!salir){
        var opc = readln().toInt()
        when (opc){
            1->{
                var tarifa = 8500
                println("Digite número de trayectos: ")
                val nTrayectos = readln().toInt()
                println("Digite su edad: ")
                val edad = readln().toInt()

                val totalViaje = (tarifa * nTrayectos)
                if (edad > 59 ){
                    println("""
                        
                        Su total a pagar por el viaje es de $$totalViaje
                        Desea aplicar descuento del 45%
                        
                        1- SI
                        2- NO
                        
                        Digite Opción: 
                    """.trimIndent())
                    var descuento = readln().toInt()
                    if (descuento == 1){
                        val total = (totalViaje * 0.45)
                        println("Su total a pagar por el viaje con el 45% de Dto es de $$total")
                    } else {
                        println("Su total a pagar por el viaje sin Dto es de $$totalViaje")
                    }
                } else if (edad < 60){
                    println("Su total a pagar por el viaje es de $$totalViaje")
                }
            }
            2-> {
                /*println("Digite número de notas")
                val nNotas = readln().toInt()*/

                val notas = arrayOf(3.5 , 2.0 , 40 , 38 )

                println("""
                    1. Promedio Notas
                    2. Nota mas alta
                    3. Nota mas baja
                    Digite opcion: 
                """.trimIndent())

                var opcNota = readln().toInt()
            }
            else-> println("Adios")
        }
    }
}