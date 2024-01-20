fun main() {
    // Hexadecimal 0..9,A, B, C, D, E, F
    // 0x23 = 2*16^1 + 3*16^0
    //      = 32     + 3
    //      = 35
    println(0xFF) // 255
    println(0xFF0000) // RED
    println(0x00FF00) // GREEN
    println(0x0000FF) // BLUE

    println(0x01CAFE)
    println(0x01CAFE and 0xFF0000)

    // Binary 0..1
    println(0b101) // 5
    //  0b1101
    //  0b1000
    // =  1000  ==> 8 (Decimal)
    // = 1*2^3 + 0*2^2 + 0*2^1 + 0*2^0
    // = 8  +  0  +  0  + 0
    // = 8
    println(0b1101 and 0b1000) // 8
    println(0b10000000 or 0b01111111)

}