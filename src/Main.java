public class Main {
    public static void main(String[] args){

        Rectangle r1 =new Rectangle("Blue Rectangle");
        r1.setLength(4f);
        r1.setWidth(2.45f);

        System.out.println("\n");
        System.out.println("Formula: "+r1.getLength()+" * "+r1.getWidth());
        System.out.println("The area of "+r1.Name+" is "+ r1.calculateArea()+" and the perimeter is "+r1.calculatePerimeter());
    }

}
