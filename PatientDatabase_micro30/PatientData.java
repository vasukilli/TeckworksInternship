class PatientData
  {
    int id;
    String name;
    int age;
    String health_pblm;
    public PatientData(int i,String n,int a,String h)
    {
      id = i;
      name = n;
      age = a;
      health_pblm = h;
    }
    public int getId() {
      return id;
    }
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getHealth_pblm() {
		return health_pblm;
	}
	public String toString()
    {
      return id + " " + name + " " + age + " " + health_pblm;
    }
    
  }