using System;

namespace katt
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = Convert.ToInt32(Console.ReadLine());
            double c;
            int sum = 0;
            String[] b = Console.ReadLine().Split(" ");
            int[] bb = new int[b.Length];
            for (int i = 0; i < b.Length; i++)
            {
                bb[i] = Convert.ToInt32(b[i]);
            }
            for (int i = 0; i < bb.Length; i++)
            {
                if (bb[i] < 0)
                {
                    a--;
                    bb[i] = 0;
                }
                sum += bb[i];
            }
            c = (double) sum / a;
            Console.WriteLine(c); ;
        }
    }
}