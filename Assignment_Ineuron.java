package developer;

public class Assignment_Ineuron
{
	public static void main(String []asd)
	{
       int row,column,n=9;
       System.out.println();
       
       for(row=0;row<n;row++)
       {
    	   for(column=0;column<n;column++)
    	   {
    		   if(row==0 || row==n-1 || column==(n-1)/2)
    			   System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.print("  ");
    	   for(column=0;column<n;column++) 
    	   {
    		   if(column==0 || column==n-1 || row==column)
    			   System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.print("  ");
    	   for(column=0;column<n;column++)
    	   {
    		   if(row==0||row==(n-1)/2||row==n-1||column==0)
    			   System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.print("  ");
    	   for(column=0;column<n;column++)
    	   {
    		   if(column==0 && row!=n-1||column==n-1 && row!=n-1||row==n-1 && column!=0 && column!=n-1)
    			   System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.print("  ");
    	   for(column=0;column<n;column++)
       	   {
       		if(row==0 && column!=n-1||column==0||row==(n-1)/2 && column!=n-1||column==n-1 && row!=0 && row<(n-1)/2||row==column&& row>=(n-1)/2)
       			System.out.print("* ");
       		else
       			System.out.print("  ");
       	   }
    	   System.out.print("  ");
    	   for(column=0;column<n;column++)
    	   {
    		   if(row==0 && column!=0 && column!=n-1||row==n-1 &&column!=0 && column!=n-1 ||column==0 && row!=0 && row!=n-1||column==n-1 && row!=0 && row!=n-1)
    			   System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.print("  ");
    	   for(column=0;column<n;column++)
    	   {
    		   if(column==0||column==n-1||row==column)
    			   System.out.print("* ");
    		   else
    			   System.out.print("  ");
    	   }
    	   System.out.println();
       }
	}
}