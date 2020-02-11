
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! One"); //Line Comment
        System.out.println("Hello World! Two"); /* Block Comment */
        System.out.println("Hello World! Three"); /** JavaDoc Comment */

        int myVar;
        myVar = 50;
        System.out.println(myVar);                  //output 50

        int anotherVar = 100;
        System.out.println(anotherVar);             //output 100

        myVar = anotherVar;
        System.out.println(myVar);                  //output 100

        anotherVar = 200;
        System.out.println(anotherVar);             //output 200

        System.out.println(myVar);                  //output 100

        /* =======Math Order======= */
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println(result1);                // output = 19
        System.out.println(result2);                // output = 5

        int result3 = valA / valC * valD + valB;

        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);                // output = 13
        System.out.println(result4);                // output = 1

        /* =======Type Conversion======= */
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result5 = byteVal;
        short result6 = (short) (byteVal - longVal);
        double result7 = longVal - doubleVal;
        long result8 = (long) (shortVal -longVal + floatVal + doubleVal);

        System.out.println("Success");

        int nr1 = 7;
        int nr2 = 5;
        int nrMax = nr1 > nr2 ? nr1 : nr2;          // output = 7 or when Less < .. = 5
        System.out.println(nrMax);

        /* =======else if statment =======*/
        int v1 = 10;
        int v2 = 4;
        if(v1 > v2)
            System.out.println("v1 is bigger");
        else
            System.out.println("v1 is NOT bigger");

        // =======Block Statements=======
        int v3 = 20, v4 = 5, diff;
        if (v3 > v4) {
            diff = v3 - v4;
            System.out.println("v3 is Bigger");
        }
        else if (v4 > v3) {
            diff = v4 - v3;
            System.out.println("V4 is Bigger");
        }
        else
            System.out.println("V3 and v4 are equal");

    }
}
