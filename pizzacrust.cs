using System;

namespace kattis
{
    class Program
    {
        static void Main(string[] args)
        {
            String[] aa = Console.ReadLine().Split(' ');
            double r = Convert.ToDouble(aa[0]);
            double c = Convert.ToDouble(aa[1]);
            double hs = ((r - c) * (r - c) * 100) / (r * r);

            Console.WriteLine(hs);
        }
    }
}