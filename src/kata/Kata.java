
public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        
        if (input == null || input.length == 0){
            return new int[]{};
        }
        int countPositives = 0;
        int sumNegatives = 0;
        
        for (int num : input){
            if (num > 0){
                countPositives++;
            }else if (num < 0){
                sumNegatives += num;
            }
        }
        return new int[]{countPositives, sumNegatives};
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15};
        int[] result = countPositivesSumNegatives(input);
        System.out.println("Result: " +result[0]+ "," +result[1]);
    }
    
}
