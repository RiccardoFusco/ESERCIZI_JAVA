import java.util.Scanner;

/**
 * HelloWorld
 */
class HelloWorld {

    public static void main(String[] args) {
       
        Boolean firstRule = false;
        Boolean secondRule = false;
        Boolean thirdRule = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua password");
        String password = scanner.nextLine();
        System.out.println("La password inserita e " + password);


        if (password.length() >= 8) firstRule = true;
        
        for (int i = 0; i < password.length(); i++) {
            
            if(Character.isUpperCase(password.charAt(i))){
                secondRule = true;
            } 

            for (i = 0; i < password.length(); i++) {
                char currentChar = password.charAt(i);
                if (Character.isDigit(currentChar)) thirdRule = true;
                   
            }


            if (firstRule && secondRule && thirdRule){
                System.out.println("La password e corretta");   
            }else{
                System.out.println("La password NON e corretta");
            }
        } scanner.close();
     }
    } 
   


    
    
    
    


