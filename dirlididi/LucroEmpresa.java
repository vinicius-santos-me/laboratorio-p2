package dirlididi;
import java.util.*;

public class LucroEmpresa {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int lucro = sc.nextInt();
		int funcionarios = sc.nextInt();
		double balinhas = sc.nextDouble();
		
		int totalBalinhas = (int)(lucro % funcionarios/balinhas);
		
		System.out.println(totalBalinhas);
	}
}
