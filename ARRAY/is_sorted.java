
public class is_sorted{
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4};
        System.out.println(find(arr1));
        int arr2[]={13,18,3};
        System.out.println(find(arr2));

    }

    static boolean find(int arr[])
    {
       for(int i=0; i<(arr.length-1);i++)
       {
        if (arr[i]>arr[i+1])
        {
           return false;
        }
    }
    return true;
       
    } 
    
}