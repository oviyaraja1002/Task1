public class Rearrange
{
    public static void main(String[] args)
    {
        String str = "arrange";
        char[] str1 = str.toCharArray();
        for (int i=1;i<=str1.length-1;i++)
        {
            char temp = str1[i];
            str1[i] = str1[i - 1];
            str1[i - 1] = temp;
            if(str1[i]==str1[i-1])
            {
                System.out.println("string rearranged");
            }
        }
        System.out.println(str1);
    }
}
