
public class AccountMain {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Account obj1 = new Account("000-001","여승협",100000);

		obj1.deposit(50000);
		StringBuffer str = new StringBuffer("여승협");
		str.insert(2,"예술");
		str.append(":여승협");
		str.delete(2, 4);
		System.out.println(str);
	}

}
