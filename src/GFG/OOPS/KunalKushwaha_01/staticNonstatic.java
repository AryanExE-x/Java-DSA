package GFG.OOPS.KunalKushwaha_01;

/** STATIC-> NOT DEPENDENT ON OBJECTS, ONLY ON CLASS**/ //*OBJECT INDEPENDENT. CLASS.METHOD/VARIABLE *//
//*NON STATIC-> DEPENDS ON OBJECTS AND REQUIRES REFERENCE*//
public class staticNonstatic {
    public static void main(String [] args) {
        fun(); //this was static so no need of any object
        staticNonstatic.fun(); //OR YOU CAN USE THE CLASS AS AN REFERENCE FOR STATIC METHODS/VARIABLES

        staticNonstatic OBJECT = new staticNonstatic();
        OBJECT.greeting(); //this was non static so we needed an instance which was "OBJECT"
    }

    static void fun(){  //*this is not dependent on object*//
//!        greeting(); //you cant use this because it requires instance
        //but the function that ure using in it does not depend on instances

//TODO-  you cant access non static stuff without referencing their instances in a static context

        staticNonstatic obj = new staticNonstatic();
        obj.greeting();
    }

    //we know smth which is not static, (belongs to an object)
    void greeting(){
        System.out.println("hello");
    }
}
