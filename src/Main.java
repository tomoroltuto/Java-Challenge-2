import java.util.List; 

public class Main {

	public static void main(String[] args) {
		//コレクションを生成
		List<Product> productList = List.of (new Product("焼きそば", "No.1", 500),
				                             new Product("唐揚げ", "No.2", 250),
				                             new Product("フライドポテト", "No.3", 300));
		//コレクションを全て出力
		System.out.println("①コレクションを全て出力");
		for(Product product : productList) {
				System.out.println(product.getNumber() +product.getName() + product.getCost()+ "円");
		}
		System.out.println("");
		
		//商品ナンバーから商品名と値段を出力
		System.out.println("②商品ナンバーから商品名と値段を出力");
		for(Product product : productList) {
			if(product.getNumber().equals("No.2")) {
				System.out.println("商品名: " + product.getName() + product.getCost() + "円");
			}			
		}
		System.out.println("");
		
		//Stream APIを使用してコレクションを全て出力
		System.out.println("③Stream APIを使用してコレクションの商品名だけ出力");
		productList.stream()
		 .forEach(product -> System.out.println(product.getName()));		
	}
}
