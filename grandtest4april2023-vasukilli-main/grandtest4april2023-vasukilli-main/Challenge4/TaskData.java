class TaskData
  {
    int id;
    String name;
    String description;
    String date;
    String status;
    public TaskData(int id,String name,String description, String date,String status){
      this.id = id;
      this.anme = name;
      this.description = description;
      this.date = date;
      this.status = status;
    }
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	public String getDate() {
		return date;
	}
	
	public String getStatus() {
		return status;
	}
	public String toString(){
    return id + " " + name + " " + description + " " + date + " " + status;
  }
    
  }