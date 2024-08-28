/*
* Do the following:

1. Create a method called rectangleArea(). Have it print the result of 5 x 10

2. Create another method called triangleArea(). Have it print the result of (3 x 6) / 2.

3. Create a third method called printAreaResults(). Inside of this method, invoke the previous two methods.

4. In your main() method, invoke printAreaResults().


* */
public class Main {
    public static void main(String[] args) {
        printAreaResult();

    }

    public static void printAreaResult(){
        int a = triangleArea();
        int b = rectangleArea();
        System.out.println( a + b);
    }

    public static int rectangleArea(){
        int rectArea = 5 * 10;

        System.out.println(rectArea);
        return rectArea;
    }

    public static int triangleArea(){
        int triArea = (3 * 6) / 2;

        System.out.println(triArea);
        return triArea;
    }
}
