class Cmdln  // this is the program for command line arguments and pass the value while running the program i.e java Cmdln ...your choice.....
{
	public static void main(String [] args)
	{
	int n=args.length;
	System.out.println("the number of commandline arguments are "+n);
	System.out.println("the command line arguments are ");
	for(int i=0;i<n;i++)
	{
		System.out.println(args[i]);
	}
	}
}