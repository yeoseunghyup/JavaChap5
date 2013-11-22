
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SubscriberInfo obj1
         =new SubscriberInfo("여승협", "ddd " ,"1234");
	
	 obj1.setPhoneNo("010-9522-0659");
	 obj1.setAddress("경기도 고양시 일산동구");
	 
	 SubscriberInfo obj2
	 =new SubscriberInfo ("최웅권" ,"Eddie","1234" ,"010-0000-0000 " ,"서울시 송파구 잠실2동");
	 
	 //System.out.println(obj1.name + obj1.id + obj1.password + obj1.phoneNo + obj1.address)
	 System.out.println("이름: " +obj1.name);
	 System.out.println("아이디: " +obj1.id);
	 System.out.println("비밀번호: " +obj1.password);
	 System.out.println("전화번호: " +obj1.phoneNo);
	 System.out.println("주소: " +obj1.address);
	}

}
