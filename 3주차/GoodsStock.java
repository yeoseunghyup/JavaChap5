/**
 * ��ǰ ��� Ŭ����
 * @author ��ȿ��
 *
 */
public class GoodsStock {
     // �ʵ�(�������)
	String goodsCode;
	int stockNum;
	
	//������(�⺻ ������ ����)
	
	//public GoodsStock(){}
	
	public  GoodsStock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
		
	}

	//��� �޼ҵ�
	/**
	 * ��� ���Ѵ� ��ɿ� �ش��ϴ� �޼ҵ�
	 * @param amount : �߰��ϱ� ���� ���
	 *
	 */
	void addStock(int amount){
		stockNum+=amount; //stockNum = stockNum + amount ;
	}
	/**
	 * ��� ���� ��ɿ� �ش��ϴ� �޼ҵ�
	 * @param amount : �߰��ϱ� ���� ���
	 * @return
	 */
	int substractStock(int amount){
		if(stockNum < amount){
			return 0;
		}
		stockNum-=amount; //stockNum = stockNum - amount ;
		return amount ;
		
		
	}
}
