public class Rectangle {

    // declaring private variable for the Rectangle class so that users can not easily access the variable outside this class unless they use the get and set method
    public String Name;
    private float Length;
    private float Width;

    // this is a constructor for the Rectangle class. more lile a default method when you call the rectangle class
    Rectangle(String name){
       this.Name=name;
        this.Length =1;
        this.Width = 1;

    }

    //defing a method that calculates the perimeter of the rectangle

    public float calculatePerimeter(){
        return  (Length+Width)*2;

    }

    // defing a method that calculates the area of the rectangle
    public float calculateArea(){

        return Length*Width;
    }

    // defining the getter method to retrieve the value of the private attribure "Length"

    public float getLength() {
        return this.Length;
    }

    // defining the setter method to set the value of a private attribute "Length"


    public void setLength(Float length) {
        if (!(length instanceof Float )){
            System.out.println("Enter a Length of floating type");
        } else if ((length<=0)||(length>=20)){
            System.out.println("Enter a Length greater than 0 or less than 20");
        }else {
            Length = length;
            System.out.println("The length of "+Name+" is "+Length);
        }

    }

    // defining the getter method to retrieve the value of the private attribute "width"
    public float getWidth(){
        return this.Width;
    }

    //defining the setter method for the private attribute "Width"
    public void setWidth(Float width){
        if (!(width instanceof Float)){
            System.out.println("Enter a value of floating type");
        } else if ((width<=0)||(width>=20)){
            System.out.println("Enter a Width greater than 0 or less than 20");
        }else {
            this.Width = width;
            System.out.println("The width of "+Name+" is "+Width);
        }
    }
}
