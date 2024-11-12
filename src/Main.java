public class Main {
    public static void main(String[] args) {
        ConversorBinHex conversor = new ConversorBinHex();

        String binario = "110111101010";
        String hexadecimal = conversor.convertirBinarioAHexadecimal(binario);
        System.out.println("Binario: " + binario + " -> Hexadecimal: " + hexadecimal);

        String hex = "3F5A";
        String bin = conversor.convertirHexadecimalABinario(hex);
        System.out.println("Hexadecimal: " + hex + " -> Binario: " + bin);
    }
}
