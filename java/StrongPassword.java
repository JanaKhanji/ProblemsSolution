// https://www.hackerrank.com/challenges/strong-password/problem
class StrongPassword {
    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    
    
    public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";;
        String special_characters = "!@#$%^&*()-+";
     
     
        int minimumNumber = 0;
        minimumNumber += password.chars().anyMatch(c -> numbers.indexOf(c) >= 0)? 0: 1;
        minimumNumber += password.chars().anyMatch(c -> lower_case.indexOf(c) >= 0)? 0: 1;
        minimumNumber += password.chars().anyMatch(c -> upper_case.indexOf(c) >= 0)? 0: 1;
        minimumNumber += password.chars().anyMatch(c -> special_characters.indexOf(c) >= 0)? 0: 1;
        
        if (minimumNumber + n > 6) {
            return minimumNumber;
        } else {
            return 6 - n;
        }
    }

}
