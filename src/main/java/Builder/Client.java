package Builder;

public class Client
{
    public static void main(String[] args) {

     //   Builder builder = new Builder();

      /*  Builder builder=Student.getBuilder();
        builder.setName("raj");
        builder.setAge(24);
        builder.setPsp(85);
        builder.setBatch("Aug23");
        builder.setGradyear(2024);

        Student student=builder.Build();*/

        Student student=Student.getBuilder()
                .setName("Raj")
                .setAge(35)
                .setPsp(90)
                .setBatch("Aug23")
                .setGradyear(2023)
                .build();

        System.out.println("DEBUg");
    }
}
