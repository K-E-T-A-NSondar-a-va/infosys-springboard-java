import java.util.HashMap;

class Tester {
    
    public static int calculateSumOfEvenNumbers(int[] numbers){
        //Implement your code here and change the return value accordingly
        
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
        }
        
        return sum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));


        String str = "hello world";
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int max = 0;
        for(Integer i : map.values()) {
            max = Math.max(max, i);
        }

        System.out.println(max);
  
        
	}
}