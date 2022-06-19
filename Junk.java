package trickyCodes;

public class Junk {

	public static void main(String[] args) {
		for(byte line=1;line<=5;line++)
		{
		 for(byte colun=1;colun<=41;colun++)
			{
			 if(colun%6==0)                                    // TO SEPARATE BLOCKS
			 {
				 System.out.print("  ");               
			 }
			 else
			 {
				 if(colun<=5)                            
				 {
					 if(line==1||colun==3)                    // TO PRINT "T"       
					 {
						 System.out.print("* ");
					 }
					 else
						 System.out.print("  ");
				 }
				  if(colun>6 && colun <=11)                       // TO PRINT "E"
				 {
					 if(colun ==7 || line==1||line==3||line==5)
					 {
						 System.out.print("* ");
					 }
					 else
					 {
						 System.out.print("  ");
					 }
				 }
				 if(colun>12 && colun<=17)                         //TO PRINT "L"
				 {
					if(colun==13 ||line==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				 }
				 if(colun>18 && colun <=23)                 //TO PRINT "U"
				 {
					 if(colun==19 ||colun==23||line==5)
					 {
						 System.out.print("* ");
					 }
					 else
					 {
						 System.out.print("  ");
					 }
				 }
				 if(colun>24 && colun<=29)              //TO PRINT "S" 
				 {
					if(line==1||line==3||line==5||(colun==25 && line==2)||(colun==29 && line==4))
							{
						System.out.print("* ");
							}
					else
					{
						System.out.print("  ");
					}
				 }
				 if(colun>30 && colun <=35)              // TO PRINT "K"
				 {
					 if(colun==31||colun==32 && line==3||colun ==33 && line==2||colun==33 && line==4||colun==34 && line==1||colun==34 && line==5)
					 {
						 System.out.print("* ");
					 }
					 else
					 {
						 System.out.print("  ");
					 }
				 }
				 if(colun>36 && colun<=41)                    // TP PRINT "O" 
				 {
					 if(colun==37||colun==41||line==1||line==5)
					 {
						 System.out.print("* ");
					 }
					 else
					 {
						 System.out.print("  ");
					 }
				 }
			 }
			}
		 System.out.println();                               // TO PRINT LINES
		}

	}

}
