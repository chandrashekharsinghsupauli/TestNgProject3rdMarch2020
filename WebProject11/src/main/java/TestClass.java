
public class TestClass {

	public static void main(String[] args) {
		System.out.println("Start");

        int n = 5;
        for(int i=0;i<=n;i++)
        {
            for(int j=0; j<= n -1; j++)
            {
                if(j>= n-(i-1) && j<= n+(i-1))
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print("");
                }
            }

            System.out.println();
        }

        System.out.println("End");
	}
}
