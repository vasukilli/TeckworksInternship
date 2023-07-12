interface ArogyaHospitalInterface
  {
    void add_Patient_Details();
    void view_Patient_Details();
    void searchName();//The operator must be able to search for patients using any of the following information Patient ID, Patient Name, Patient City, Patient Age. For a searching by age, provide minimum age and maximum age as search input.
    void searchCity();
    void searchId();//NullPointerException
    void recoveryOfPatients();//Mark the patient recovered when he or she is fully recovered using patientâ€™s ID as input. The system should also be able to delete the information of a patient when asked to, using patientâ€™s ID as input. 
    void search_Age();//NullPointerException
    //This is arogyasethu contact details..
    //In this module we should include all contact details of hospitals like Address, Phone No,	Email address, Mobile No., Customer Support, Ambulance Contact No., Website, etc.
    void Contact_us();
    
  }