class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ls=new ArrayList<>();
        for(int i=1;i<=n;i++){

        if(i%15==0){
            ls.add("FizzBuzz");

        }
        else if(i%5==0){
           ls.add("Buzz");
        }
        else if(i%3==0){
            ls.add("Fizz");

        }
        else{
            ls.add(String.valueOf(i));
        }
        }
        return ls;
    }
}