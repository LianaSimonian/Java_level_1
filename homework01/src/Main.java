import java.lang.Math;

public class Main {
    //algorithm1 of minvalue
    static long MinValue(long a,long b,long c)
    {   long min = a;
        System.out.println("find min of three numbers  " + a +" " + b + " " + c);
        if(a < b)
        {
            if(c < a)
            {
               min = c;
            }
            else
            {
                min = a;
            }
        }
        else
        {
            if(c < b)
            {
                min = c;
            }
            else
            {
                min = b;
            }
        }

        return min;
    }

    //algorithm2 of minvalue
    static long minValue(long a,long b,long c)
    {
        System.out.println("find min of three numbers  " + a +" " + b + " " + c);
        long min = a;

        if (min > b)
        {
            min = b;
        }

        if (min > c)
        {
            min = c;
        }

        return min;
    }

    //generalization of algorithm2
    //complexity O(n)
    static long minValue1(long[] arr)
    {long min = arr[0];

        for(int i =1; i<arr.length; i++)
            if( min > arr[i])
            {
                min = arr[i];
            }

        return min;
    }

    //algorithm1 of absolute maxvalue
    static long AbsMaxValue(long a,long b,long c)
    {
        System.out.println("find absolut max of three numbers  " + a + " " + b + " " + c);

        long max = Math.abs(a), a1= Math.abs(a),b1 = Math.abs(b), c1 = Math.abs(c);

        if (a1 > b1)
        {
            if(a1 > c1)
            {
                max = a1;
            }
            else
            {
               max = c1;
            }
        }
        else
        {
            if(b1 > c1)
            {
                max = b1;
            }
            else
            {
                max = c1;
            }
        }

    return max;
    }

    //algorithm2 of absolute maxvalue։this algorithm has a generalized version for N elements like minValue()
    static long absMaxValue(long a,long b,long c)
    {
        System.out.println("find absolut max of three numbers  " + a +" " + b + " " + c);
        long max = Math.abs(a), b1=Math.abs(b),  c1=Math.abs(c);

            if(max < b1)
            {
                max = b1;
            }

            if(max < c1)
            {
                max = c1;
            }

       return max;

    }

    //mathOperations: use if else statement
    static int mathOperations(int a,int b,byte opr) {
        // byte is enough to store opr values
        if (opr == 1) {
            System.out.println("find sum of numbers: " + a+ " " + b );
            return a + b;
        } else if (opr == 2) {
            System.out.println("find difference of numbers: " + a +" " + b);
            return a - b;
        } else if (opr == 3) {
            System.out.println("find multiplication of numbers :"+ a +" " + b);
            return a * b;
        } else if (opr == 4) {
            System.out.println("find division of  numbers :"+ a +" " + b);
            return a / b;
        } else {
            System.out.println("input values are " + a + " " + b +" opr is "+ opr );
            throw new ArithmeticException("value error : opr can take only 1,2,3 ,4 values ");
        }

    }

    //mathOperations:use switch statement
    static int  MathOperations(int a,int b, byte opr) {
        switch (opr) {
            case 1: {
                System.out.println("find sum of numbers: " + a + " " + b);
                return a + b;
            }
            case 2: {
                System.out.println("find difference of numbers: " + a + " " + b);
                return a - b;
            }
            case 3: {
                System.out.println("find multiplication of numbers :" + a + " " + b);
                return a * b;
            }
            case 4: {
                System.out.println("find division of  numbers :" + a + " " + b);
                return a / b;
            }
            default: {
                System.out.println("input values are " + a + " " + b + "  opr is " + opr + " \nvalue error : opr can take only 1,2,3,4 values ");
                return -1;
            }
        }
    }

    public static void main(String [] args) {
        long [] array ={1,-2,4,8,-1,11,5,9};

        System.out.println("the smallest is :" + minValue(-10,2,-5));
        System.out.println("the smallest is :" + MinValue(-10,2,-5));

        System.out.println("all elements of array:" );
        for(long x:array)
        {
            System.out.println(x );
        }

        System.out.println("the smallest is :" + minValue1(array));
        System.out.println("the absolute maxvalue is :" + absMaxValue(-10,2,-5));
        System.out.println("the absolute maxvalue is :" + AbsMaxValue(-10,2,-5));

        try {
            System.out.println("result is: " + mathOperations(10, 2, (byte) 5));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e)  ;
        }


       System.out.println("result is: " +  MathOperations(10,2,(byte)1));
    }
}
