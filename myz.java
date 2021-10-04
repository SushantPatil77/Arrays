package array2;

public class myz {

	public static void main(String[] args) {
		student s1=new student(3,"somu",41);
		student s2=new student(1,"gomya",86);
		student s3=new student(2,"somya",62);
		student s4=new student(4,"gomya",96);
		
		student [] s= {s1,s2,s3,s4};
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s.length; j++) 
			{
			   if(i<j&&s[i].maarks>s[j].maarks)	
			   {
				   student temp=s[i];
				   s[i]=s[j];
				   s[j]=temp;
				   
			   }
			}
		}
          for (int i = 0; i < s.length; i++)
          {
			System.out.println(s[i].rollNo+" "+s[i].name+" "+s[i].maarks);
		  }
	}

}
