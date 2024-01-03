package starbuzz;

public abstract class CondimentDecorator extends Beverage{    //�߻� ���ڷ�����
	public Beverage beverage;
	public abstract String getDescription(); //�߻� �޼ҵ� => ÷���� ���ڷ����Ϳ��� ���� �߰�
	
	public Size getSize() {
		return beverage.getSize();
	}
}
