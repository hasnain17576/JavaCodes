

public class App3 {
    public static void main(String[] args) throws Exception {
         int[] ratings = {1, 3, 4, 2, 5, 3, 4, 4, 5, 1, 2, 3, 4, 2, 5, 3, 2, 1, 5, 4};

        int[] frequency = new int[6]; 
        for (int i = 0; i < ratings.length; i++) {
            int rating = ratings[i];
            frequency[rating]++;
        }
        System.out.println("Rating\tFrequency");
        for (int rating = 1; rating <= 5; rating++) {
            System.out.println(rating + "\t\t" + frequency[rating]);
        }
    }
}