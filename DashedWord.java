public class DashedWord
{
    public void dashV (String word)
    {
        int lent = word.length()-1;
        String dasWord = "";
        for(int i = 0; i <= lent; i++)
        {
          if(i < lent)
          {
              dasWord += (word.substring(i,(i+1)) + "-"); 
          }
          else if(i == lent)
          {
              dasWord += (word.substring(i,(i+1)));
          }
          
        }
        
        System.out.println(" Void Method :: ");
        System.out.println("Dashed word :: " + dasWord);
        
    }
    public String dashR(String word)
    {
        
        int lent = word.length()-1;
        String dasWord = "";
        for(int i = 0; i <= lent; i++)
        {
          if(i < lent)
          {
              dasWord += (word.substring(i,(i+1)) + "-"); 
          }
          else if(i == lent)
          {
              dasWord += (word.substring(i,(i+1)));
          }
        }
        System.out.println("Return Method :: ");
        return dasWord;
    }
}
