public class Looping {
	public static void main(String[] args) {
		        //=======Looping=======
        // ======= While Loop=======
        int kVal = 5;
        int factorial = 1;
        while(kVal > 1) {
            factorial *= kVal;
            kVal -= 1;
        }
        System.out.println(factorial);          // Output = 120 .. 5*4=20, 20*3=60, 60*2=120


        // ========Do-while Loop=========
        int iVal= 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 =");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 10);

        //=======For Loop=========
        for(int iVal1 =1; iVal1 < 10; iVal1 *=2) {
            System.out.println(iVal1);
        }

        // ========Arrays=======
        System.out.println("Arrays");
        float[] theVals = { 10.0f, 20.0f, 15.0f };
        float sum = 0.0f;
        for(int i = 0; i < theVals.length; i++)
            sum += theVals[i];
        System.out.println(sum);

	}
}
