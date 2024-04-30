package MyClasses;
import java.lang.*;
import java.util.*;

public class Customer
{
	private String nameOfCustomer;
	private int idOfCustomer;
	private String passOfCustomer;
	private int numOfCustomer;
	private String emailOfCustomer;
	private String booking;
	public int numberOfDays;
	public int numberOfPerson;
	
	public void setCustomerName(String nameOfCustomer)
	{
		this.nameOfCustomer = nameOfCustomer;
	}
	public String getCustomerName()
	{
		return nameOfCustomer;
	}
	public void setCustomerID(int idOfCustomer)
	{
		this.idOfCustomer = idOfCustomer;
	}
	public int getCustomerID()
	{
		return idOfCustomer;
	}
	public void setCustomerPassword(String passOfCustomer)
	{
		this.passOfCustomer = passOfCustomer;
	}
	public String getCustomerPassword()
	{
		return passOfCustomer;
	}
	public void setCustomerNumber(int numOfCustomer)
	{
		this.numOfCustomer = numOfCustomer;
	}
	public int getCustomerNumber()
	{
		return numOfCustomer;
	}
	public void setCustomerEmail(String emailOfCustomer)
	{
		this.emailOfCustomer = emailOfCustomer;
	}
	public String getCustomerEmail()
	{
		return emailOfCustomer;
	}

    public void setBooking(String booking)
	{
		this.booking=booking;
	}
	
	public String getBooking()
	{
		return booking;
	}

    public void setNumberOfDays(int numberOfDays)
	{this.numberOfDays=numberOfDays;}
	public int getNumberOfDays()
	{return numberOfDays;}
	
	public void setNumberOfPersons(int numberOfPerson)
	{this. numberOfPerson=numberOfPerson;}
	
	public int getNumberOfPerson()
	{return numberOfPerson;}
	
}