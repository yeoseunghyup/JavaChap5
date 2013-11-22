/**
 * 상품 재고 클래스
 * @author 길효열
 *
 */
public class GoodsStock {
     // 필드(멤버변수)
	String goodsCode;
	int stockNum;
	
	//생성자(기본 생성자 생략)
	
	//public GoodsStock(){}
	
	public  GoodsStock(String goodsCode,int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
		
	}

	//멤버 메소드
	/**
	 * 재고를 더한다 기능에 해당하는 메소드
	 * @param amount : 추가하기 위한 재고량
	 *
	 */
	void addStock(int amount){
		stockNum+=amount; //stockNum = stockNum + amount ;
	}
	/**
	 * 재고를 뺀다 기능에 해당하는 메소드
	 * @param amount : 추가하기 위한 재고량
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
