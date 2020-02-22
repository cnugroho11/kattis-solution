using System;

namespace kattis
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;
            Boolean cek1, cek2, test = false;
            String[] aa = Console.ReadLine().Split(" ");
            a = Convert.ToInt16(aa[0]);
            b = Convert.ToInt16(aa[1]);
            c = Convert.ToInt16(aa[2]);
            for(int i = 1; i <= c; i++)
            {
                if(i%a == 0) cek1 = true;
                else cek1 = false;
                if(i%b == 0) cek2 = true;
                else cek2 = false;
                if(cek1 && cek2 ==  true)
                {
                    test = true;
                    break;
                }
            }
            if (test == true) Console.WriteLine("yes");
            else Console.WriteLine("no");
        }
    }
}