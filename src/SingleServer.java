import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SingleServer 
{

	public static void main(String[] args) throws Exception 
	{
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("Interarrival Time Range : ");
		int iaRange=Integer.parseInt(br.readLine());
		
		System.out.println("IA Prob Distribution : ");
		float iaProbDist[]=new float[iaRange];
		
		for(i=0;i<iaRange;i++)
			iaProbDist[i]=sc.nextFloat();
		
		
		
		String iaRandDigString[]=br.readLine().split(",");
		int iaRD[]=new int[iaRandDigString.length];
		String tmp;
		for(i=0;i<iaRandDigString.length;i++)
		{
			tmp=iaRandDigString[i];
			
			if(tmp.length()==1)
				tmp.concat("00");
			
			if(tmp.length()==2)
				tmp.concat("0");
			
			if(tmp.length()==3)
				iaRD[i]=Integer.parseInt(tmp);
		}
		
		
		
	}

}
