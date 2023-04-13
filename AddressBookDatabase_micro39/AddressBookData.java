//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
class AddressBookData
  {
    String name;
    long phone_num;
    public AddressBookData( long p ,String n ){
      phone_num = p;
      name = n ;
  }
    public String getName() {
		return name;
	}
	
	public long getPhone_num() {
		return phone_num;
	}
    public String toString(){
      return name + " " + phone_num;
    }
	
	{
      
    }
  }