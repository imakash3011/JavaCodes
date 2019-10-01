class Arr1
{
	public static void main(String [] args)
	{
		int sum=0;
	int mark[]= new int[]{23,33,35,12,20}; //write the size of array if using following way of entering values
	//mark[0]=85;
	//mark[1]=91;
	//mark[2]=72;
	//mark[3]=89;
	//mark[4]=96;
	for(int i=0;i<5;i++)
	{
		sum = sum + mark[i];
	System.out.println(mark[i]);
	}
	System.out.println(sum);
	}
}