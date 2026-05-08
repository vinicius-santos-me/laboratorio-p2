package dirlididi;
import java.util.*;

public class Temperatura {
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	int total = 0;
	while(true) {
		int numero = sc.nextInt();
		if(numero < 0) {
			total++;
			}else if(numero == 0) {
				break;
			}
		}
	System.out.println(total);
	sc.close();
	}
}
