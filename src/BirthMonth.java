public class BirthMonth {
    public static void main(String[] args) {
        int birthMonth = 0;
        System.out.println("What is your birth month?");
        System.out.println(birthMonth);
        if(birthMonth <= 12 && birthMonth > 0)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}