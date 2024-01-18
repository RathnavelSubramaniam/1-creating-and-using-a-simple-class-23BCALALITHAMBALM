class Person
 {
    String firstname;
    String lastname;
    int age;
    Person(String fname,String lname,int a)
    {
        firstname = fname;
        lastname = lname;
        age = a;
    }
    String getfullname()
    {
        return firstname+ " " +lastname;
    }
    public static void main(String arg[])
    {
        Person b1=new Person("Jhon","Doe",30);
        Person b2=new Person("Alice","Smith",25);
        System.out.println("Person 1:" + b1.getfullname());
        System.out.println("Person 2:" + b2.getfullname());
        double a1=b1.age;
        double a2=b2.age;
        double avg=(a1+a2)/2;
        System.out.println("Average Age:"+avg); 
    }
 }



