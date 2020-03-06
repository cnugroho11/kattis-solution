using System;

namespace katt
{
    class Program
    {
        static void Main(string[] args)
        {
            int aa, tt = 1, cek = 0;
            aa = Convert.ToInt16(Console.ReadLine());
            String[] test = Console.ReadLine().Split(" ");
            for(int i = 0; i < aa; i++)
            {
                if(Convert.ToString(tt).Equals(test[i]) || test[i].Equals("mumble"))
                {
                    cek++;
                }
                else
                {
                    break;
                }
                tt++;
            }
            if(cek == aa)
            {
                Console.WriteLine("makes sense");
            }
            else
            {
                Console.WriteLine("something is fishy");
            }
        }
    }
}