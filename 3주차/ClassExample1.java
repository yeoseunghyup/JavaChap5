
public class ClassExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    GoodsStock obj;
	    GoodsStock obj1;
	    //obj = new GoodsStock();
	    //GoodsStock obj = new GoodsSTOCK();
	    //GoodsStock obj1 = new GoodsStock();
	    //obj.goodsCode = "52135";
	    //obj.stockNum = 200;
	    
	    obj = new GoodsStock("52135", 200);
	    obj1 = new GoodsStock("52136", 300);  
	    	    	   
	
	    
        System.out.println("��ǰ�ڵ� : " + obj.goodsCode);
        System.out.println("������ : " + obj.stockNum);
        
        obj.addStock(100);
        
        System.out.println("��ǰ�ڵ� : " + obj.goodsCode);
        System.out.println("������ : " + obj.stockNum);
        
        obj.substractStock(200);
        System.out.println("��ǰ�ڵ� : " + obj.goodsCode);
        System.out.println("������ : " + obj.stockNum);
        
	}  

}
