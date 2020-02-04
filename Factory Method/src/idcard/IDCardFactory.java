package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	private List owners = new ArrayList();
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwners() {
		return owners;
	}
}
//createProductとregisterProductを実装
//createProductではIDCardのインスタンスを生成
//registerProductではIDCardのowner(所有者)をownersフィールドに追加