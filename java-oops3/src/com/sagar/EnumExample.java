package com.sagar;

/*enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE

}*/

enum Size{
    SMALL("This is small"),
    MEDIUM("This is medium");

    private final String pizzaSize;

    // enum constructor
    private Size(String pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public String getSize(){
        return pizzaSize;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.getSize());
    }
}
