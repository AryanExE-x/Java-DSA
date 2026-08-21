package xUNIT1;

// byte-> short-> int-> long-> float-> double
//"Container should be bigger than the literal"

 class TypeCasting {
    public static void main(String[] args){
        float myFloat=5;        /*Widening Implicit Conversion -Coercion  //Automatic Conversion*/
        System.out.println(myFloat);

        int myInt= (int) 6.3f;       /*Narrowing Explicit Conversion- //Typecasting / Casting */
        System.out.println(myInt);
    }
}
