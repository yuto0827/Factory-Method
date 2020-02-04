package idcard; //フレームワークから分離することを明示するためidcardという別のパッケージにする
import framework.Product;
import framework.Product.*;

public class IDCard extends Product {//Productクラスのサブクラスとして定義
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}
	public String getOwner() {
		return owner;
	}
}
