package Cool_Crew;

public class Specifications
{
	String modelNumber;
	String acType;
	String brandName;
	String acColour;
	double acCost;
	
	public Specifications(String modelNumber,String acType,String brandName,String acColour,double acCost)
	{
		this.modelNumber = modelNumber;
		this.acType = acType;
		this.brandName = brandName;
		this.acColour = acColour;
		this.acCost = acCost;
	}
	public Specifications()
	{
		
	}
	
	
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public String getAcType() {
		return acType;
	}
	
	
	public void setAcType(String acType)
	{
		this.acType = acType;
	}
	public String getBrandName()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	public String getAcColour()
	{
		return acColour;
	}
	public void setAcColour(String acColour)
	{
		this.acColour = acColour;
	}
	public double getAcCost() 
	{
		return acCost;
	}
	public void setAcCost(double acCost)
	{
		this.acCost = acCost;
	}
	
	public double cac()
	{
		if(acCost <=0)
		{
			return -1;
		}
	   else if(acType.toLowerCase().equals("central"))
		{
			return acCost-(acCost/100)*22;
		}
		
		else if(acType.toLowerCase().equals("window"))
		{
			return acCost-(acCost/100)*19;
		}
		else if(acType.toLowerCase().equals("window"))
		{
			return acCost-(acCost/100)*19;
		}
		else if(acType.toLowerCase().equals("smart"))
		{
			return acCost-(acCost/100)*15;
		}
		else if(acType.toLowerCase().equals("ductless"))
		{
			return acCost-(acCost/100)*6;
		}
		else if(acType.toLowerCase().equals("portable"))
		{
			return acCost-(acCost/100)*8;
		}
		else if(acType.toLowerCase().equals("geothermal"))
		{
			return acCost-(acCost/100)*2;
		}
		else if(acType.toLowerCase().equals("evaporative"))
		{
			return acCost-(acCost/100)*5;
		}
		else
		{
			return -1;
		}
	}
}
