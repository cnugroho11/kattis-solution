using System;
using System.Collections;

namespace kattis
{
    class Program
    {
        public static void PrintValues( IEnumerable myList )
        {
            foreach ( Object obj in myList ) Console.WriteLine( "{0}", obj );
        }
        static void Main(string[] args)
        {
            int a,b,c = 0;
            String[] aa = new String[2];
            ArrayList ll = new ArrayList();

            while (true)
            {
                aa = Console.ReadLine().Split(" ");
                a = Convert.ToInt16(aa[0]);
                b = Convert.ToInt16(aa[1]);
                c = a + b;
                if (a == 0 && b == 0) break;
                else if (c == 13) ll.Add("Never speak again.");
                else if (a > b) ll.Add("To the convention.");
                else if (b > a) ll.Add("Left beehind.");
                else if (a == b) ll.Add("Undecided.");
            }
            PrintValues(ll);
        }
    }
}