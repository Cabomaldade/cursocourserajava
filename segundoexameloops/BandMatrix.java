public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                	if (j != n - 1) {
                		System.out.print("*  ");
                	} else {
                		System.out.print("*");
                	}
                } else {
                	if (j != n - 1) {
                		System.out.print(0 + "  ");
                	} else {
                		System.out.print(0);
                	}
                }
            }
            if(i == n - 1){
            	break;
            }
            System.out.println();
        }
    }
}