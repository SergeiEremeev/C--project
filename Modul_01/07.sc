using System.Linq.Expressions;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            {
                Console.WriteLine("����� �������� ��� ������ ����� � ��������� ���������.");
                Console.WriteLine("������� 2 �����.");
                int number1 = Convert.ToInt32(Console.ReadLine());
                int number2 = Convert.ToInt32(Console.ReadLine());

                if (number1 > number2)
                {
                    int temp = 0;
                    temp = number1;
                    number1 = number2;
                    number2 = temp;
                    for (int i = number1; i < number2; i++)
                        if (i % 2 == 0)
                            Console.WriteLine(i);
                }
                else 
                {
                    for (int i = number1; i < number2; i++)
                        if (i % 2 == 0)
                            Console.WriteLine(i);                  
                }
            }
        }
    }
}
