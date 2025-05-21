public class CLArgs {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Insufficient number of arguments.");
        } else {
            int[] arr = new int[Integer.parseInt(args[0])];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[1]) + i * Integer.parseInt(args[2]);
            }

            for(int el : arr) {
                System.out.println(el);
            }
        }
    }
}
