using System;

namespace katt
{
    class Program
    {
        static void Main(string[] args)
        {
            String[] aa = Console.ReadLine().Split(" ");
            int a = Convert.ToInt32(aa[0]);
            int b = Convert.ToInt32(aa[1]);

            if (b < a)
            {
                int c = a;
                a = b;
                b = c;
            }
            for (int i = a+1; i < b+2; ++i) 
            {
                Console.WriteLine(i);
            }
        }
    }
}