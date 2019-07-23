public class Sample {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++)
        {
         if (i == 10)
            i = i + 2;
            break;
        }
        System.out.println("value" + i);
    }
}
