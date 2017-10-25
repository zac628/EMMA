public class Client{
	private String email;
	private String address;
	private Car[10] cars;
	private WorkOrder[10] workOrders;

	public Client(String name, String number, String email, String address){
		this.name = name;
		this.phoneNumber = number;
		this.email = email;
		this.address = address;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public String getName(){
		return this.name;
	}

	public void setNumber(String number){
		this.phoneNumber = number;
}
	
	public String getNumber(){
		return this.phoneNumber;
}

public void setEmail(String email){
	this.email = email;
}

public String getEmail(){
	return this.email;
}

public void setAddress(String address){
	this.address = address;
}
public String getAddress(){
	return this.address;
}

public void addCar(/*New car constructor*/ car){
	int index = -1;
	for(int i = 0; i < 10; i++){
		if(cars[i] = null){
			index = i;
			break;
		}
	}

	if(index = -1)
		System.out.println(�Error: Client has too many cars.�);
	else
		cars[index] = car;
}

public void removeCar(Car car){
	for(int i = 0; i < 10; i++){
		if(cars[i].getLicense().equals(car.getLicense()))
			cars[i] = null;
	}
}

public void addWorkOrder(/*New work order constructor*/ wo){
	int index = -1;
	for(int i = 0; i < 10; i++){
		if(workOrders[i] = null){
			index = i;
			break;
		}
	}

	if(index = -1)
		System.out.println(�Error: Client has too many work orders.�);
	else
		workOrders[index] = wo;
}

public void removeWorkOrder(WorkOrder wo){
	for(int i = 0; i < 10; i++){
		if(workOrders[i].getNumber() == wo.getNumber())
			workOrders[i] = null;
	}
}

public Car getCar(String license){
	for(int i = 0; i < 10; i++){
		if(cars[i].getLicense().equals(license))
			return cars[i];
	}
}

public WorkOrder getWorkOrder(int number){
	for(int i = 0; i < 10; i++){
		if(workOrders[i].getNumber() == number)
			return workOrders[i];
	}
}
}
