package PrototypeEx;

public class Client2
{
    public static void main(String[] args) {

        StudentRegistry studentregistry = new StudentRegistry();
        //1.Create prototype object for every batch
        fillRegistery(studentregistry);


        Student raj=studentregistry.getKey("Aug23 evening batch").clone();

        raj.setName("Rajkumar");
        raj.setAge(25);
        raj.setPsp(90);
       Student raj2=studentregistry.getKey("Aug23 evening batch").clone();
        raj2.setName("Vishnu");
        raj2.setAge(26);
        raj2.setPsp(95);

        System.out.println("DEBUG");

    }

    private static void fillRegistery(StudentRegistry studentregistry)
    {


        Student aug23eveningbatch=new Student();

        aug23eveningbatch.setBatch("Aug23 evening batch");
        aug23eveningbatch.setBatchavgpsp(75);

        studentregistry.Register("Aug23 evening batch", aug23eveningbatch);


       Student inteligentStudent=new InteligentStudent();
       inteligentStudent.setBatch("Aug23 evening batch");
       inteligentStudent.setBatchavgpsp(75);
       studentregistry.Register("Aug23 evening batch", inteligentStudent);


    }

}
