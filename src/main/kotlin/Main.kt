import java.sql.SQLOutput
import java.text.DecimalFormat

fun main(args: Array<String>) {

    //Juan Camilo Garzon Capador
    //700935

    println("Quiz 1")
    var opc = 0
    var notas = arrayListOf<Double>()
    var notasMenores = arrayListOf<Double>()

    while (opc != 3){

        println("""
            
        1. Ejercicio transporte
        2. Ejercicio notas
        3. Salir
        
        Digite opcion: 
        """.trimIndent())

        opc = readln().toInt()

        when (opc){
            1->{
                val tarifa = 8500
                println("""
                    
                    Ejercicio Trayectos 

                    Digite número de trayectos: 
                """.trimIndent())
                var nTrayectos = readln().toInt()
                println("Digite su edad: ")
                var edad = readln().toInt()

                var totalViaje = (tarifa * nTrayectos)
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
                        println("\nSu total a pagar por el viaje con el 45% de Dto es de $$total")
                    } else {
                        println("\nSu total a pagar por el viaje sin Dto es de $$totalViaje")
                    }
                } else if (edad < 60){
                    println("\nSu total a pagar por el viaje es de $$totalViaje")
                }
            }
            2-> {
                println("""
                    
                    Ejercicio Notas
                    
                    Digite número de notas:
                """.trimIndent())
                var nNotas = readln().toInt()
                var nota = 0.0

                for(i in 0 until nNotas) {
                    println("Ingrese nota ${i + 1}: ")
                    nota = readln().toDouble()
                    notas.add(nota)
                }

                if (nota < 35){
                    notasMenores.add(nota)
                }
                println("""
                    
                    Que desea realizar:
                    
                    1. Promedio
                    2. Calificación mas alta
                    3. Calificación mas baja 
                    4. Promedio calificacion menor a 3.5
                    
                    Digite opción: 
                """.trimIndent())
                var opcNotas = readln().toInt()

                when (opcNotas){
                    1-> {
                        var suma:Double = 0.0
                        for (i in 0 until notas.size){
                            suma += notas [i]
                        }
                        var promedio = (suma / notas.size)
                        println(DecimalFormat("EL promedio de las notas es #.#").format(promedio))
                    }
                    2-> {
                        var notaMayor = notas.max()
                        println("La nota mas alta es $notaMayor")
                    }
                    3-> {
                        var notaMenor = notas.min()
                        println("La nota mas baja es $notaMenor")
                    }
                    4-> {
                        var sumaMenores:Double = 0.0
                        for (i in 0 until notasMenores.size){
                            sumaMenores += notasMenores [i]
                        }
                        var promedioMenores = (sumaMenores / notasMenores.size)
                        println(DecimalFormat("EL promedio de las notas menores a 3.5 es #.#").format(promedioMenores))
                    }
                    else -> println("Opción incorrecta")
                }
            }
            3-> println("Adios")
            else-> println("\nOpcion incorrecta")
        }
    }
}