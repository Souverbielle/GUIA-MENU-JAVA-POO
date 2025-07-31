public class NumerosPalindromos {
    public static void main(String[] args) {
        System.out.println("Números palíndromos entre 10 y 999:");

        for (int num = 10; num <= 999; num++) {
            String str = Integer.toString(num);
            String reverso = new StringBuilder(str).reverse().toString();
            if (str.equals(reverso)) {
                System.out.println(num);
            }
}
}
}
