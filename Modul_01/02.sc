namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            {
                Console.WriteLine("������� ��� �����. ������ ����� � ��� ��������, ������ ����� �������, ������� ���������� ���������");
                Console.WriteLine("����� 1:");
                float number1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("����� 2:");
                float number2 = Convert.ToInt32(Console.ReadLine());

                float result = (number1 * number2) / 100;
                Console.WriteLine(result);

                
            }
        }
    }
}
