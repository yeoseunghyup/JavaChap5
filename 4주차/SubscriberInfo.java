/**
 * �ּҷ� ���� 20130923
 * @author ������
 *
 */
class SubscriberInfo {
	/**
	 * ������� �̸�, ���̵�, ��й�ȣ, ��ȭ��ȣ, �ּ�
	 */
	String name, id, password; 
    String phoneNo, address;
    
    /**
     * ������ :��ü�� ������  ��� �̸�, ���̵�, ��й�ȣ �Է�
     * @param name : �̸�
     * @param id : ���̵�
     * @param password : ��й�ȣ
     */
   
    SubscriberInfo(String name, String id, String password) {
        this.name = name;              
        this.id = id;              
        this.password = password;              
    }
    /**
     * ������ : ��ü�� ������ ��� �̸� ,���̵�, ��й�ȣ,��ȭ��ȣ ,�ּ� �Է�
     * @param name : �̸�
     * @param id :���̵�
     * @param password :��й�ȣ
     * @param phoneNo :��ȭ��ȣ
     * @param address :�ּ�
     */
    SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
        this.name = name;              
        this.id = id;              
        this.password = password;              
        this.phoneNo = phoneNo;
        this.address = address;
    }
    /**
     * ��й�ȣ ����
     * @param password : �����ϱ� ���� ��й�ȣ
     */
    void changePassword(String password) {
        this.password = password;              
    }
    /**
     * ��ȭ��ȣ ����
     * @param phoneNo : ��ȭ��ȣ
     */
    void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    /**
     * �ּ� �Է�
     * @param address :�ּ�
     */
    void setAddress(String address) {
        this.address = address;
    }
}

