public class Information {
    private String name;
    private String address;
    private String phoneNumber;
    public Information(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void getinformation(){
        System.out.println(name + " " + address + " " + phoneNumber);
    }
}
