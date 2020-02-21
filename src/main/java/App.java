import java.util.*;
import interest.*;
import constructioncost.*;

class App
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.format("%s","Choices\n");
        System.out.format("%s","1 - Interest\n");
        System.out.format("%s","2 - CostructionCost\n");
        System.out.format("%s"," Enter number of your choice ");

        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            {
                int principal,time;
                double rate;
                int choice2;

                System.out.format("%s","Enter principal amount\n");
                principal=sc.nextInt();

                System.out.format("%s","Enter rate of interest\n");
                rate=sc.nextDouble();

                System.out.format("%s","Enter time\n");
                time=sc.nextInt();

                System.out.format("%s","Choices\n");
                System.out.format("%s","1 - Simple Interest\n");
                System.out.format("%s","2 - Compound Interest\n");
                System.out.format("%s"," Enter number of your choice ");
                choice2=sc.nextInt();

                switch(choice2)
                {
                    case 1:
                    {
                    Interest i=new Interest(principal,rate,time);
                    SimpleInterest.calculateInterest(i);
                    i.printInterest();
                    break;
                    }

                    case 2:
                    {
                        Interest i=new Interest(principal,rate,time);
                        CompoundInterest.calculateInterest(i);
                        i.printInterest();
                        break;
                    }

                    default:
                    {
                        System.out.format("%s","Please Enter  your choice from the above list");
                    }
                }


                  break;
            }

            case 2:
            {
                int material;

                System.out.format("%s","Choices for material :\n");
                System.out.format("%s","1 - standard material \n");
                System.out.format("%s","2 - above standard \n");
                System.out.format("%s","3 - high standard \n");
                System.out.format("%s"," Enter number of your choice ");
                material=sc.nextInt();

                System.out.format("%s", "Enter total area of house\n");
                double area = sc.nextDouble();

                System.out.format("%s", "Want fully automated home ? (True/False)\n");
                Boolean option = sc.nextBoolean();

                House obj=new House(material,area,option);
                obj.calculateTotalCost();
                obj.printTotalCost();

                break;
            }

            default:
            {
                System.out.format("%s","Please Enter  your choice from the above list");
            }
        }



    }
}