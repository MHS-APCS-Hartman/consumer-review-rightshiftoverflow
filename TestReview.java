public class TestReview {
  public static void main(String[] args)
  {
    System.out.println("Simple Review, totalSentiment: "+ Review.totalSentiment("SimpleReview.txt")); 
    //The above line prints -2.9200000000000004
    
    System.out.println("Simple Review, starRating: " + Review.starRating("SimpleReview.txt") + "\n"); 
    //The above line prints 1
        
    
    //System.out.println(Review.totalSentiment2("SimpleReview.txt"));
    //The above line prints -0.13904761904761906
    
     System.out.println("26WestReview, totalSentiment: " + Review.totalSentiment("26WestReview.txt")); 
    //The above line prints 29.04999999999999
    
     System.out.println("26WestReview, starRating: " + Review.starRating("26WestReview.txt") + "\n"); 
    //The above line prints 4
    
    System.out.println("Good Review, fakeReview: " + Review.fakeReview("good_starred.txt"));
    System.out.println("Bad Review, fakeReview: " + Review.fakeReview("bad_starred.txt") + "\n");
  
     System.out.println("Good Review, fakeReviewStronger: " + Review.fakeReviewStronger("good_starred.txt"));
    System.out.println("Bad Review, fakeReviewStronger: " + Review.fakeReviewStronger("bad_starred.txt") + "\n");
    
  }
}