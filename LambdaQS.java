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
 * lambda表达式的主要作用就是代替匿名内部类的繁琐语法.	他由三部分组成
 * 形式参数列表,形式参数列表允许省略形式参数类型,如果形式参数列表只有一个参数,形式参数列表的圆括号() 也可以省略
 * 箭头  -> 必须是英文的->
 * 代码块,如果代码块只包含一条语句.lambda表达式允许省略代码块的花括号
 * lambda代码块只有一条return语句,默认不需要写return语句
 * @author zhubo2094
 *
 */
public class LambdaQS {

	public void eat(Eatable e) {
		System.out.println("传入的Eatable对象" + e + "e是lambda表达式创建的对象");
		e.taste();
	}
	public void drive(Flyable f) {
		System.out.println("我正在驾驶" + f );
		System.out.println("..............");
		f.fly("[碧空如洗]");
	}

	public void test(Addable add) {
		System.out.println("5与3的和" + add.add(5, 3));
	}
	
	
	/**
	 * lambda表达式的类型也叫目标类型,lambda表达式的类型必须是函数性的(必须是接口类型)
	 * 函数只能有一个抽象方法,其他方法不限制
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaQS lq = new LambdaQS();
		lq.eat(() -> System.out.println("苹果的味道不错"));

		lq.drive(weather -> {
			System.out.println("今天的天气是 ->" + weather);
			System.out.println("直升飞机飞行平稳");
		});

		lq.test((a, b) -> a + b);
	}
}
