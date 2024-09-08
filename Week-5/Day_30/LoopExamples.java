//LoopExamples
class LoopExamples 
{
    public static void main(String[] args) {
        // For loop example
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) 
	{
            System.out.println("Count: " + i);
        }

        // While loop example
        System.out.println("\nWhile loop example:");
        int count = 1;
        while (count <= 5) 
	{
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop example
        System.out.println("\nDo-while loop example:");
        int num = 1;
        do 
	{
            System.out.println("Count: " + num);
            num++;
        } while (num <= 5);
    }
}
