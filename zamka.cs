using System;

namespace kattis
{
    class Program
    {
        static int hasil (int i)
        {
            int aa = 0;
            while(i > 0)
            {
                aa += i%10;
                i/=10;
            }
            return aa;
        }
        static void Main(string[] args)
        {
            int l, d, x;
            l = Convert.ToInt16(Console.ReadLine());
            d = Convert.ToInt16(Console.ReadLine());
            x = Convert.ToInt16(Console.ReadLine());

            for(int i = l; i <= d; ++i)
            {
                int sum = hasil(i);
                if(sum == x)
                {
                    Console.WriteLine(i);
                    break;
                }
            }
            for(int i = d; i >= l; --i)
            {
                int sum = hasil(i);
                if(sum == x)
                {
                    Console.WriteLine(i);
                    break;
                }
            }
        }
    }
}