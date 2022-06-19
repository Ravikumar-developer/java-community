package trickyCodes;
public class Ineuron {
	public static void main(String[] args) {
		for(byte line=1;line<=7;line++)                  
		{
			for(byte column=1;column<=55;column++)
			{
				if(column%8==0)                         // to divide into blocks
				{
					System.out.print("  ");
				}
				else
				{
					if(column<=7)                                 // to print "I"
					{
						if(line==1||line==7||column==4)
						{
							System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
					if(column>8 && column<=15)                        // to print "N"
					{
						if(column==9||column==15||column==10 && line==2
								||column==11 && line==3||column==12 && line==4
								     ||column==13 && line==5 || column==14 && line==6)
						{
							System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
					if(column>16 && column<=23)                         // to print"E"
					{
						if(column==17 ||line==1||line==4||line==7)
						{
							System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
					if(column>24 && column<=31)                        // to print "U"
					{
						if(column==25 ||column==31 ||line==7)
						{
							System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
					if(column>32 && column<=39)                            // to print "R"
					{
						if(column==33 || line==1 && column<=38||line==4 && column<=37||
								column==38 && line<=3||line==5 && column<=35||column==36 && line==6
								||column==37 && line==7)
						{
							System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
					if(column>40 &&column<=47)                               //to print "O"
					{
						if(column==41||column==47||line==1||line==7)
						{
							System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
					if(column>48 && column <=55)                             //to print "N" 
					{
						if(column==49 ||column ==55||column==50 && line==2|| column==51 && line==3
								||column==52 && line==4 ||column==53 && line==5 ||column==54 && line==6)
						{
						System.out.print("* ");
						}
						else
							System.out.print("  ");
					}
				}
			}
			System.out.println();                                       // print lines
		}
	}
}
