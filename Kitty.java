public class Kitty{
  private String name;
  private int age;
  public Kitty(String StartName, int StartAge) {
    name = StartName;
    age = StartAge;
  }

    //constructor that takes the name and age of the Kitty.
  public String getName() {
    return name;
  }
  //Accessor method to get the name
  public int getAge() {
    return age;
  }
  //Accessor method to get the age
  public String toString() {
    return "The amazing " + getName();
  }
  //Accessor method to return "The amazing XXX" Where you insert the Cat's name for XXX.
  public void makeOlder(){
    age += 1;
  }
}
