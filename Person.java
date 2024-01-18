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
        return firstname+lastname;
    }
    public static void main(String arg[])
    {
        Person b1=new Person("alice","bob",30);
        Person b2=new Person("alice","bob",25);
        System.out.println(b1.getfullname());
        System.out.println(b2.getfullname());
        int a1=b1.age;
        int a2=b2.age;
        int avg=a1+a2/2;
        System.out.println("average="+avg);
    }
 }



