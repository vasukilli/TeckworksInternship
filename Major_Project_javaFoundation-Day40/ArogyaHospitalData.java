/*Front End Foundation: Mini Project
Arogya Hospital Information Management System

Hey learner!! Remember our client Arogya Hospital, for whom we built a Java based application? They liked your work, and they are back with another project contract. This time Arogya Hospital needs some nice-looking web pages (front end) for the operators, nurses and doctors to use. Understand the requirements below and use what you learned about HTML and CSS. 

Please read the description carefully before you start implementation. Based on the success of this project, Arogya will award additional contracts to bitLabs.

The management system should have the following features: -

1.Medicine Record 
2.Patientâ€™s Registration 
3.Patientâ€™s Profile 
4.Contact us

â€¢ Medicine Record
It is used to capture the name of the medicine supplier and all the medicines supplied by them.

1.Supplier ID 
2.Supplier Name 
3.Date and time of Supply

 â€œSupplier Detailsâ€ should have  a medicine supplied by the particular Supplier.   
1.Medicine ID 
2.Medicine Name 
3.Unit price 
4.Quantity 
5.Manufacture date
6.Expiry Date

â— Patientâ€™s Registration 
1....This Module is used to register patients into the system and to admit them.

2....Assign a unique id to each patient admitted.

Add a patientâ€™s personal details:

3....The patient details should include his/her name, age, gender, Aadhar Card number, contact number, Emergency contact number, Complete address, etc.

4.....Guardian's Information: -
Add a patientâ€™s guardianâ€™s details to your application whenever there is 
5.....a new patient    admitted. The details should include his/her name, age, gender, Aadhar Card number, contact number, Complete address, etc.

6.....Insurance details: 
We should collect their insurance details (if any) like insurance membership, Insurance number, etc. 

And take â€œDate of admissionâ€ 

â— Search Patients......./////////METHODS.....
Thismodule is used to do the following:
1.View full list of patients
2.Search an entry of patient
3.Recovery and Delete 

View full list of patients
The system should show the list of patients at any point of time. Basically, the system should be dynamic and a real time system. In other words, it can provide results at any point of time without any delays. 
Search an entry of patient
The operator must be able to search for patients using any of the following information Patient ID, Patient Name, Patient City, Patient Age. For a searching by age, provide minimum age and maximum age as search input. 

Recovery and Delete
Mark the patient recovered when he or she is fully recovered using patientâ€™s ID as input. The system should also be able to delete the information of a patient when asked to, using patientâ€™s ID as input. 
 
â€¢ Contact us
In this module we should include all contact details of hospitals like Address, Phone No,	Email address, Mobile No., Customer Support, Ambulance Contact No., Website, etc.


Note: Create menu bar which includes Home, Medicine Record, Patient Registration, Patient Profile and contact us as a menu values. When we choose on the menu option display related elements . 
All the very best and Happy learning with bitLabs!! */

class ArogyaHospitalData
  {
    int patient_id;
    String name;
    int age;
    String gender;
    long adhar_number;
    long contact_number;
    long emergency_number;
    String city;
    String address;
    String date_of_admit;
    String  guardians_name;
    String guardians_addr;
    long gurdians_contact_number;

    public ArogyaHospitalData(int pi ,String n,int a,String g , long an , long cn , long en,String c , String ad , String doa ,String gna, String ga , long gcn)
    {
      patient_id = pi;
      name = n;
      age = a;
      gender = g;
      adhar_number = an;
      contact_number = cn;
      emergency_number = en;
      city = c;
      address = ad;
      date_of_admit = doa;
       guardians_name = gna;
      guardians_addr = ga;
      gurdians_contact_number = gcn;
      
    }
    public int getPatient_id(){
      return patient_id;
    }

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public long getAdhar_number() {
		return adhar_number;
	}

	public long getContact_number() {
		return contact_number;
	}

	public long getEmergency_number() {
		return emergency_number;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}
  public String getDate_of_admit() {
		return date_of_admit;
	}
    public String getGuardians_name() {
		return guardians_name;
	}

	public String getGuardians_addr() {
		return guardians_addr;
	}
  
    public long getGurdians_contact_number() {
		return gurdians_contact_number;
	}
    public String toString(){
      return patient_id + "" + name + " " + age + " " + gender + " " + adhar_number + " " + contact_number + " " + emergency_number + " " + city + " " + address + " " + date_of_admit + " " + guardians_name + " " + guardians_addr + " " + gurdians_contact_number;
    }

    
  }