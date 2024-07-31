class Main
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        int result1 = calc.sum(4, 9);
        System.out.println(result1);

        int result2 = calc.sum(4, 9, 16);
        System.out.println(result2);

        double result3 = calc.sum(4.0, 16.9987);
        System.out.println(result3);
    }
}