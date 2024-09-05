package Programs;
import java.util.Scanner;
class pattern9
{
	public static void show(int n)
	{
		// sp stands for space
		// st stands for number
		int sp = n / 2, st = 1;

		// This Outer loop for number of lines
		for (int i = 1; i <= n; i++) {

			// This Inner loop for printing space
			for (int j = 1; j <= sp; j++)
				System.out.print(" ");

			// This Inner loop for printing number
			int count = st / 2 + 1;
			for (int k = 1; k <= st; k++) {
				System.out.print(count);
				if (k <= st / 2)
					count--;
				else
					count++;
			}

			System.out.println();
			if (i <= n / 2) {

				sp = sp - 1;
				st = st + 2;
			}

			else {

				sp = sp + 1;
				st = st - 2;
			}
		}
	}

	public static void main(String[] args)
	{
		int n=5;
	    show(n);
	}
}

