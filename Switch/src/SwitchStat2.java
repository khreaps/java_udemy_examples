public class SwitchStat2 {
    
    public static void main(String[] args) {

        char charValue = 'Z';

        switch (charValue) {
            
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue + " was found!");
               break;
        
            default:
                System.out.println(charValue + " was not found!");
                break;
        }
    }
}
