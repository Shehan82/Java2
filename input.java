import java.util.*;
class input
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String input = scan.nextLine();

		String[] words = input.split(" |\\,");
		int n = words.length;
		Set<String> myset = new HashSet<String>(); 

		int i;
		int j;
		int count;
		for(i=0;i<n;i++)
		{
			myset.add(words[i]);
		}

		//System.out.println(myset(1));

		String arr[] = new String[myset.size()]; 
  
        i = 0; 
        for (String x : myset) 
            arr[i++] = x; 
  
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(words)); 

		for(i=0;i<myset.size();i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				if(arr[i].equals(words[j]))
				{
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}


	}
}