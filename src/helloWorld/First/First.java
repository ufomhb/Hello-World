package helloWorld.First;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		First.doWork("meng");
		First.doWork("haibo");
		
		//getModResult
		//System.out.println(String.valueOf(getModResult(5)));
		
		//ArrayDemo
		//First.arrayInitDemo();
		
		//DynamicArrayDemo
		First.dynamicArrayInitDemo();
	}
	
	public static void doWork(String strName)
	{
		System.out.println(strName);
	}
	
	public static int getModResult(int intNum)
	{
		int intRes = 0;
		if(intNum >= 0){
			intRes = intNum % 2;
		}
		return intRes;
	}
	
	public static void arrayInitDemo()
	{
		int[] nums = {1,2,3,4,5};
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}
	
	//Dynamic Array Init
	public static void dynamicArrayInitDemo()
	{
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}
}