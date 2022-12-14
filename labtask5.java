import java.util.*;

class Login {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);



		String arr[][]={{"Kainat","123"},{"Ayesha","456"},{"Shahid","S41"},{"Admin","12"},{"Marium","41"}};
		String user=" ",pass=" ";


		System.out.print("\nEnter User Name:");
		String name=sc.nextLine();


		System.out.print("\nEnter Password:");
		String password=sc.nextLine();


		int i,j;
		
		for( i=0; i<arr.length; i++){
			for(j=0; j<=arr.length-5; j++){

				user=arr[i][j];
			}
				pass=arr[i][j];

				if(name.equals(user) && password.equals(pass)){
				System.out.print("\n======Login-Successfull======\n\n");
				break;
				}
			}

				if(!name.equals(user) && !password.equals(pass))
				{

					System.out.println("\n====================Incorrect Username/Password====================");					
				}

				

		



		

	}
}
