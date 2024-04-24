package com.sagar;

public class SingletonExample {
    // Singleton is a design pattern that ensures that a class can only have one object.
    /*To create a singleton class, a class must implement the following properties:

    Create a private constructor of the class to restrict object creation outside of the class.
    Create a private attribute of the class type that refers to the single object.
    Create a public static method that allows us to create and access the object we created. Inside the method,
    we will create a condition that restricts us from creating more than one object.*/

    /*Singletons can be used while working with databases. They can be used to create a connection pool to access the database while
    reusing the same connection for all the clients*/
}

class Database{
    // reference to the object of the class
    private static  Database dbObject;

    // private constructor so that it will restrict the creation of the object outside of the class
    private Database(){

    }

    // return the reference to the only object of the class
    // Since the method is static it can be accessed using only class name
    public static Database getInstance(){
        if(dbObject == null){
            dbObject = new Database();
        }
        return dbObject;
    }

    public void getConnection(){
        System.out.println("You are connected to the database");
    }
}

class Main3{
    public static void main(String[] args) {
        Database dbObject;

        // refers to the only object of the class
        dbObject = Database.getInstance();

        dbObject.getConnection();

        /*The method getConnection() can only be accessed using the object of the Database.
        Since the Database can have only one object, all the clients can access the database through a single connection. */


    }
}

