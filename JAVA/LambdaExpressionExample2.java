import org.junit.jupiter.api.Test;


	
	
		//fail("Not yet implemented");
		interface Drawable{

			public void draw();

			}

		class LambdaExpressionExample2 {


			public static void main(String[] args) {

			int width=10;

			//with lambda

			Drawable d2=()->{

			System.out.println("Drawing "+width);

			};

			d2.draw();

			}
	}


