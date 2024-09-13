package task5.modul2.praktikum2;

class Vehicle {
  private String vin;

  public String getVin() {
      return vin;
  }

  public void setVin(String vin) {
      this.vin = vin;
  }
}

class Speed {
  private double max;

  public double getMax() {
      return max;
  }

  public void setMax(double max) {
      this.max = max;
  }
}

class Van extends Vehicle {
  private Speed speed;

  public Speed getSpeed() {
      return speed;
  }

  public void setSpeed(Speed speed) {
      this.speed = speed;
  }

  public void print() {
      System.out.println("Vin: " + this.getVin() + ", Max Speed: " + speed.getMax());
  }
}

class Address{
    int strNum;
    String city;
    String state;
    String country;
    
    Address(int strNum, String city, String state, String country){
        this.strNum = strNum;
        this.city = city;
        this.state = state;
        this.country = country;
    }    
}

class Student {
    int rno;
    String strName;
    Address strAddr;

    Student(int rno, String strName, Address strAddr){
        this.rno = rno;
        this.strName = strName;
        this.strAddr = strAddr;
    }
}


public class Tester {
    public static void main(String[] args) {
        Speed speed = new Speed();
        speed.setMax(120);

        Van van = new Van();
        van.setVin("abcd1233");
        van.setSpeed(speed);
        van.print();

        Address address = new Address(10, "Bareilly", "UP", "India");
        Student student = new Student(1, "Aashi", address);
        System.out.println("Roll no: " + student.rno);
        System.out.println("Name: " + student.strName);
        System.out.println("Street: " + student.strAddr.strNum);
        System.out.println("City: " + student.strAddr.city);
        System.out.println("State: " + student.strAddr.state);
        System.out.println("Country: " + student.strAddr.country);
    }
}