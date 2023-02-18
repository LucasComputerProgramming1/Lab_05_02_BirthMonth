public class BirthMonth {
    public static void main(String[] args) {
        //Declare Variables
        int birthMonth = 0;
        //Prompt
        System.out.println("What is your birth month?");
        //Input
        System.out.println(birthMonth);
        //Output If Valid
        if(birthMonth <= 12 && birthMonth > 0)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        //Output If Invalid
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}