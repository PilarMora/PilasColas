import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Pila stack = new Pila();
		Cola queue = new Cola();
		int option = 0;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Stack.");
			System.out.println("2. Queue.");
			System.out.println("0. Exit.");
			System.out.print("Choose an option: ");
			option = Integer.parseInt(in.nextLine());
			switch (option) {
				case 1:
					System.out.println("\n PILA:");
					System.out.println("1. Add item.");
					System.out.println("2. Delete item.");
					System.out.println("3. Show stack.");
					System.out.println("4. Back to menu");
					System.out.print("Choose an option: ");
					option = Integer.parseInt(in.nextLine());
					switch (option) {
						case 1:
							System.out.print("\nWrite a number you wanna add: ");
							int data = Integer.parseInt(in.nextLine());
							stack.push(data);
							break;
						case 2:
							stack.pop();
							break;
						case 3:
							stack.show();
							break;
						case 4:
							System.out.println("\n\tExit...");
							break;
						default:
							break;
					}
					break;
				case 2:
					System.out.println("\n QUEUE:");
					System.out.println("1. Add item");
					System.out.println("2. Delete item.");
					System.out.println("3. Show queue.");
					System.out.println("4. Exit.");
					System.out.print("Choose an option: ");
					option = Integer.parseInt(in.nextLine());
					switch (option) {
						case 1:
							System.out.print("\nWrite a number you wanna add: ");
							int data = Integer.parseInt(in.nextLine());
							queue.push(data);
							break;
						case 2:
							queue.pop();
							break;
						case 3:
							queue.show();
							break;
						case 4:
							System.out.println("\n\tExit...");
							break;
						default:
							break;
					}
					break;
				case 0:
					System.out.println("\n\tSee you...");
					break;
				default:
					System.out.println("\n\tInvalid option");
					break;
			}
		} while (option != 0);
		in.close();
	}
}
