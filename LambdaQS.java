interface Eatable {
	void taste();
}
interface Flyable {
	void fly(String weather);
}
interface Addable {
	int add(int a, int b);
}


/**
 * lambda���ʽ����Ҫ���þ��Ǵ��������ڲ���ķ����﷨.	�������������
 * ��ʽ�����б�,��ʽ�����б�����ʡ����ʽ��������,�����ʽ�����б�ֻ��һ������,��ʽ�����б��Բ����() Ҳ����ʡ��
 * ��ͷ  -> ������Ӣ�ĵ�->
 * �����,��������ֻ����һ�����.lambda���ʽ����ʡ�Դ����Ļ�����
 * lambda�����ֻ��һ��return���,Ĭ�ϲ���Ҫдreturn���
 * @author zhubo2094
 *
 */
public class LambdaQS {

	public void eat(Eatable e) {
		System.out.println("�����Eatable����" + e + "e��lambda���ʽ�����Ķ���");
		e.taste();
	}
	public void drive(Flyable f) {
		System.out.println("�����ڼ�ʻ" + f );
		System.out.println("..............");
		f.fly("[�̿���ϴ]");
	}

	public void test(Addable add) {
		System.out.println("5��3�ĺ�" + add.add(5, 3));
	}
	
	
	/**
	 * lambda���ʽ������Ҳ��Ŀ������,lambda���ʽ�����ͱ����Ǻ����Ե�(�����ǽӿ�����)
	 * ����ֻ����һ�����󷽷�,��������������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaQS lq = new LambdaQS();
		lq.eat(() -> System.out.println("ƻ����ζ������"));

		lq.drive(weather -> {
			System.out.println("����������� ->" + weather);
			System.out.println("ֱ���ɻ�����ƽ��");
		});

		lq.test((a, b) -> a + b);
	}
}
