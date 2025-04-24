package StaticMembers;

public class Calculator {
    //Pi é um mebro static final, ou seja ele é constante
    //Vale lembra que atributos static são em letras maiusculas
    //public static final double PI = 3,14159;

    public static final double PI = 3.14159;

    //Estes membros são static pq uma função static na mesma classe não aceita uso de metódos não static, No caso o Main.
    public static double circuferencia(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
