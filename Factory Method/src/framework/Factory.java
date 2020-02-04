package framework;

public abstract class Factory {
	public final Product create(String owner) { //createメソッドでProductのインスタンスを生成
		Product p = createProduct(owner);//createProductで製品を作って
		registerProduct(p);//registerProductで登録する
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract  void registerProduct (Product product);
}
