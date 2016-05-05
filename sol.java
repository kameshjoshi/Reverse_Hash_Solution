public class JavaApplication378 {
    
    public static void main(String[] args) {
     long hash_trello_test = 930846109532517L;

		System.out.println(reverse_hash(hash_trello_test ));

    }

    private static String reverse_hash(long hash) {
        StringBuilder code = new StringBuilder(9);
		String letters = "acdegilmnoprstuw";

		int index = 0;

		while (hash > 7) {


			if (hash % 37 == 0) {

				code.append(letters.charAt(index));
				index = 0;
				hash /= 37;

			}
			else {

				hash -= 1;
				index += 1;

			}


		}

		return code.reverse().toString();
    }
    
}