package ch06.sec07.exam05;

public class Car {
	String company="토요타";
	String color;
	int price;
	
	Car(){
	}
	
	Car(String com){
		this(com,"은색");
	}
	
	Car(String company, String color){
		this(company,color,25000);
	}
	
	Car(String company,String color, int price){
	
		this.company = company;
		this.color = color;
		this.price = price;
	}
}

                  