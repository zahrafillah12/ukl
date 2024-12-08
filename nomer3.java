package susah;

public class nomer3 {
    public static void main(String[] args) {
        //int[] array = {3, 7, 3, 1, 7, 7, 5};
        int[] array = {2, 1, 3, 2, 1, 2, 4, 1};

        int elemenTerdikit = array[0];
        int jumlahTerdikit = 1;

        for (int i = 0; i < array.length; i++) {
            int jumlah = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    jumlah++;
                }
            }

            if (jumlah > jumlahTerdikit) {
                elemenTerdikit = array[i];
                jumlahTerdikit= jumlah;
            }
        }

        // Output hasil
        System.out.println("Elemen yang paling sedikit muncul adalah " 
                        + elemenTerdikit + " terdikit " 
                        + jumlahTerdikit + " kali.");
    }
}

