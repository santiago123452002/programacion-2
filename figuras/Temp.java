public class Temp {

    private static int xyz=10;// por que es constante y si lo pongo en num1 + num2 tira error
    public static int sum(int num1, int num2){
        return (num1+num2)*xyz;

        //el final es para que no se pueda sobreescribir 
    }
}
