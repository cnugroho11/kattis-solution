using System;
using System.Globalization;

namespace katt
{
    class Program
    {
        static void Main(string[] args)
        {
            float nn = float.Parse(Console.ReadLine(), CultureInfo.InvariantCulture.NumberFormat);
            float hasil = (float) Math.Pow(nn, 1/nn);
            Console.WriteLine(hasil);
        }
    }
}