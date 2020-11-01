import java.util.Iterator;

public class FizzBuzz {
    public static void main(String[] args) {

        Iterable<String> fizzbuzz = FizzBuzzIterable::new;
        int i = 0;
        for (String s : fizzbuzz){
            System.out.println(s);
        }
    }
}

class FizzBuzzIterable implements Iterator<String>{

    int i ;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next(){
        i++;
        if (i % 15 == 0) {
            return "Fizz Buzz";
        } else if (i % 3 == 0){
            return "Fizz";
        } else if (i % 5 == 0){
            return "Buzz";
        } else
            return i + "";
    }
}