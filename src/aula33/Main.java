package aula33;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        //Expressões comparativas
        // As expressões comparativas comparam uma certa condição e retorna um true or false
        // == -> igual
        // >= -> maior ou igual
        // <= -> menor igual
        // != -> diferente
        // > -> maior
        // < -> menor

        // Expressão lógicas
        // As expressões lógicas retornar um true or false comparando todas as condições;
        // && -> e
        // O operador E compara toda expressão logica para somente assim retornar um true or false
        // Neste caso a seguir a condição da true pq toda a condição é verdade
        var x = 10;
        if(x > 5 && x==10){
            System.out.println("Verdaeiro");
        }else {
            System.out.println("Falso");
        }
        //Porém se uma condição for falsa, toda a expressão tbm sera falsa
        var y = 5;
        if (y > 5 && y < 3){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

        // || -> OU
        // O operador Ou analisa toda a expressão e se uma der true toda a expressão da true
        var gestante = true;
        var deficente = false;

        if(deficente == true || gestante == true){
            System.out.println("Tem direito de assento preferencial");
        }else {
            System.out.println("Não tem direito de assento preferencial");
        }

        // ! -> Não
        // Esse operador inverte a operação, no caso se a condição for falsa, o retorno da expressão é true
        var chovendo = true;

        if (!chovendo) {
            System.out.println("Não está chovendo");
        }else {
            System.out.println("Está chovendo");
        }
    }
}
