package ejercicio08;

public class Main {

    public static void main(String[] args) {
        System.out.println("= Refactorización hacia Factory Method: compresores =");

        CompressorCreatorRegistry registry = new CompressorCreatorRegistry();
        String[] requestedFormats = {"zip", "tar", "gz", "rar"};

        for (String text : requestedFormats) {
            System.out.println("\n- Solicitud de compresión: " + text + " -");
            try {
                CompressionFormat format = CompressionFormat.fromText(text);
                CompressionService service = new CompressionService(registry.getCreator(format));
                service.compressFile("informe_final", 1000);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
