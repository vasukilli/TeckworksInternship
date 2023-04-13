class VehicleData
  {
    String vehicle_name;//appache
    String vehicle_type;//2 weeler
    String vehicle_model;//s12
    int vehicle_number;
    String vehicle_color;//red
 
    public VehicleData(String vehicle_name,String vehicle_type,String vehicle_model,int vehicle_number,String vehicle_color)
    {
      this.vehicle_name = vehicle_name;
      this.vehicle_type = vehicle_type;
      this.vehicle_model = vehicle_model;
      this.vehicle_number = vehicle_number;
      this.vehicle_color = vehicle_color;
      
   
    }

	public String getVehicle_name() {
		return vehicle_name;
	}


	public String getVehicle_type() {
		return vehicle_type;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public String getVehicle_color() {
		return vehicle_color;
	}
    public String toString(){
      return vehicle_name + " " + vehicle_type + " " + vehicle_model + " " + vehicle_color;
    }

  }
class CustomerData
  {
    String customer_name;
    Long customer_phoneNum;
    String customer_address;
    String customer_email;
    
    public CustomerData(String customer_name,Long customer_phoneNum,String customer_address,String customer_email)
    {
      this.customer_name = customer_name;
      this.customer_phoneNum = customer_phoneNum;
      this.customer_address = customer_address;
      this.customer_email = customer_email;
   
    }

	public String getCustomer_name() {
		return customer_name;
	}


	public Long getCustomer_phoneNum() {
		return customer_phoneNum;
	}


	public String getCustomer_address() {
		return customer_address;
	}

	

	public String getCustomer_email() {
		return customer_email;
	}
    public String toString(){
      return  customer_name + " " + customer_phoneNum + " " + customer_address + " " + customer_email;
    }
  
  }
class RentalData
  {
    int rental_Start_date;
    int rental_end_data;
    double rental_fee;
    
    public RentalData(int rental_Start_date,int rental_end_data,double rental_fee)
    {
      this.rental_Start_date = rental_Start_date;
      this.rental_end_data = rental_end_data;
      this.rental_fee = rental_fee;
    }

	public int getRental_Start_date() {
		return rental_Start_date;
	}

	public int getRental_end_data() {
		return rental_end_data;
	}

	public double getRental_fee() {
		return rental_fee;
	}
     public String toString(){
      return  rental_Start_date + " " + rental_end_data + " " + rental_fee ;
    }
}
