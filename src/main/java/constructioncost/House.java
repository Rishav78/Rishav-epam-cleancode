package constructioncost;

import java.util.*;

public class House
{
    int material;
    double area;
    boolean fully_automated;
    double cost;

    private static final int standardMaterialCost = 1200;
    private static final int mediumStandardMaterialCost = 1500;
    private static final int highStandardMaterialCost = 1800;
    private static final int automationCost = 700;

    public House(int material,double area,Boolean option)
    {
     this.material=material;
     this.area=area;
     this.fully_automated=option;
    }

    public void calculateTotalCost()
    {
        if (this.area == 0)
            throw new RuntimeException();


        switch(this.material)
        {
            case 1:
            {
                if(fully_automated)
              this.cost=this.area*(standardMaterialCost+automationCost);
                else
                    this.cost=this.area*standardMaterialCost;

                break;
            }

            case 2:
            {
                if(fully_automated)
                    this.cost=this.area*(mediumStandardMaterialCost+automationCost);
                else
                this.cost=this.area*mediumStandardMaterialCost;

                break;
            }


            case 3:
            {
              if(this.fully_automated)
                  cost=this.area*(highStandardMaterialCost+automationCost);
              else
                  cost=this.area*highStandardMaterialCost;

              break;
            }

            default :
            {
                System.out.format("%s","wrong choice ...");
            }
        }
    }

    public void printTotalCost()
    {
     System.out.format("%s","Total cost of construction :");
     System.out.format("%s",this.cost);
    }
}