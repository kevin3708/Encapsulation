class Main {
    public static void main(String[] args){
        Person person1 = new Person("Arnold",18);
        person1.displayDetails();

        Patient patient1 = new Patient("Arnold",18,"Diabetes");
        patient1.setCondition("Diabetes");
        System.out.println("This person is called: " + patient1.getName() + ", their age is: " + patient1.getAge() + ", they have : " +patient1.getCondition());



        Doctor doctor1 = new Doctor("John",44,"Physician");
        doctor1.setSpecialization("Physician");
        System.out.println("This person is called: " + doctor1.getName() + ", their age is: " + doctor1.getAge() + ", they are a  : " +doctor1.getSpecialization());
        
    }
}