using System.Linq.Expressions;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            {
                Console.WriteLine("��������, ��� ������ ���������: 1 - ������� � ���������, 2 - ��������� � �������");
                 double number = Convert.ToInt32(Console.ReadLine());

                if (number < 1 || number > 2)
                {
                    Console.WriteLine("������: ����� ������ ���� 1 ��� 2");
                }
                else 
                {
                    Console.WriteLine("�������, ������� �� ������ ���������");
                     double Temperatura = Convert.ToInt32(Console.ReadLine());
                    switch (number)
                    {
                        case 1:
                            Console.WriteLine((Temperatura * 9 / 5) + 32);
                        break;
                        case 2:
                            Console.WriteLine((Temperatura - 32) * 5 / 9); 
                        break;
                        default:
                        break;
                    }
                }
            }
        }
    }
}
