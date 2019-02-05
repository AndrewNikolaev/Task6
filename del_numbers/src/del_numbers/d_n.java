package del_numbers;

import java.util.Scanner;

public class d_n {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("write any string with numbers and letters and press Enter");
		String str = input.nextLine();
		str = str.replaceAll("[0-9]","");
        System.out.println(str);     
    }
}
