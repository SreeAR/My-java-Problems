import java.util.Scanner; //Importing the Scanner
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        int r1, r2,c1,c2,i,j,k,sum;//Initialasing the rows and columns of the matrices
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows in the first Matrix: ");//Takes the input from user for the Number of rows of first matrix
        r1 = in.nextInt();

        System.out.println("Enter the number columns in the first Matrix:  ");//Takes the input from  user for  the number of columns of first matrix
        c1 = in.nextInt();
        System.out.println("Enter the number of rows in the second Matrix: ");//Takes the input from  user for the number of rows of the second matrix
        r2 = in.nextInt();

        System.out.println("Enter the number of columns in the second Matrix: ");//Takes the input from user for the number of columns of  the second matrix
        c2 = in.nextInt();

        if(c1==r2)//Matrix multiplication can be done only when this condition is
        {

            int A[][] = new int[r1][c1];//Arrangement of the matrix
            int B[][] = new int[r2][c2];
            int C[][] = new int[r1][c2];

            System.out.println("Enter the elements of the first Matrix: ");

            for ( i= 0 ; i < r1 ; i++ )
            {

                for ( j= 0 ; j < c1 ;j++ )
                    A[i][j] = in.nextInt();

            }
            System.out.println("Enter the elements of the second Matrix:  ");

            for ( i= 0 ; i < r2 ; i++ )
            {

                for ( j= 0 ; j < c2 ;j++ )
                    B[i][j] = in.nextInt();

            }

            System.out.println("\n\nThe desired output matrix is :-");
            for ( i= 0 ; i < r1 ; i++ )

                for ( j= 0 ; j <c2;j++)
                {
                    sum=0;
                    for ( k= 0 ; k <r2;k++ )
                    {
                        sum +=A[i][k]*B[k][j] ;

                    }
                    C[i][j]=sum;
                }
            for ( i= 0 ; i < r1; i++ )
            {
                for ( j=0 ; j < c2;j++ )
                    System.out.print(C[i][j]+" ");

                System.out.println();
            }
        }
        else
            System.out.print("Multipication of these matrices cannot be done ");
    }

}