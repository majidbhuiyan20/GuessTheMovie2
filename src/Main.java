import java.util.*;
public class Main {
     String[] movies ={
             "kuch kuch hota hain",
             "the war",
             "main hoon na",
             "tiger jinda hain",
             "the lord of the rings",
             "forrest gump",
             "star wars",
             "inception",
             "the lord of the rings",
             "the matrix",
             "ek takar bow",
             "anondo osru",
             "sopner nayok",
             "monpura",
             "baba kano chakor",
            "the shawshank redemption",
            "the godfather",
            "the dark knight",
            "schindler list",
            "pulp fiction",
            "the lord of the rings",
            "the good the bad and the ugly",
            "fight club",
            "samurai",
            "star wars",
            "city of god",
            "the silence of the lambs",
            "batman begins",
            "die hard",
            "chinatown",
            "room",
            "dunkirk",
            "fargo",
            "no country for old men",
    };
    public static void main(String[] args){
        Main main = new Main();

        int movieArrayLength = main.movies.length;
        int random = (int) (Math.random()* movieArrayLength);
        String movie = main.movies[random];
        int movieSize = movie.length();
        char[] ans = new char[movieSize];
        for(int i=0;i<movieSize;i++){
            if(movie.charAt(i)!=' '){
                ans[i] = '_';
            }
            else{
                ans[i]=' ';
            }
        }
        System.out.println(ans);
        int chance =10;
        Scanner s = new Scanner(System.in);
        String faultGuess ="";
        while(chance>0){
            System.out.print("you are guessing: ");
            char input = s.next().charAt(0);
            boolean matched =false;
            for(int i=0;i<movieSize;i++){
                if(movie.charAt(i) == input){
                    ans[i] = input;
                    matched = true;
                }
            }
            if(!matched){
               chance--;

            }
            System.out.println(ans);
            System.out.println("You have guessed (" + (10-chance) + ") wrong guesses"  );
            boolean win = true;
            for(int i=0;i<movieSize;i++){
                if(ans[i] == '_'){
                    win =false;
                }
            }
            if(win){
                System.out.println("You Win");
                return;
            }
        }
        System.out.println("You loose");
    }
}
