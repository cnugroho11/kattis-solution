using System;
using System.Collections.Generic;

namespace katt
{
    class Program
    {
        static void Main(string[] args)
        {
            int tc = Convert.ToInt32(Console.ReadLine());
            int[] hs = new int[tc];
            for (int i = 0; i < tc; i++)
            {
                HashSet<string> city = new HashSet<string>();
                int tt = Convert.ToInt32(Console.ReadLine());
                for (int j = 0; j < tt; j++)
                {
                    city.Add(Console.ReadLine());
                }
                hs[i] = city.Count;
            }
            for (int i = 0; i < tc; i++)
            {
                Console.WriteLine(hs[i]);
            }
        }
    }
}