public class Encryption {

    public int encryptNumber(int number) {
        // 6969
        int d4 = number % 10; // 9
        int d3 = (number / 10) % 10; // 6
        int d2 = (number / 100) % 10; // 9
        int d1 = (number / 1000); // 6

        d4 = (d4 + 7) % 10; // ( 9 + 7 ) % 10 = 6 <-> 
        d3 = (d3 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d1 = (d1 + 7) % 10;

        d1 = d1 + d3;
        d3 = d1 - d3;
        d1 = d1 - d3;

        d2 = d2 + d4;
        d4 = d2 - d4;
        d2 = d2 - d4;

        // d1 = 3 , d2 = 6, d3 = 3, d4 = 6

        int encrypted = 0;
        encrypted += (d1 * 1000);
        
        encrypted += (d2 * 100);

        encrypted += (d3 * 10);

        encrypted += (d4);

        return encrypted;
    }

    public int decryptNumber(int number) {
        int d4 = number % 10; // 9
        int d3 = (number / 10) % 10; // 6
        int d2 = (number / 100) % 10; // 9
        int d1 = (number / 1000); // 6

        d4 = (d4 + 3) % 10; // Reverse of (d4 + 7) % 10
        d3 = (d3 + 3) % 10; // Reverse of (d3 + 7) % 10
        d2 = (d2 + 3) % 10; // Reverse of (d2 + 7) % 10
        d1 = (d1 + 3) % 10; // Reverse of (d1 + 7) % 10

        d1 = d1 + d3;
        d3 = d1 - d3;
        d1 = d1 - d3;

        d2 = d2 + d4;
        d4 = d2 - d4;
        d2 = d2 - d4;

        int decrypted = 0;
        decrypted += (d1 * 1000);
        
        decrypted += (d2 * 100);

        decrypted += (d3 * 10);

        decrypted += (d4);

        return decrypted;
    }

    public static void main(String[] args) {
        Encryption encrpt = new Encryption();

        int number = 4328;

        System.out.println(encrpt.encryptNumber(number));

        System.out.println(encrpt.decryptNumber(encrpt.encryptNumber(number)));

    }
}
