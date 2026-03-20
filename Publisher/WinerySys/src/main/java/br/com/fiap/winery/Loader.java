package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {

        // Serviço 1 - Estoque
        WineStockServiceImplementation stock = new WineStockServiceImplementation();
        Endpoint.publish("http://localhost:8085/WineStockService", stock);

        // Serviço 2 - Aviso
        WineWarningServiceImplementation warning = new WineWarningServiceImplementation();
        Endpoint.publish("http://localhost:8086/WineWarningService", warning);

        System.out.println("🔥 Serviços rodando!");
    }
}