
public class ClassExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SubscriberInfo obj1
         =new SubscriberInfo("������", "ddd " ,"1234");
	
	 obj1.setPhoneNo("010-9522-0659");
	 obj1.setAddress("��⵵ ���� �ϻ굿��");
	 
	 SubscriberInfo obj2
	 =new SubscriberInfo ("�ֿ���" ,"Eddie","1234" ,"010-0000-0000 " ,"����� ���ı� ���2��");
	 
	 //System.out.println(obj1.name + obj1.id + obj1.password + obj1.phoneNo + obj1.address)
	 System.out.println("�̸�: " +obj1.name);
	 System.out.println("���̵�: " +obj1.id);
	 System.out.println("��й�ȣ: " +obj1.password);
	 System.out.println("��ȭ��ȣ: " +obj1.phoneNo);
	 System.out.println("�ּ�: " +obj1.address);
	}

}
