public class Main {

    public static void main(String[] args) {
        Endereco enderecoRestauranteMat = new Endereco("62670-000", "Proximo a praca");
        Endereco enderecoRestauranteIsa = new Endereco("62670-200", "Proximo da avenida");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Ponto do Frango");
        restaurante.setCnpj("111.222.3331-11");
        restaurante.setEndereco(enderecoRestauranteMat);
        System.out.println(restaurante);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Ponto da Carne");
        restaurante2.setCnpj("000.222.3331-11");
        restaurante2.setEndereco(enderecoRestauranteIsa);
        System.out.println(restaurante2);

    }
}